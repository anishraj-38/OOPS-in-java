package Polymor;

class A1{
    void m1(String a){

        System.out.println(a);

    }
}

class A2 extends A1{
    @Override
    void m1(String r){
        System.out.println(r);
    }
}

public class Eg2 {
    public static void main(String[] args) {
        A1 a = new A2();
        a.m1("Anish kumar");

        A2 b = new A2();
        b.m1("xww");

    }
}
