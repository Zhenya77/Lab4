public class Friends{//вложенные классы
    String name;
    public Friends(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public class Piglet extends Characters {

        public Piglet(String name, int x, int y, char symbol) throws NoNameException, MismatchCoordinates {
            super(name, x, y, symbol);
        }


        public void toOpenAndCloseMouth() { //локальный класс
            class Mouth {
                boolean open;

                public void close() {
                    open = false;
                }

                public void open() {
                    open = true;
                }
            }
            Mouth mouth = new Mouth();
            System.out.println(this.getName() + "держал свой рот открытым");
            mouth.open();
            System.out.println(this.getName() + "держал свой рот закрытым");
            mouth.close();
        }
    }
    public class WinnieThePooh extends Characters {
        public WinnieThePooh(String name, int x, int y, char symbol) throws NoNameException, MismatchCoordinates {
            super(name, x, y, symbol);
        }

    }
    public class Rabbit extends Characters {
        public Rabbit(String name, int x, int y, char symbol) throws NoNameException, MismatchCoordinates {
            super(name, x, y, symbol);
        }
        public void sayWith(Characters character){
            Speech speech = new Speech();
            System.out.println(this.getName()+" и "+ character.getName() + "сказали:"  + speech.replic1 +" и "+ speech.replic2);
        }
        public void appearWith(Characters character) throws MismatchCoordinates {
            this.move(26,6,true);
            character.move(28,6,true);
            System.out.println(this.getName()+" и "+ character.getName() + "появились с другой стороны холма");
        }

    }
    static class Speech{ //вложенный статический класс
        String replic1 = "Добрый день, Ру";
        String replic2 = "Привет, Ру";

    }
    public void find(Characters character){
        System.out.println(this.getName()+ " искали " + character.getName());
    }
}