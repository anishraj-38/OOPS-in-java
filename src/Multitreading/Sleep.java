package Multitreading;

class Demo extends Thread{
    @Override
    public void run(){
        String n = currentThread().getName();

        try{
            for(int i=0;i<3;i++){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

    }
}
public class Sleep {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo e = new Demo();
        Demo f =new Demo();

        d.setName("Anish");
        e.setName("An");
        f.setName("ish");



        d.start();


        try{
            d.join();
        }
        catch (InterruptedException i){
            System.out.println(i);
        }
        e.start();
        f.start();


    }
}
