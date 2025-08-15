//Q3. Create a class that extends another class and implements two interfaces.

package Interface;

interface Lion{
    public void sound();
}
interface Dog{
    public void eat();
}
class animal{
    public void catagory(){
        System.out.println("Land/water");
    }
}

class Extending extends animal implements Lion,Dog{
    public void sound(){
        System.out.println("Roaring");
    }
    public void eat(){
        System.out.println("carnivouras");
    }
    public static void main(String[] args) {
        Lion l = new Extending();
        l.sound();
        System.out.println("----------");

        Dog d = new Extending();
        d.eat();
        System.out.println("-------");

        animal a = new Extending();
        a.catagory();

    }
}



