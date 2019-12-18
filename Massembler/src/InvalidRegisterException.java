public class InvalidRegisterException extends RuntimeException {
    private String[] badReg;
    private int line;

    public InvalidRegisterException(int line, String... reg){
        this.line = line;
        badReg = reg;
    }

    @Override
    public String getMessage() {
        String message = "Invalid register at line: " + line + " | Registers: ";
        for (String reg:badReg){
            message = message + reg + ", ";
        }
        return message;
    }
}
