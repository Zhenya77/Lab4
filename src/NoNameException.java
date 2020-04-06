public class NoNameException extends RuntimeException {
    public String trouble;
    public NoNameException(String t){
        trouble = t;
    }
    public String getException() {
        return trouble;
    }
}
