package ThreadForJava;

public class ThreadProcess {

    public static void main(String[] args) {

        int i = 0;
        HelloProcess t = new HelloProcess();

        t.start();    // 调整第二线程为可Runnable状态

        while (true) {

            System.out.println("Good Morning主线程" + i++);

            if (i == 2 && t.isAlive()) {    // 当主线程的i = 2时，使用join使主线程滞留。 第二线程不在运行时刻isAlive返回false
                System.out.println("主线程即将被中断！");

                /*可以注释掉t.join语句块看看线程运行的流程：应当为主线程运行完毕之后，再运行第二线程*/
                try {
                    t.join();    // 当第二线程运行完毕后，才将主线程改回Runnable状态
                    /* -CPU将主线程运行一半后跑去运行第二线程，第二线程运行完毕后又回来运行主线程- */
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            if (i == 5) {
                break;
            }

        }

    }

}

class HelloProcess extends Thread {

    @Override
    public void run() {

        System.out.println("Hello线程正在运行中");

        int i = 0;
        while (i < 5) {
            System.out.println("Hello第二线程" + i);
            i++;
        }

    }

}
