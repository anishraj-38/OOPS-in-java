package Multitreading;

import static java.lang.Thread.currentThread;

class A5 extends Thread{
    public void run(){
        String n = currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(n);
        }
    }
}

public class Eg3 {
    public static void main(String[] args) {
        A5 a = new A5();
        A5 b = new A5();
        A5 c = new A5();

        a.setName("anish");
        b.setName("ANISH");
        c.setName("AnIsH");

        a.start();
        b.start();
        c.start();

        String n = currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }


    }
}
