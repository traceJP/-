package HelloWorldMax;

public class java异常捕捉 {

    public static void main(String[] args) {

        int i = 0;
        String greetings[] = {
                "Hello World!!",
                "Hello!!",
                "HELLO WORLD!!"
        };

    try{

        while (i<3){    //i循环四次，出现数组越界异常.此处将4改为3可避免异常出现
            System.out.println(greetings[i]);
            i++;
        }

    } catch (ArrayIndexOutOfBoundsException e){    //ArrayIndexOutOfBoundsException：数组越界异常类 ，e为该类的实例化名

        System.err.println("出现异常:数组越界！");    //System.eer中的print可使java输出文字红色高亮

    } finally {

        System.err.println("无论是否异常这条finally语句都将执行！");

    }

        System.out.println("Normal ended.");
    }

}
