package Interface;

interface A2{
    public void msg();
}

interface B2{
    public void msg();
}

class Multi_inherit_03 implements A2,B2{
    public void msg(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        A2 a = new Multi_inherit_03();
        a.msg();
        System.out.println("_____________");
        B2 b = new Multi_inherit_03();
        b.msg();

    }
}
