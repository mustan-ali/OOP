package Exercise6;

public class TestCircleRectangle {

    public static void main(String[] args) {

        CircleFromGeometricObject c = new CircleFromGeometricObject(1.3, "blue");
        System.out.println(c.toString());

        RectangleFromSimpleGeometricObject r = new RectangleFromSimpleGeometricObject(2.5, 3.5, "red");
        System.out.println(r.toString());

    }
}