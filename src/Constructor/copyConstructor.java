package Constructor;

class Demo1{
    int id;
    String name;

    Demo1(int id,String name){
        this.id=id;
        this.name=name;
    }

    Demo1(Demo1 d){
        this.id=d.id;
        this.name=d.name;
    }

    public void details(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1(23,"Anish");
        d1.details();

        Demo1 d2 = new Demo1(d1);
        d2.details();
    }



}
