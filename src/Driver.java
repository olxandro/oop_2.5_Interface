public abstract class Driver {
    public String fio;
    public Boolean rights;
    public int experience;

    public Driver(String fio, Boolean rights, int experience) {
        this.fio = fio;
        this.rights = rights;
        this.experience = experience;
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



