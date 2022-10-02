package Animals;
//птицы

import java.util.Objects;

public abstract class Birds extends Animals {
    private String livingEnviroment;

    public Birds(String name, int yearOfBirth, String livingEnviroment) {
        super(name, yearOfBirth);
        this.livingEnviroment = livingEnviroment;
    }

    public abstract void eat();

    public abstract void go();

    @Override
    public String toString() {
        return getName() +
                " (класс птицы)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + livingEnviroment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnviroment, birds.livingEnviroment);
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
