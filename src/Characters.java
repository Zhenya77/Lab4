public class Characters extends Entity implements Moveable {
    int x;
    int y;
    char symbol;

    public Characters(String name, int x, int y, char symbol) throws NoNameException {
        super(name);
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.create();
        this.setLocation(false);
    }
    public void create(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Создан персонаж: " + this.getNameWithSymbol();
    }

    @Override
    public String getName() {
        return this.name + "(x=" + this.getX() + ", y=" + this.getY() +  ")";
    }
    public String getNameWithSymbol(){
        return this.name + "(x=" + this.getX() + ", y=" + this.getY() + ", символ:\"" + this.getSymbol() + "\")";
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean checkLocation(int x, int y, boolean tumb) {
        if (((1 <= x && x <= 6) || (46<= x && x <=50)) && y==7 ) return true;
        else if (((16 <= x && x <= 18) || (24<= x && x <=28)) && y==6 ) return true;
        else if (31 <= x && x <= 44 && y==8 ) return true;
        else {
            if (tumb){return false;}
            else throw new MismatchCoordinates();
        }
    }

    public void setLocation(boolean tumb) throws MismatchCoordinates {// параметр показывает нужна ли проверка на горизонтальность плоскости
        x = this.getX();
        y = this.getY();
        if (tumb || this.checkLocation(x, y, false)){
            char[][] temp = Place.getLocationWithCharacters();
            temp[y][x+3] = this.getSymbol();
            Place.setLocationWithCharacters(temp);
        }
    }
    public void move(int newX, int newY, boolean tumb) throws MismatchCoordinates { //третий параметр показывает нужна ли проверка на горизонтальность плоскости
        if ( this.checkLocation(newX, newY, tumb) | tumb){
            char[][] tempLocationWithCharacters = Place.getLocationWithCharacters();
            tempLocationWithCharacters[this.getY()][this.getX()+3] = Place.getEmptyLocation()[this.getY()][this.getX()+3];
            Place.setLocationWithCharacters(tempLocationWithCharacters);
            this.setX(newX);
            this.setY(newY);
            this.setLocation(tumb);
        }
    }
    public void moveToPlace(Place place) {
        int newX=0;
        int newY = place.coords.getY();
        int n = place.coords.getX2()-place.coords.getX1();
        int[] xs = new int[n];
        String[] busyXs = new String[n];
        for (int i=0;i<n;i++) {
            place.xs[i] = place.coords.getX1() + i;
            busyXs[i] = " ";
        }
        for (int i=0;i<n;i++){
            if(busyXs[i]==("!")){}
            else{
                busyXs[i] = "!";
                newX = xs[i];
            }
        }
        place.setXs(xs);
        place.setOccupiedX(busyXs);
        System.out.println(n);
        this.move(newX, newY, true);
    }

}
