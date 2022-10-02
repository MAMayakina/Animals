package Animals;
//земноводные

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnviroment;

    public Amphibians(String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.livingEnviroment = "наземные и водные экосистемы";
    }

    public void eat() {
        System.out.println("я что-то ловлю");
    }

    public void go() {
        System.out.println("я охочусь");
    }

    @Override
    public String toString() {
        return getName() +
                " (класс земноводные)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + livingEnviroment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnviroment, that.livingEnviroment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnviroment);
    }

    public String getLivingEnviroment() {
        return livingEnviroment;
    }

    public void setLivingEnviroment(String livingEnviroment) {
        if (livingEnviroment != null && !livingEnviroment.isEmpty() && !livingEnviroment.isBlank()) {
            this.livingEnviroment = livingEnviroment;
        }
    }
}
