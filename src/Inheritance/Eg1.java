package Inheritance;


class vehicle{
    public void start(){
        System.out.println("Starting.............");
    }
    public void accelerate(){
        System.out.println("Accelerating.........");
    }
    public void turn_left(){
        System.out.println("Turn left");
    }
    public void turn_right(){
        System.out.println("Turn right");
    }
    public void apply_break(){
        System.out.println("Break...............");
    }
    public void stop(){
        System.out.println("Stop...............");
    }

}

class Engine extends vehicle{
    public  void reverse(){
        System.out.println("Reversing............");
    }

}


public class Eg1 {
    public static void main(String[] args) {
        Engine v= new Engine();
        v.start();
        v.accelerate();
        v.reverse();
        v.turn_left();
        v.turn_right();
        v.apply_break();
        v.stop();
    }

}
