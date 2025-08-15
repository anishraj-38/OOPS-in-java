package Inheritance;

class A1{
    public void a(){
        System.out.println("a");
    }
}
class B1 extends  A1{
    public void b() {
        System.out.println("b");
    }
}

class C1 extends  A1{
    public void c() {
        System.out.println("c");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        A1 d1 = new A1();
        d1.a();
        System.out.println(" ");

        B1 d2 = new B1();
        d2.a();
        d2.b();
        System.out.println(" ");

        C1 d3 = new C1();
        d3.a();
        d3.c();
        System.out.println(" ");

    }
}
