package Interface;

interface A1{
    void show();
}

interface B1{
    void show();
}

class multiple_inheritance implements A1 , B1{

    public void show() {
        System.out.println("A & B");
    }

    public static void main(String[] args) {
        A1 a = new multiple_inheritance();
        B1 b = new multiple_inheritance();
        a.show();
        System.out.println("-------------");
        b.show();

    }
        }