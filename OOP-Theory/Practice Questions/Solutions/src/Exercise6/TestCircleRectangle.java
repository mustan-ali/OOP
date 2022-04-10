package Exercise6;

public class TestCircleRectangle {

    public void Circle() {
        CircleFromGeometricObject c = new CircleFromGeometricObject(1.3, "blue");
        System.out.println(c.toString());
    }

    public void Rectangle() {
        RectangleFromSimpleGeometricObject r = new RectangleFromSimpleGeometricObject(2.5, 3.5, "red");
        System.out.println(r.toString());
    }

}
