package Inheritance;

public class eg3 {
    public static void main(String[] args) {
        ani a=new ani();
        a.d();
    }

}

class anish{
    public void veh(){
        System.out.println("Anish");
    }
}

class ani extends anish{
    public void d(){
        System.out.println("Anish kumar");
    }
}