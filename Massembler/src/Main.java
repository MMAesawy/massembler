import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample_new.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Massembler");
        stage.setScene(scene);
        scene.setRoot(root);
        stage.show();
    }
}
