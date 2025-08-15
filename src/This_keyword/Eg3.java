package This_keyword;

class Box{
    private int length,breadth,height;

    public Box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public Box(int side){
        this(side,side,side);
    }

    public Box(){
        this(0,0,0);
    }

    public void show(){
        System.out.println("Length "+length+"   Breadth "+breadth+"    Height "+height);
    }
}

public class Eg3 {
    public static void main(String[] args) {
        Box b1=new Box(23,4,1);
        Box b2=new Box(2);
        Box b3=new Box(3);
        b1.show();
        b2.show();
        
    }
}
