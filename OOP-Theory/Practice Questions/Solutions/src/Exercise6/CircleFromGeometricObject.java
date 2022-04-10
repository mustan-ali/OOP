package Exercise6;

public class CircleFromGeometricObject extends SimpleGeometricObject {
    private double Radius;

    public CircleFromGeometricObject() {
    }

    public CircleFromGeometricObject(double r, String c) {
        this.Radius = r;
        setColor(c);
    }

    public String toString() {
        return "Circle Details:"
                + "\nRadius: " + Radius
                + "\nColor: " + getColor();
    }
}
