public class Roo extends Characters{
        public Roo(String name, int x, int y, char symbol) throws NoNameException {
            super(name, x, y, symbol);
        }
        public void practiceJumping() throws MismatchCoordinates {
        this.move(8,8, true);
        System.out.println(this.getName() + " упражнялся в прыжках: " + JumpingType.HIGH.getType()+", "  + JumpingType.LENGHT.getType()+", " + JumpingType.WIDTH.getType() + ", "+ JumpingType.DEEP.getType());
        }
        public void learnHotToFallIn(Place place) throws MismatchCoordinates {
            this.moveToPlace(place);
            System.out.println(this.getName() + " учился падать в " + place.getName());

        }
    public void learnHotToEscapeOf(Place place) throws MismatchCoordinates {
        this.move(9, 8, true);
        System.out.println(this.getName() + " учился вылезать из " + place.getName());

    }
}

