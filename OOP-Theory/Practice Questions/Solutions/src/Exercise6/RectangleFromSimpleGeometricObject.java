package Exercise6;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double Width;
    private double Height;

    public RectangleFromSimpleGeometricObject() {
    }

    public RectangleFromSimpleGeometricObject(double w, double h, String c) {
        setWidthHeight(w, h);
        setColor(c);
    }

    public void setWidthHeight(double w, double h) {
        this.Width = w;
        this.Height = h;
    }

    public String toString() {
        return "Rectangle Details:"
                + "\nHeight: " + Height
                + "\nWidth: " + Width
                + "\nColor: " + getColor();
    }

}
