package Animals;
//млекопитающие

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnviroment;
    private int movementSpeed;

    public Mammals(String name, int yearOfBirth, String livingEnviroment, int movementSpeed) {
        super(name, yearOfBirth);
        this.livingEnviroment = livingEnviroment;
        this.movementSpeed = movementSpeed;
    }

    public abstract void eat();

    public abstract void go();

    @Override
    public String toString() {
        return getName() +
                " (класс млекопитающие)" +
                ", возраст - " + getAge() +
                ", среда обитания - " + livingEnviroment +
                ", скорость передвижения - " + movementSpeed + "км/ч ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnviroment, mammals.livingEnviroment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnviroment, movementSpeed);
    }

    public String getLivingEnviroment() {
        return livingEnviroment;
    }

    public void setLivingEnviroment(String livingEnviroment) {
        if (livingEnviroment != null && !livingEnviroment.isEmpty() && !livingEnviroment.isBlank()) {
            this.livingEnviroment = livingEnviroment;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed >= 0){
            this.movementSpeed = movementSpeed;
        }
    }
}
