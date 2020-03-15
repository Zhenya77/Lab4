public enum JumpingType {
    LENGHT("в длину"),
    HIGH("в высоту"),
    WIDTH("в ширину"),
    DEEP("в глубину");
    String type;
    JumpingType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
