public abstract class Driver<A extends Car> {
    public String fio;
    public Boolean rights;
    public int experience;
    public A car;

    public Driver(String fio, Boolean rights, int experience, A car) {
        this.fio = fio;
        this.rights = rights;
        this.experience = experience;
        this.car = car;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Boolean getRights() {
        return rights;
    }

    public void setRights(Boolean rights) {
        this.rights = rights;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public A getCar() {
        return car;
    }

    public void setCar(A car) {
        this.car = car;
    }

    public abstract void drivingStart();

    public abstract void stay();

    public abstract void refuil();


    @Override
    public String toString() {
        return "Водитель " + fio +
                " имеет права " + rights +
                ", и стаж вождения" + experience;
    }
}



