package Interface;

import java.util.*;

interface Shape {
    void area();
    void perimeter();
}

class Demo implements Shape {
    Scanner s = new Scanner(System.in);
    int len, bre, r;

    public void area() {
        System.out.print("Enter radius of circle: ");
        r = s.nextInt();

        System.out.print("Enter length and breadth of rectangle: ");
        len = s.nextInt();
        bre = s.nextInt();

        double area_circle = 3.14 * r * r;
        int area_rectangle = len * bre;

        System.out.println("Area of Circle: " + area_circle);
        System.out.println("Area of Rectangle: " + area_rectangle);
    }

    public void perimeter() {
        System.out.print("Enter radius of circle: ");
        r = s.nextInt();

        System.out.print("Enter length and breadth of rectangle: ");
        len = s.nextInt();
        bre = s.nextInt();

        double peri_circle = 2 * 3.14 * r;
        int peri_rectangle = 2 * (len + bre);

        System.out.println("Perimeter of Circle: " + peri_circle);
        System.out.println("Perimeter of Rectangle: " + peri_rectangle);
    }

    public static void main(String[] args) {
        Shape s = new Demo();
        s.area();
        s.perimeter();
    }


}



