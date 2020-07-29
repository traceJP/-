package HelloWorld;

public class breakforjava {
    public static void main(String[] agre){
        double i = 1;
        double j = 1;
        double sum = 0;
        for(i = 1;i < 10000;i += 2){
            sum += (1 / i) * j;
            j *= -1;
            if((1 / i) < 0.000001){
                break;
            }
        }
        System.out.println("pi="+sum*4);
    }
}
