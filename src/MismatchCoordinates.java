public class MismatchCoordinates extends Exception {
    public String trouble;
    public MismatchCoordinates(String t){
        trouble = t;
    }
    public String getException() {
        return trouble;
    }
}
