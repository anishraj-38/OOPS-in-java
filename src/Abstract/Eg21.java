package Abstract;

abstract class Demo1{
    Demo1(){
        System.out.println("Phone linging your phone linging");
    }

    public abstract void ringing();
}

class Samsung extends Demo1 {
    Samsung(){
        super();
    }

    @Override
    public void ringing(){
        System.out.println("Samsung song");
    }

    public void camera(){
        System.out.println("clicking picture");
    }
}

class poco extends Demo1 {
    poco(){
        super();
    }
    @Override
    public void ringing(){
        System.out.println("poco song");
    }

    public void light(){
        System.out.println("Flash on");
    }
}
public class Eg21 {
    public static void main(String[] args) {
        Samsung d =new Samsung();
        d.ringing();
        d.camera();

        poco d1 = new poco();
        d1.ringing();
        d1.light();
    }
}
