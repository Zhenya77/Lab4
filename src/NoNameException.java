public class NoNameException extends Throwable {
    public String trouble;
    public NoNameException(String t){
        trouble = t;
    }
    public String getException() {
        return trouble;
    }
}
