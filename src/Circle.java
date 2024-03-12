public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public String toString(){
        return "Circle(" + radius + ")";
    }
    public static double getArea(double radius){
       return radius = 2 * Math.PI;
    }
}
