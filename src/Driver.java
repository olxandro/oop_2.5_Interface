public abstract class Driver<A extends Car> {
    public String fio;
    public String rights;
    public int experience;
    public A car;

    public Driver(String fio, String rights, int experience, A car) throws IllegalAccessException {
        this.fio = fio;
        this.rights = rights;
        setRights(rights);
        this.experience = experience;
        this.car = car;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String  rights) throws IllegalAccessException {
        if (rights.matches("^[B,C,D]{1,1}$")) {
            this.rights = rights;
        } else {
            throw  new IllegalAccessException("Укажите тип прав!");
        }
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



