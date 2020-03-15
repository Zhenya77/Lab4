public class Main {
    public static void main(String args[]) throws NoNameException, MismatchCoordinates {
        Place.loadLocation();
        //мы указываем координаты поверхностей, выделенных голубым, иначе объекту тупа не на чем стоять.
        //в 4 лабе это будет реализовано как Exception, здесь просто объект не появится на карте.
        Friends friends = new Friends("Все");

        Friends.Piglet piglet = friends.new Piglet("Пятачок", 32,8,'P');;
        Kenga kenga = new Kenga("Кенга", 6,12, 'K'); //четвертый парметр, говорит о том каким символом отмечается объект на карте.
        Roo roo = new Roo("Py",2,7, 'R');

        Home home = new Home("Дом", CoordsOfPlaces.HOME);
        PitWithSand pit = new PitWithSand("Большая Яма С Песком", CoordsOfPlaces.PITWITHSAND);
        MouseHoles holes = new MouseHoles("Мышиные Норы", CoordsOfPlaces.MOUSEHOLES);
        Place.printLocationWithCharacters();

        friends.find(kenga);
        piglet.toOpenAndCloseMouth();
        kenga.spendTimeWith(roo, pit);
        roo.setName("Крошка Ру");
        roo.practiceJumping();//координата Ру поменялась, так как он прыгает в яме. Если выводить метод Place.printLocationWithCharacters() картинка будет меняться, просто спамить не хочется
        roo.learnHotToFallIn(holes);//координата Ру поменялась, так как он прыгает в нору
        roo.learnHotToEscapeOf(holes);//координата Ру поменялась, так как он выбирается из норы
        System.out.println(kenga.setAction("волновалась"));
        kenga.sayTo(roo);
        roo.setName("Ру");
        kenga.goToWith(roo, home);
        Friends.WinnieThePooh winnie = friends.new WinnieThePooh("Винни Пух",17, 6,'W'){//анонимный класс
            public String toString() {
                return "Создан мишка: " + this.getNameWithSymbol();
            }
        };
        Friends.Rabbit rabbit = friends.new Rabbit("Кроллик", 33, 8,'O');
        rabbit.appearWith(piglet);
        rabbit.sayWith(piglet);
        Place.printLocationWithCharacters();
        System.out.println(roo.setAction("приграсил посмотреть, как ") + roo.setAction("прыгает"));
    }
}
