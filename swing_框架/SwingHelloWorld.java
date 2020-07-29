package swing_框架;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingHelloWorld {

    public static void main(String[] args) {

        JFrame frame = new JFrame("HelloWorldSwing");     // 创建一个顶层容器frame，窗体标题为HelloWorldSwing

        JLabel label = new JLabel("HelloWorld!");   // 创建组件元素对象，显示文本为HelloWorld!
        frame.getContentPane().add(label);   // frame.getContentPane:获取顶层容器的内容面板 用add方法向其中加入label组件
        // 其中getContentPane()方法可以被省略 在jdk1.5之后 向顶层容器添加组件会自动转交到内容面板里
        // frame.add(new JLabel("HelloWorld!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // 设置窗口中的关闭效果，如JFrame.EXIT_ON_CLOSE：退出应用系统

        frame.setSize(200, 70);    // 调整顶层容器窗口显示的宽度和高度 单位：像素（px）

        frame.setVisible(true);    // 窗口创建默认是初始不显示的，需要通过setVisible(true)方法显示窗口:true显示，false不显示

    }

}
