//order of parameter

package Methodoverloading;
class Anish{
    public void show(String n, int a){
        System.out.println("Name "+n);
        System.out.println("Age "+a);
    }
    public void show( int a,String n){
        System.out.println("Age "+a);
        System.out.println("Name "+n);
    }

}

public class Eg3 {
    public static void main(String[] args) {
        Anish a=new Anish();
        a.show("Sneha kumari",21);
        a.show(23,"Anish kumar");

    }
}
