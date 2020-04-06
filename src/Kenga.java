public class Kenga extends Characters {
    public Kenga(String name, int x, int y, char symbol) throws NoNameException {
        super(name, x, y, symbol);
    }

    public void spendTimeWith(Characters character, Place place){
        System.out.println(this.getName() + " и "+ character.getName() + " проводили время у " + place.getName());
    }
    public void sayTo(Characters character){
        character.setName("Дорогой мой");
        System.out.println(this.getName() + " говорила: " + character.setAction("еще раз прыгни"));
    }
    public void goToWith(Characters character, Place place) {
        this.move(20,6,true);
        character.move(22,6,true);
        System.out.println(this.getName() + " и " + character.getName() + " пошли в " + place.getName());
    }
}
