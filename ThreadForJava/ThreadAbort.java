package ThreadForJava;

public class ThreadAbort {

    public static void main(String[] args) {

        int i = 0;
        HelloAbort a = new HelloAbort();
        Thread t = new Thread(a);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        while (i < 10000) {
            System.out.println("Hello" + i++);
        }

        /*运行过程：主线程和t线程进行资源抢占式运行，其中t线程优先级为max,主线程优先级为norm,两线程由系统jvm算法进行时间分配*/

    }

}

class HelloAbort implements Runnable {    // 线程体

    int i = 0;
    boolean timeToQuit = false;

    @Override
    public void run() {

        while (i < 10000) {
            System.out.println("Hi" + i++);
        }

    }


}