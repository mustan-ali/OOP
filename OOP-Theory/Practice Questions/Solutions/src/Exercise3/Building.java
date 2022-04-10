package Exercise3;

public class Building {
    public int Floors;
    public double Area;
    public int Occupants;

    public double AreaPerPerson() {
        return (Area * Floors) / Occupants;
    }

}
