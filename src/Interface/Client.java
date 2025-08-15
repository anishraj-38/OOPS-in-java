package Interface;

import java.util.*;

interface Client {
   void input();
   void output();
}
class Anish implements Client{
    Scanner s =new Scanner(System.in);

    String name;
    int age;
    public void input() {
        System.out.print("Enter a name : ");
        name=s.nextLine();
        System.out.print("Enter a age : ");
        age=s.nextInt();
    }

    public void output() {
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Client c = new Anish();
        c.input();
        c.output();
    }
}


