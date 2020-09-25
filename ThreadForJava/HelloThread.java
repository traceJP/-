package ThreadForJava;

public class HelloThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Hello());    // 创建线程t1,t2
        Thread t2 = new Thread(new Hello());    // 参数为创建一个线程体实例Hello()

        t1.start();    //线程t1,t2调整为“就绪”状态
        t2.start();

        /*
         * t1,t2被调整为（就绪）模式之后，此时将根据优先级别开始分配时间资源给t1线程和t2线程
         * 然后t1,t2线程采用抢占式线程进行运行。
         * 具体分配多少时间资源取决于jvm虚拟机中的算法。
         */

    }

}

class Hello implements Runnable {    // 创建线程体

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Hellotone" + i);
            i++;
        }
    }

}
