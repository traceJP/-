package teacher;
import java.util.Scanner;
public class Object_Code2_2020521 {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        System.out.println(
                "简单计算器：" + "\n"
              + "====菜单====" + "\n"
              + "1-------加法" + "\n"
              + "2-------减法" + "\n"
              + "3-------乘法" + "\n"
              + "4-------除法" + "\n"
              + "============" + "\n"
              + "请输入您的选择：" + "\n"
        );
        int Symbol = Cin.nextInt();
        System.out.println("请输入要运算的数据：");
        while(Symbol < 1 || Symbol > 4){
            System.out.println("您输入的数据范围在1~4之外，请重新输：");
            Symbol = Cin.nextInt();
        }
        double CodeLift = Cin.nextDouble();
        double CodeRight = Cin.nextDouble();
        System.out.println("运算结果：");
        switch(Symbol){
            case 1 :
                System.out.println(CodeLift + "+" + CodeRight + "=" + (CodeLift+CodeRight));
                break;
            case 2 :
                System.out.println(CodeLift + "-" + CodeRight + "=" + (CodeLift-CodeRight));
                break;
            case 3 :
                System.out.println(CodeLift + "*" + CodeRight + "=" + (CodeLift*CodeRight));
                break;
            case 4 :
                System.out.println(CodeLift + "/" + CodeRight + "=" + (CodeLift/CodeRight));
                break;
        }
    }
}





