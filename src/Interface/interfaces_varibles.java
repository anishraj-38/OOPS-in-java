package Interface;

interface customer {
    int amt=2;
    public abstract void customeraj();//static + public + final
}

class seller implements customer {
    @Override

    public void customeraj() {
        System.out.println("The amount of rice is "+amt);
    }
}

class interfaces_varibles{
    public static void main(String[] args) {
        customer c = new seller() ;
        c.customeraj();
        System.out.println(c.amt);// static
    }
}
