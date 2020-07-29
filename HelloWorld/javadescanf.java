//输入实例

package HelloWorld;   //包

//此处导包（导包位置放在package和class之中）

import java.util.Scanner;//第一步：导包

public class javadescanf {                    //类


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);   //第二步：新建一个变量input，使其输入一个值

        int a;
        a = input.nextInt();   //第三步：  将该input值赋给一个对象

        System.out.println("你输入的a的值为"+a);
    }


}
