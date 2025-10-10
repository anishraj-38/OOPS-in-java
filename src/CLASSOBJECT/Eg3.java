package CLASSOBJECT;


class pen{
    String color;
    String price;

    public void p(){
        System.out.println("writing");
    }
}
public class Eg3 {
    public static void main(String[] args) {
        pen p = new pen();
        p.color="blue";
        p.price="$5";
        p.p();
        System.out.println(p.color);
        System.out.println(p.price);
    }


}
