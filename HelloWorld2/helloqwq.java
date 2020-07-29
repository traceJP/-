package HelloWorld2;

class hello{
    private int a;
    private int b;
    hello(int m,int n){
        a = m;
        b = n;
    }
    /*
    public void SCin(){
        Scanner Scan = new Scanner(System.in);
        a = Scan.nextInt();
        b = Scan.nextInt();
    }*/
    public void SOut(){
        int c = a + b;
        System.out.println("a+b="+c);
    }
    public static void main(String[] args){
        hello N_1 = new hello(6,7);
        N_1.SOut();
    }
}

