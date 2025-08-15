package Multitreading;

class A2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("ANISH");
        }
    }
}

public class extend {
    public static void main(String[] args) {
        A2 a = new A2();
        a.start();
        for(int i =0;i<=5;i++){
            System.out.println("Kumar");
        }
    }

}
