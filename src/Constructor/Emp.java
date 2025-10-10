package Constructor;

import java.util.Scanner;

class Employee{
    String name;
    int id;
    int working_days,working_hours;
    int salaryPerHour;
    double totalSalary;

    Employee(String name,int id,int working_days,int working_hours){
        this.name=name;
        this.id=id;
        this.working_days=Math.min(working_days,31);
        this.working_hours = Math.min(working_hours,8);


    }
    public void details(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name : ");
        name=s.nextLine();
        System.out.println("Enter a Employee ID : ");
        id=s.nextInt();
        System.out.println("Enter a Working days : ");
        working_days=s.nextInt();
        if(working_days>31){
            working_days=31;
        }
        System.out.println("Enter a Working Hours : ");
        working_hours=s.nextInt();
        if(working_hours>8){
            working_hours=8;
        }

    }

    public void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary per Hour (max Rs 500): ");
        salaryPerHour = (int) sc.nextDouble();
        if (salaryPerHour > 500) salaryPerHour = 500;

        totalSalary = working_days * working_hours * salaryPerHour;
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + id);
        System.out.println("Working Days: " + working_days);
        System.out.println("Working Hours per Day: " + working_hours);
        System.out.println("Salary per Hour: Rs " + salaryPerHour);
        System.out.println("Total Salary: Rs " + totalSalary);
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee e = new Employee("Anish kumer",234,23,7);
        e.details();
        e.calculateSalary();
        e.displayDetails();
    }


}
