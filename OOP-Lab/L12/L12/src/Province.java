import java.util.ArrayList;

public class Province {
    private String name;
    private ArrayList<City> cities;

    public Province(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}
