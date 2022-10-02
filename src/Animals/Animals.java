package Animals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Animals {
    private static int counter;
    private String name;
    private int yearOfBirth;
    private static String[] ArrayNameOfAnimals = new String[0];

    public Animals(String name, int age) {
        if (CheckNewAnimal(name) == false) {
            addAnimalNameInArray(name);
            this.name = name;
            this.yearOfBirth= LocalDate.now().getYear()-age;
            counter++;
            System.out.println("Животное " + name + " добавлено.");
        } else {
            System.out.println("Животное " + name + " не может быть добавлено. Животное такого вида уже есть.");
        }
    }

    private static void addAnimalNameInArray(String name) {
        ArrayNameOfAnimals = Arrays.copyOf(ArrayNameOfAnimals, getCounter() + 1);
        ArrayNameOfAnimals[getCounter()] = name;
    }

    private static boolean CheckNewAnimal(String name) {
        boolean check = false; //такого животного нет
        for (int i = 0; i < counter; i++) {
            if (name.equals(ArrayNameOfAnimals[i])) {
                check = true;
                break;
            }
        }
        return check;
    }

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println("сплю");
    }

    @Override
    public String toString() {
        return "Животное: " +
                name +
                ", возраст - " + (LocalDate.now().getYear()-yearOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return yearOfBirth == animals.yearOfBirth && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear()-yearOfBirth;
    }

    public static int getCounter() {
        return counter;
    }
}
