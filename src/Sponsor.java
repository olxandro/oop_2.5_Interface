import java.util.ArrayList;
import java.util.List;

public class Sponsor {
    private String name;
    private double sumSponsorship;
    private List<Car> sponsoredCar = new ArrayList<>();

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

    public List<Car> getSponsoredCar() {
        return sponsoredCar;
    }

    public void setSponsoredCar(Car car) {
        this.sponsoredCar.add(car);
    }
}
