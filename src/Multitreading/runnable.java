package Multitreading;

class A3 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("fg");
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        A3 a = new A3();
        Thread t1 = new Thread(a);
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("xc");
        }
    }
}
