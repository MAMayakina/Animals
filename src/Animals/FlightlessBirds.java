package Animals;
//нелетающие птицы

import java.util.Objects;

public class FlightlessBirds extends Birds {
    private String typeOfMovement;

    public FlightlessBirds(String name, int yearOfBirth, String livingEnviroment) {
        super(name, yearOfBirth, livingEnviroment);
        this.typeOfMovement = "ходить";
    }

    public void eat() {
        System.out.println("я кушаю зернышки");
    }

    public void go() {
        System.out.println("я гуляю");
    }

    @Override
    public String toString() {
        return getName() +
                " (класс птицы, нелетающие)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + getLivingEnviroment() +
                ", тип передвижения - " + typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightlessBirds that = (FlightlessBirds) o;
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
