package Multitreading;

class A2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("xxx");
        }
    }
}

public class run {
    public static void main(String[] args) {
        A2 a =new A2();
        Thread t = new Thread(a);
        t.start();

        for (int i=0;i<5;i++){
            System.out.println("yyy");
        }
    }
}
