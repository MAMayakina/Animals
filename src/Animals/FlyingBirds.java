package Animals;
//летающие птицы

import java.util.Objects;

public class FlyingBirds extends Birds {
    private String typeOfMovement;

    public FlyingBirds(String name, int yearOfBirth, String livingEnviroment) {
        super(name, yearOfBirth, livingEnviroment);
        this.typeOfMovement = "летать";
    }

    public void eat() {
        System.out.println("я кушаю кого поймаю");
    }

    public void go() {
        System.out.println("я летаю");
    }

    @Override
    public String toString() {
        return getName() +
                " (класс птицы, летающие)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + getLivingEnviroment() +
                ", тип передвижения - " + typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBirds that = (FlyingBirds) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }
}
