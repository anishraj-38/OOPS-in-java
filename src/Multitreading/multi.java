package Multitreading;

class A4 extends Thread{
    @Override
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(n);
        }
    }
}

public class multi {
    public static void main(String[] args) {
        A4 t1 = new A4();
        A4 t2 = new A4();
        A4 t3 = new A4();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();


    }
}
