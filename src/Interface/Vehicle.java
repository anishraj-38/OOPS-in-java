package Interface;

import java.util.*;

interface Vehicle {
    void Car();
    void Bike();
}

class A implements Vehicle {
    Scanner s = new Scanner(System.in);

    String name;
    int modelnumber;

    public void Car() {
        System.out.print("Enter the name of the Car: ");
        name = s.nextLine();
        System.out.print("Enter the model number of the Car: ");
        modelnumber = s.nextInt();
        System.out.println("Bike Name: " + name);
        System.out.println("Bike Model Number: " + modelnumber);
        s.nextLine(); // 👈 Clear newline from buffer
    }

    public void Bike() {
        System.out.print("Enter the name of the Bike: ");
        name = s.nextLine();
        System.out.print("Enter the model number of the Bike: ");
        modelnumber = s.nextInt();

        // Display both inputs
        System.out.println("Bike Name: " + name);
        System.out.println("Bike Model Number: " + modelnumber);
    }

    public static void main(String[] args) {
        Vehicle v = new A();
        v.Car();
        System.out.println("----------------");
        v.Bike();
    }
}
