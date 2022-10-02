package Animals;
//хищники

import java.util.Objects;

public class Predactors extends Mammals {
    private String typeOfFood;

    public Predactors(String name, int yearOfBirth, String livingEnviroment, int movementSpeed) {
        super(name, yearOfBirth, livingEnviroment, movementSpeed);
        this.typeOfFood = "мясо";
    }

    public void eat() {
        System.out.println("я кушаю мясо");
    }

    public void go() {
        System.out.println("я охочусь");
    }

    @Override
    public String toString() {
        return getName() +
                " (класс млекопитающее, хищники)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + getLivingEnviroment() +
                ", скорость передвижения - " + getMovementSpeed() + "км/ч "+
                ", пища - " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predactors that = (Predactors) o;
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
