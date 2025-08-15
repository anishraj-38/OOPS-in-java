package Interface;

public interface Printable {
    void print();
}

class Book implements Printable{
        String title;
        String author;

        Book(String title,String author){
            this.title=title;
            this.author=author;
        }
    public void print() {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        }

    }

class Magazine implements Printable{
        String Name;
        int Issue;
        Magazine(String Name,int Issue){
            this.Name=Name;
            this.Issue=Issue;
        }

    public void print(){
        System.out.println("Name : "+Name);
        System.out.println("Issue : "+Issue);
    }

    public static void main(String[] args) {
        Printable p1 = new Book("The good man","Anish sinha");
        Printable p2 = new Magazine("Wiseman",29);
        p1.print();
        System.out.println("------------");
        p2.print();

    }
}
