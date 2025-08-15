package Inheritance;

class vec{
    public vec(String type){
        System.out.println("vehicle type "+type);
    }
}

class car extends vec{
    public car(){
        super("Four wheeler ");
        System.out.println("Stoping....");
    }
}

public class Eg2 {
    public static void main(String[] args) {
        car c= new car();

    }
}
