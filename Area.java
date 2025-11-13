import java.util.Scanner;

class Circle{
    void area(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = s.nextFloat();
        double a =3.14*r*r;
        System.out.println("Area of Circle with radius "+r+" is "+a);
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
    }
}
