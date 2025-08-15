package Static;

class sta{

    private String name;
    private int age;
    private static String university_name="kiit";

    public sta(String n,int a){
        name=n;
        age=a;
    }

    public void show(){
        System.out.println("Name "+name+" Age "+age+" University "+university_name);
    }

}


public class Implement {
    public static void main(String[] args) {
        sta s1=new sta("Anish",34);
        sta s2=new sta("Sneha",24);
        sta s3=new sta("Manish",30);

        s1.show();
        s2.show();
        s3.show();

    }
}
