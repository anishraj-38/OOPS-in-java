package Multitreading;

class A1 extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Anish");
        }
    }

}

public class Eg2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.start();

        for(int i=0;i<5;i++){
            System.out.println("kumar");
        }
    }

}
