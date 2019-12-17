import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

public class Controller
{
    Massembler massembler;
    Interpreter interpreter;
//    int progCount;


    @FXML
    private TextArea inputArea;


    @FXML
    private Text typeText;
    @FXML
    private Text opcodeText;
    @FXML
    private Text functText;
    @FXML
    private Text raText;
    @FXML
    private Text rbText;
    @FXML
    private Text rdText;
    @FXML
    private Text immText;
    @FXML
    private Text destText;
    @FXML
    private Text editornotText;
    @FXML
    private Text progCountText;
    @FXML
    private Text lineCountText;


    @FXML
    private Button loadButton;
    @FXML
    private Button executeButton;
    @FXML
    private Button runButton;
    @FXML
    private Button stopButton;
    @FXML
    private TableView<Register> regView;
    @FXML
    private TableView<MemoryEntry> memoryView;



    // Add a public no-args constructor
    public Controller()
    {
    }

    @FXML
    private void initialize()
    {
//        progCount = 0;
        inputArea.promptTextProperty().setValue("Type here");
        inputArea.setFont(Font.font("Monospace", 14));

        //Registers' columns initialization.
        TableColumn<Register, String> rnameColumn = new TableColumn<>("Register");
        rnameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Register, Integer> rvalueColumn = new TableColumn<>("Value");
        rvalueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

        regView.getColumns().add(rnameColumn);
        regView.getColumns().add(rvalueColumn);

        rnameColumn.setMinWidth(120);
        rvalueColumn.setMinWidth(120);

        //Memory's columns initialization.
        TableColumn<MemoryEntry, Integer> mnameColumn = new TableColumn<>("Address");
        mnameColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        TableColumn<MemoryEntry, Integer> mvalueColumn = new TableColumn<>("Value");
        mvalueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

        memoryView.getColumns().add(mnameColumn);
        memoryView.getColumns().add(mvalueColumn);

        mnameColumn.setMinWidth(120);
        mvalueColumn.setMinWidth(120);
    }

    @FXML
    private void updateText(){
        typeText.setText(Character.toString(interpreter.getType()));
        opcodeText.setText(interpreter.getOpcode());
        functText.setText(interpreter.getFunct());
        raText.setText(interpreter.getR1());
        rbText.setText(interpreter.getR2());
        rdText.setText(interpreter.getR3());
        immText.setText(Integer.toString(interpreter.getImm()));
        destText.setText(Integer.toString(interpreter.getDest()));
        progCountText.setText(Integer.toString(interpreter.getPrevProgCount()+1));
        lineCountText.setText(Integer.toString(interpreter.getLineNumber()));
    }

    @FXML
    private void onStopButton(){
        interpreter = null;
        inputArea.setEditable(true);
        editornotText.setText("Editing mode");
    }

    @FXML
    private void highlightNext(){
    }


    @FXML
    private void onLoadClick() throws IOException {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        InputStream stream = new FileInputStream(selectedFile);
        StringBuilder builder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader
                (stream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                builder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = builder.toString();
        inputArea.setText(string);
    }

    @FXML
    private void onExecuteClick() throws IOException {
        if (interpreter == null){
            String lines = inputArea.getText() + "\n";
            massembler = new Massembler();
            interpreter = new Interpreter(massembler, lines, System.out, System.out);
            regView.getItems().clear();
            memoryView.getItems().clear();
            highlightNext();
        }
        inputArea.setEditable(false);
        editornotText.setText("Compiling mode");
        interpreter.interpretNext();
        regView.getItems().addAll(interpreter.assembler.registers);
        memoryView.getItems().addAll(massembler.mem.memory);
        updateText();
        highlightNext();
    }

    @FXML
    private void onRunClick() throws IOException {
        if (interpreter == null){
            String lines = inputArea.getText() + "\n";
            massembler = new Massembler();
            interpreter = new Interpreter(massembler, lines, System.out, System.out);
            regView.getItems().clear();
            memoryView.getItems().clear();
            updateText();
            highlightNext();
        }
        interpreter.interpretAll();
        regView.getItems().addAll(interpreter.assembler.registers);
        memoryView.getItems().addAll(massembler.mem.memory);
        updateText();
        highlightNext();
     }

}

