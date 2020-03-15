import org.w3c.dom.ls.LSOutput;

import javax.xml.stream.Location;

public abstract class Place {
    String name;
    CoordsOfPlaces coords;
    int[] xs;
    String[] occupiedX;
    public Place(String name, CoordsOfPlaces coords) {
        this.name = name;
        this.coords = coords;
        this.create();
        this.xs = new int[coords.getX2()-coords.getX1()];
        this.occupiedX = new String[xs.length];
    }
    public int[] getXs() {
        return xs;
    }
    public String getName() {
        return "место: " + name + "(x1="+this.coords.getX1() + ", x2=" + this.coords.getX2() + ", y=" + this.coords.getY()+")";
    }
    public void create(){
        System.out.println("Создано " + this.getName());
    }
    public void setXs(int[] xs) {
        this.xs = xs;
    }

    public String[] getOccupiedX() {
        return occupiedX;
    }

    public void setOccupiedX(String[] occupiedX) {
        this.occupiedX = occupiedX;
    }

    private static char[][] emptyLocation = new char[12][57];
    private static char[][] locationWithCharacters = new char[12][57];
    private static final String blue = "\u001B[34m";
    private static final String reset = "\u001B[0m";

    public static char[][] getEmptyLocation() {
        return emptyLocation;
    }

    public static char[][] getLocationWithCharacters() {
        return locationWithCharacters;
    }

    protected static void setLocationWithCharacters(char[][] charLocation) {
        Place.locationWithCharacters = charLocation;
    }

    protected static void loadLocation() {
        String location;
        location = "y  _____________________________________________________\n";
        location += "1 |                                                    |\n";
        location += "2 |       ✹                                            |\n";
        location += "3 |                                                    |\n";
        location += "4 |                    ___                             |\n";
        location += "5 |                   /___\\                            |\n";
        location += "6 |                ___|▒▒▒|_____                       |\n";
        location += "7 | ______        /             \\                 _____|\n";
        location += "8 |/      \\      /    ✿          \\______________/      |\n";
        location += "9 |        |░░░░| ✿         ✿                         | \n";
        location += "10|____________________________________________________|\n";
        location += "    1     6       16 18   24   28 31           44 46 50 x";
        char[] elems = location.toCharArray();
        int z = 0;
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 57; j++) {
                if (z < 12 * 57) {
                    locationWithCharacters[i][j] = elems[z];
                    emptyLocation[i][j] = elems[z];
                    z++;
                }
            }
        System.out.println("Загружена локация:\n" + location);
    }

    protected static void printLocationWithCharacters() {
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 57; j++)
                System.out.print(locationWithCharacters[i][j]);
        System.out.println();

    }

    protected static void printEmptyLocation() {
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 57; j++)
                System.out.print(emptyLocation[i][j]);
        System.out.println();
    }
}