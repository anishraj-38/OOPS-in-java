package Constructor;

import java.util.*;
class Demo{
    String name;
    int roll;
    int m1,m2,m3;
    double percentage;

    Demo(String name,int roll){
        this.name=name;
        this.roll=roll;

    }

    public void marks(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Mark 1 : ");
        m1= s.nextInt();
        System.out.print("Enter a Mark 2: ");
        m2= s.nextInt();
        System.out.print("Enter a Mark 3 : ");
        m3= s.nextInt();
    }

    public void setPercentage(){
        percentage=(m1+m2+m3)/3.0;
    }

    public void getPercentage(){
        System.out.print("Percentage : "+percentage);
    }

    public void display(){
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Percentage: " + percentage);
    }
}



public class Student {
    public static void main(String[] args) {
        Demo d = new Demo("Anish kumar",006);
        d.marks();
        d.setPercentage();

        d.display();
    }


}
