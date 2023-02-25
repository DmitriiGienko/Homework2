package driver;

import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private final int experience;
    private final String typeOfDriverLicense;

    public Driver(String fullName, int experience, String typeOfDriverLicense) {
        this.fullName = fullName;
        this.experience = experience;
        this.typeOfDriverLicense = typeOfDriverLicense;
    }

    abstract void startMoving();

    abstract void stopMoving();

    abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

    public String getTypeOfDriverLicense() {
        return typeOfDriverLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(typeOfDriverLicense, driver.typeOfDriverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, experience);
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName +
                ", стаж: " + experience +
                ", наличае водительских прав категории: " + typeOfDriverLicense;
    }
}
