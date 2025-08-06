package programs;

 class AreaCircle {
	double radius = 5.0;  

    void Area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }}

public class AreaCircle2{
    public static void main(String[] args) {
    	AreaCircle c = new AreaCircle();
        c.Area(); 
    }


}
