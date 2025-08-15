// Q1. Create two interfaces Printable and Showable, each with a show() method.
// Implement both in one class.

package Interface;

interface Printable1 {
    public void show();
}
interface showable{
    public void show();

}

class multi_inherit_02 implements Printable1,showable{
    public void show () {
        System.out.println("Anish");
    }
    public static void main(String[] args) {
        Printable1 p1 = new multi_inherit_02();
        p1.show();
        System.out.println("------------");
        showable p2 = new multi_inherit_02();
        p2.show();
        }
    }
