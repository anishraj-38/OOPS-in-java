package Multitreading;
class A extends  Thread{
    @Override
    public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("Anish");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
}

public class Eg1 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        for(int i=0;i<=5;i++){
            System.out.println("kumar");
            Thread.sleep(1000);
        }
    }
}
