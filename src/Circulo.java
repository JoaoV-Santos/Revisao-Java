import java.math.*;

public class Circulo {
    private double radius = 1.0;
    private String color = "red";

    public void Circle() {

    }

    public void Circle(double r) {

    }

    public double getRadius(double area) {
        double radius = Math.sqrt(area / 3.1415);
        return radius;
    }

    public double getArea(double radius) {
        double area = (3.1415 * Math.pow(radius, 2));
        return area;
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

//        circulo1.getArea();
//        circulo2.getRadius();
    }
}


