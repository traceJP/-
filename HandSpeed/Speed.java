package HandSpeed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Speed {
    public static void main(String[] args) {
        Window test = new Window();
        test.WindowsMain();

    }
}

class Window {    // 窗口类
    /*盒子模型*/
    public void WindowsMain() {    // 总盒
        JFrame windowMax = new JFrame();
        windowMax.setTitle("鼠标毁灭者");
        windowMax.setSize(500, 300);
        windowMax.setLocation(700, 300);    // 出现位置
        windowMax.setResizable(false);
        windowMax.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowMax.add(boxTow());
        windowMax.setVisible(true);
    }

    private JPanel boxTow() {    // 二大盒
        JPanel test = new JPanel();
        test.setLayout(new GridLayout(0, 2));
        test.add(windowButton());
        test.add(boxText());
        return test;
    }

    private JPanel boxText() {    // 右盒
        JPanel boxtext = new JPanel();
        boxtext.add(boxShow());
        boxtext.add(boxSetUp());
        return boxtext;
    }

    static JTextArea Show = new JTextArea(10, 13);

    private JTextArea boxShow() {    // 显示盒
        Show.setEditable(false);    // 文本只读
        Show.setFont(new Font("游戏提示", 0, 15));
        Show.setText("                游戏规则\n" + "快来测测自己的手速最高有多少码\n\n" +
                "~您当前已经点了" + "0" + "   下\n" +
                "~当前已经过了" + "00:000" + "s\n" +
                "~您的平均点击率为" + "000.0下/min\n\n" +
                "~历史最高记录为" + "000.0下/min\n");
        return Show;
    }

    private JPanel boxSetUp() {    // 按钮盒
        JPanel boxset = new JPanel();
        boxset.add(reset());
        boxset.add(about());
        return boxset;
    }

    /*按钮集合*/
    private JButton reset() {
        JButton button = new JButton();
        button.addMouseListener(new eventReset());
        button.setText("重置");
        return button;
    }

    private JButton about() {
        JButton button = new JButton();
        button.addMouseListener(new eventAbout());
        button.setText("关于");
        return button;
    }

    private JButton windowButton() {
        JButton button = new JButton();
        button.addMouseListener(new eventWindowButton());
        button.addMouseListener(new eventWindowButtonStart());
        button.setText("点我~");
        return button;
    }
}

/*计时器*/
class Timer extends Thread {
    static double Record = 0;
    static long programStart = 0;
    static boolean milliStop = true;

    @Override
    public void run() {
        milliStop = true;
        while (milliStop) {
            long elapsed = System.currentTimeMillis() - programStart;
            int milli = (int) (elapsed % 1000);    // 毫秒
            elapsed /= 1000;
            int second = (int) (elapsed % 60);    // 秒
            elapsed /= 60;
            Window.Show.replaceRange(String.format("%02d:%03d", second, milli), 59, 65);
            if (second != 0) {

                // <字符流读写功能代码>

                double avgSpeed = (eventWindowButton.count * 60) / second;


                if (avgSpeed < 100) {
                    Window.Show.replaceRange(String.valueOf(avgSpeed), 76, 80);
                } else {
                    Window.Show.replaceRange(String.valueOf(avgSpeed), 76, 81);
                }
            }


            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/*事件处理*/
class eventWindowButton extends MouseAdapter {    // 主按钮事件
    public static int count = 0;

    @Override
    public void mouseClicked(MouseEvent e) {
        count++;
        if (count < 10) {
            Window.Show.replaceRange(String.valueOf(count), 46, 47);
        } else if (count < 100) {
            Window.Show.replaceRange(String.valueOf(count), 46, 48);
        } else if (count < 1000) {
            Window.Show.replaceRange(String.valueOf(count), 46, 49);
        }
    }
}


class eventWindowButtonStart extends MouseAdapter {
    static boolean first = true;    // 是否为第一次单击主按钮

    @Override
    public void mouseClicked(MouseEvent e) {
        if (first) {
            Timer.programStart = System.currentTimeMillis();    // 获取初始时间戳
            Timer timeOne = new Timer();
            timeOne.start();
        }
        first = false;
    }
}

class eventReset extends MouseAdapter {    // 重置按钮事件
    @Override
    public void mouseClicked(MouseEvent e) {
        if (eventWindowButton.count < 10) {
            Window.Show.replaceRange("0", 46, 47);
        } else if (eventWindowButton.count < 100) {
            Window.Show.replaceRange("0 ", 46, 48);
        } else if (eventWindowButton.count < 1000) {
            Window.Show.replaceRange("0  ", 46, 49);
        }
        eventWindowButton.count = 0;
        Timer.milliStop = false;    // 终结计时器线程
        Window.Show.replaceRange("00:000", 59, 65);
        Window.Show.replaceRange("000.0", 76, 81);
        eventWindowButtonStart.first = true;

    }
}

class eventAbout extends MouseAdapter {    // 关于按钮事件
    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane aboutVersion = new JOptionPane();
        JOptionPane.showConfirmDialog(aboutVersion,
                "当前版本：-v1.0-\n" +
                        "作者：LJP\n" +
                        "制作时间：2020.7.5\n" +
                        "本次更新：\n" +
                        "无" +
                        "" +
                        "",
                "关于", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);
    }
}









