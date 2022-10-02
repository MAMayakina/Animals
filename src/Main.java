import Animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 4, "саванна", 105);
        Herbivores giraffe = new Herbivores("Жираф", 5, "Африка", 55);
        Herbivores horse = new Herbivores("Лошадь", 6, "луга, степи, саванны", 50);
        Predactors hyena = new Predactors("Гиена", 2, "пустыни и леса Африки", 50);
        Predactors tiger = new Predactors("Тигр", 7, "разнообразные условия (леса, тропики, пустыни, саванны, горы)", 60);
        Predactors bear = new Predactors("Медведь", 8, "разнообразные условия (от слепей, до высокогорий, от лесов до актических льдов)", 70);
        Amphibians frog = new Amphibians("Лягушка", 1);
        Amphibians snakeFreshwater = new Amphibians("Уж пресноводный", 1);
        FlightlessBirds peacock = new FlightlessBirds("Павлин", 2, "разнообразные условия (леса, саванны, горы)");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 3, "в основном Антарктика");
        FlightlessBirds dodoBird = new FlightlessBirds("Птица додо", 1, "нигде (вымерла), ранее о.Маврикий");
        FlyingBirds seagull = new FlyingBirds("Чайка", 1, "около водоемов");
        FlyingBirds allbatross = new FlyingBirds("Альбатрос", 1, "Южное полушарие, в основном Антарктика");
        FlyingBirds falcon = new FlyingBirds("Сокол", 2, "разнообразные условия (пустыня, тундра, тайга, саванны, леса и т.д.)");

        //Пробуем добавить сущестующее животное
        Predactors tiger2 = new Predactors("Тигр", 7, "разнообразные условия (леса, тропики, пустыни, саванны, горы)", 0);

        System.out.println();
        System.out.println("Общая информация:");
        System.out.println(gazelle);
        System.out.println(hyena);
        System.out.println(frog);
        System.out.println(peacock);
        System.out.println(seagull);


        System.out.println();
        System.out.println("Примеры методов:");
        gazelle.eat();
        tiger.go();
        snakeFreshwater.eat();
        falcon.go();
    }
}