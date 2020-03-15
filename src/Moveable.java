public interface Moveable {
    public int getX();
    public void setX(int x);
    public int getY();
    public void setY(int y);
    public char getSymbol();
    public boolean checkLocation(int x, int y, boolean tumb) throws MismatchCoordinates;
    public void setLocation(boolean tumb) throws MismatchCoordinates;
    public void move(int newX, int newY, boolean tumb) throws MismatchCoordinates;
}

