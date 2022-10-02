package Animals;
//травоядные

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;


    public Herbivores(String name, int yearOfBirth, String livingEnviroment, int movementSpeed) {
        super(name, yearOfBirth, livingEnviroment, movementSpeed);
        this.typeOfFood = "трава";
    }

    public void eat() {
        System.out.println("я кушаю траву");
    }

    public void go() {
        System.out.println("я пасусь");
    }

    @Override
    public String toString() {
        return getName() +
                " (класс млекопитающие, травоядные)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + getLivingEnviroment() +
                ", скорость передвижения - " + getMovementSpeed() + "км/ч " +
                ", пища - " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }
}
