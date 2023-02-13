package driver;

public class DriverC extends Driver {

    public DriverC(String fullName, int experience, String typeOfDriverLicence) {
        super(fullName, experience, typeOfDriverLicence);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель %s начал движение\n", super.getFullName());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель %s остановился\n", super.getFullName());
    }

    @Override
    public void refuelCar() {
        System.out.printf("Водитель %s заправляет грузовик\n", super.getFullName());
    }


    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public String getTypeOfDriverLicense() {
        return super.getTypeOfDriverLicense();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

