package technicalSupport;

public class Mechanic {
    private String fullName;
    private String nameOfCompany;

    public Mechanic(String fullName, String nameOfCompany) {
        this.fullName = fullName;
        this.nameOfCompany = nameOfCompany;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public void performMaintenance() {
        System.out.printf("Механик %s техобслуживание произвел\n", getFullName());
    }

    public void fixCar() {
        System.out.printf("Механик %s выполнил ремонт\n", getFullName());
    }

    @Override
    public String toString() {
        return "Механик: " + fullName + ". Компания: " + nameOfCompany;
    }

}
