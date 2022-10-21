public class Mechaniс <A extends Car> {
    private String name;
    private String surName;
    private String companyName;
    private Car A;

    public Mechaniс(String name, String surName, String companyName) {
        this.name = name;
        this.surName = surName;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Car getA() {
        return A;
    }

    public void setA(Car a) {
        A = a;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", surName='" + surName +
                ", companyName='" + companyName +
                ", Car=" + A ;
    }

    private void makeMaintenance() {
        System.out.println("Механик " + getName() + " проводит ТО автомобиля" + A.getBrand());
    }

    private void repairCar() {
        System.out.println("Механик " + getName() + " проводит ремонт автомобиля" + A.getBrand());
    }
}
