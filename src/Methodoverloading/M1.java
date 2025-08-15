// All the method name are same but the number of argument are different.

package Methodoverloading;

class calculator{
    public int add(int a, int b){
        int c=a+b;
        return c;
    }

    public double add(double a, double b){
        double c=a+b;
        return c;
    }

    public String add(String a, String b){
        String c=a+b;
        return c;
    }

}

public class M1 {
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.33,5.77));
        System.out.println(c.add("Ani","sh"));

    }
}
