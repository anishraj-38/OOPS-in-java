package CLASSOBJECT;
import java.util.Scanner;

class student{
    int age;
    String name;
    Float cgpa;

    public void stu(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Cgpa "+cgpa);
    }
}


public class Eg1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        student st=new student();

        System.out.println("Enter name : ");
        st.name=s.nextLine();

        System.out.println("Enter age : ");
        st.age=s.nextInt();

        System.out.println("Enter Cgpa : ");
        st.cgpa=s.nextFloat();

        System.out.println("Details:");
        st.stu();

        s.close();


    }
}
