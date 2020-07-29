package HelloWorld;

public class xiaoshubaoliu {
    public static void main(String[] args){

        double a = 3.1415926;
        int b;

        a = (int)(a * 1000);

        b = (int)a % 10;

        if(b < 5){
             a = (int)(a / 10);
             a /= 100;
        }
        else{
             a /= 1000;
        }
        System.out.println("四舍五入且保留后a="+a);
    }
}
