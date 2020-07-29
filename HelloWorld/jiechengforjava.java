package HelloWorld;

import java.util.Scanner;

        public class jiechengforjava {

            public static int JieCheng(int a) {
                if (a <= 1) {
                    return 1;
                } else {
                    return a * JieCheng(a - 1);
                }
            }
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("请输入一个阶乘值:");
                 int jieChengZhi = input.nextInt();
                System.out.println("该数的阶乘值为：" + JieCheng(jieChengZhi));
            }

        }
