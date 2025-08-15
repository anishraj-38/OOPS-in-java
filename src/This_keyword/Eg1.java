package This_keyword;

class This{
    private String player;
    private int runs;
    private int wickets;

    public void ipl(String p,int r,int w){
        player=p;
        runs=r;
        wickets=w;
    }
    public void show(){
        System.out.println("Player "+player+"    runs "+runs+"   Wickets "+wickets);
    }
}
public class Eg1 {
    public static void main(String[] args) {

        This p=new This();
        p.ipl("Jadeja",3000,600);
        p.show();

    }
}
