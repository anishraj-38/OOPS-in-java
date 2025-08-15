package overriding;

class demo1{
    public void d(){
        System.out.println("Anish");
    }
}

class demo2 extends demo1{
    public void d(){
        super.d();
        System.out.println("34");
    }
}

public class Eg1 {
    public static void main(String[] args) {
        demo2 d1=new demo2();
        d1.d();

    }
}
