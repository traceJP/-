package HelloWorld;

import java.util.Scanner;

public class javaforputoutxinhao {

    public static void main(String[] args){

        Scanner Scan = new Scanner(System.in);

        //int a = Scan.nextInt();
        int a = 4;
        int i;
        int j;
        char S = 'A';
        for(i = 0;i < a;i++){

            for(j = a;j > i+1;j--){
                System.out.print(" ");
            }
            System.out.print(S);

            for(j = 2*i-1;j > 0;j--){
                System.out.print(" ");
            }
            if(i != 0){
                System.out.print(S);
            }
            System.out.print("\n");
            S++;

        }



    }
}
