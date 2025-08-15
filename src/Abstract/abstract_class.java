package Abstract;


    abstract class animal {
        animal() {
            System.out.println("Sound");
        }

        public abstract void sound();
    }

    class Dog extends animal {
        Dog() {
            super();
        }

        public void sound() {
            System.out.println("Barking");
        }
    }

    class Lion extends animal {
        Lion() {
            super();
        }

        public void sound() {
            System.out.println("Roaring");
        }
    }
public class abstract_class {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();

        d.sound();
        System.out.println("-------");
        l.sound();

    }
}