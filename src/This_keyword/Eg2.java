package This_keyword;

class This1{
    private String player;
    private int runs;
    private int wickets;

    public void ipl(String player,int runs,int wickets){
        this.player=player;
        this.runs=runs;
        this.wickets=wickets;
    }
    public void show(){
        System.out.println("Player "+player+"    runs "+runs+"   Wickets "+wickets);
    }
}
public class Eg2 {
    public static void main(String[] args) {

        This p=new This();
        p.ipl("Jadeja",3000,600);
        p.show();

    }
}
