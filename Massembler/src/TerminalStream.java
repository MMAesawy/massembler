import java.io.IOException;
import java.io.OutputStream;

public class TerminalStream extends OutputStream {

    private StringBuilder string = new StringBuilder();
    @Override
    public void write(int x) throws IOException {
        this.string.append((char) x );
    }

    public String toString(){
        return this.string.toString();
    }

}
