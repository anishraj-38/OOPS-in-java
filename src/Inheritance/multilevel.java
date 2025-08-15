package Inheritance;

class A{
    public void a(){
        System.out.println("A");
    }
}

class B extends A{
    public void b(){
        System.out.println("B");
    }
}

class C extends  B{
    public void c(){
        System.out.println("C");
    }
}

public class multilevel {
    public static void main(String[] args) {
        C d1=new C();
        d1.a();
        d1.b();
        d1.c();

    }

}
