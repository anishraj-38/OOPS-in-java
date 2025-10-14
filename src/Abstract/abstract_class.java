package Abstract;


    abstract class Animal1 {
        Animal1() {
            System.out.println("Sound");
        }

        public abstract void sound();
    }

    class Dog extends Animal1 {
        Dog() {
            super();
        }

        public void sound() {
            System.out.println("Barking");
        }
    }

    class Lion extends Animal1 {
        Lion() {
            super();
        }

        public void sound() {
            System.out.println("Roaring");
        }
    }
public class abstract_class {
    public static void main(String[] args) {
        Animal1 d = new Dog();
        Animal1 l = new Lion();

        d.sound();
        l.sound();

    }
}