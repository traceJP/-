package HelloWorldMax;

class QTpaochu {     //定义了个三层嵌套方法的类

    public int num_zero(int x, int y) throws ArithmeticException {  //接受-1层异常，经检查后无法解决，向main函数抛出

        System.out.println("这是第0层");
        return num_one(x, y);

    }

    public int num_one(int x, int y) throws ArithmeticException {   //接收-2层抛出的异常，经过检查后发现-1层也无法解决异常，将异常继续向上抛出
        System.out.println("这是第-1层");
        return num_two(x, y);
    }

    public int num_two(int x, int y) throws ArithmeticException {
        System.out.println("这是第-2层");

        if (y == 0)   //当除数等于0时，无需等待，利用throw子句直接抛出异常，
            throw new ArithmeticException();   //无法解决异常，将异常抛至-1层

        System.out.println("我在抛出异常的后面！");

        return x / y;     //y值为0时出现整数除以0异常
        /*因为这里出现的异常为ArithmeticException，该异常可以被系统在嵌套中直接识别，所以在该例子中抛出异常和不抛出异常都一样*/
    }

}

public class java异常定义与抛出 {

    public static void main(String[] args) {

        int a = 12, b = 0;
        QTpaochu qwq = new QTpaochu();

        try {      //ArithmeticException:整数除以0异常类

            System.out.println(qwq.num_zero(a, b));

        } catch (ArithmeticException e) {    //最终在main函数里解决num_two中出现的异常

            System.err.println("出现异常：整数除以0");

        }

    }

}

