package HelloWorldMax;

class Box<T>{       //泛型类，参数泛型为T

    T a;

    public void Cout() {
        System.out.println(a);
    }

    public <U> void Coutgo(U ucan){       //定义一个泛化方法Coutgo，调用时传入一个泛化参数ucan
        System.out.println("ucan" + "=" + ucan);
    }

}

public class java泛型 {

    public static void main(String[] args) {

        int sbox = 666;     //定义一个int类型变量sbox=666

        Integer xbox = new Integer(233);   //实例化一个Integer对象xbox=233

        Box<Integer> c = new Box<Integer>();   //实例化Box泛型类对象c，泛型参数值为Integer  ***泛型参数只支持

        c.a = xbox;   //对象c中的Integer数据类型a   赋值为   Integer数据类型对象xbox=233
        c.a = sbox;   //对象c中的Integer数据类型a   赋值为   int数据类型sbox=666  （利用java特性的 自动装箱 使int类型自动装箱为Integer类型）

        c.Cout();    //调用c对象的Cout输出方法查看a的值


        c.Coutgo("HelloWorld");
        //调用泛化方法Coutgo时传入string类型 "HelloWorld" 此时jvm通过推理得出传入的泛型参数值为String，并利用java自动装箱机制使string值转化为String值并进行输出

        c.Coutgo(123456789); //推理得出泛型参数值为Integer

    }
}
