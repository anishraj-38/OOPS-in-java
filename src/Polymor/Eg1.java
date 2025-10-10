package Polymor;

class SmartPhone{

    public void volume(String up){
        System.out.println("volume Up");
    }

    public void volume(int max){
        System.out.println("5 times volume increase ");
    }

    public void volume(String up,String down){
        System.out.println("Volume Up and Down");
    }
}

public class Eg1 {
    public static void main(String[] args) {
        SmartPhone s =new SmartPhone();
        s.volume("up");
        s.volume(5);
        s.volume("Up ","Down");

    }
}
