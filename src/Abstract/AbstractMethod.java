package Abstract;

abstract class Animal {
    public abstract void catagory();
}

class Dog1 extends Animal {
    @Override
    public void catagory() {
        System.out.println("Mammal");
    }
}

class Birds extends Animal {
    @Override
    public void catagory() {
        System.out.println("Not mammal");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.catagory();
        System.out.println("-------------");
        Birds b = new Birds();
        b.catagory();
    }
}
