public enum CoordsOfPlaces {
    PITWITHSAND(9, 12, 9),
    MOUSEHOLES(9,10,9),
    HOME(20, 22, 6);

    int x1, x2, y;
    CoordsOfPlaces(int x1, int x2, int y) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
    }

    public int getX1() {
        return x1;
    }
    public int getX2() {
        return x2;
    }
    public int getY() {
        return y;
    }
}
