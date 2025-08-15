//    All the method name is same but argument is different

package Methodoverloading;

class cal{
    public int add(int a, int b){
        int x=a+b;
        return x;
    }

    public int add(int a, int b,int c){
        int y=a+b+c;
        return y;
    }

    public int add(int a, int b,int c,int d){
        int z=a+b+c+d;
        return z;
    }
}


public class Eg2 {
    public static void main(String[] args) {
        cal c=new cal();
        System.out.println("The sum of two integer is : "+c.add(2,44));
        System.out.println("The sum of three integer is : "+c.add(2,44,44));
        System.out.println("The sum of four integer is : "+c.add(2,44,66,33));
    }
}
