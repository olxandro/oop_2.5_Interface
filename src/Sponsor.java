import java.util.*;

public class Sponsor {
    private String name;
    private double sumSponsorship;
    private Set<Car> sponsoredCar = new HashSet<>();

    public Sponsor(String name, double sumSponsorship) {
        this.name = name;
        this.sumSponsorship = sumSponsorship;
    }

    public String getName() {
        return name;
    }

    public double getSumSponsorship() {
        return sumSponsorship;
    }

    public Set<Car> getSponsoredCar() {
        return sponsoredCar;
    }

    public void setSponsoredCar(Car car) {
        this.sponsoredCar.add(car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.sumSponsorship, sumSponsorship) == 0 && Objects.equals(name, sponsor.name) && Objects.equals(sponsoredCar, sponsor.sponsoredCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sumSponsorship, sponsoredCar);
    }
}
