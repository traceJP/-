package HelloWorldMax;

class SanjiaoxinbuguizeException extends Exception{   //自定义一个异常类，并继承Exception系统异常类

    private int j,k,l;

    public SanjiaoxinbuguizeException(int j,int k,int l){
        this.j = j;
        this.k = k;
        this.l = l;
    }

    public void SanjiaoxinCout(){
        System.err.println("出现异常：三边长度无法组成三角形：" + "\n" + "详细三边参数为:" + j + "\t" + k + "\t" + l);
    }

}

class sanjiaoxin{

    private int x,y,z;
    public sanjiaoxin(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void number() throws SanjiaoxinbuguizeException{

        if(x+y<z || x+z<y || y+z<x)   //如果三角形三边不符合正常大小则无法组成正常三角形
            throw new SanjiaoxinbuguizeException(x,y,z);   //所以抛出异常，并以x,y,z为参数调用自定义异常类构造函数抛出

        System.out.println("三角形三边长为:" + x + "\t" + y + "\t" + z);  //如果没有三角形异常则正常执行该语句
    }

}

public class java异常自定义 {

    public static void main(String[] args) {

        int a = 13,b = 4,c = 5;   //更改a,b,c的值可以使三角形三边长度变化

        sanjiaoxin cc = new sanjiaoxin(a,b,c);

        try{   //捕捉number函数中抛出的异常

            cc.number();

        } catch (SanjiaoxinbuguizeException e){   //在main函数中解决了自定义的SanjiaoxinbuguizeException类异常
            e.SanjiaoxinCout();   //调用自定义类异常函数，输出异常提示信息
        }

    }

}
