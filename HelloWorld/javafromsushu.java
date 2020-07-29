package HelloWorld;

import java.util.Scanner;

public class javafromsushu {

    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n;
        int number;
        number = input.nextInt();

        for (n = 2; n < number; n++) {
            if(number % n == 0){
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
