package swing_框架;

import javax.swing.*;
import java.awt.*;

public class SwingJFrameTest {

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);    // setDefaultLookAndFeelDecorated:设置JFrame类的默认外观为true

        JFrame frame = new JFrame("JFrameDemo");    // 实例化一个顶层容器frame，标题为JFrameDemo

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // 设置窗口中的关闭效果为退出整个窗口

        JLabel emptyLabel = new JLabel("HelloJFrameDemo!");    // 实例化一个标签类emptyLabel

        emptyLabel.setPreferredSize(new Dimension(175, 100));
        // 此处frame.setSize(175, 100);语句不起作用


        frame.add(emptyLabel, BorderLayout.CENTER);

        frame.pack();    // 窗口的大小设置为合适组件最佳尺寸与布局所需的空间

        frame.setVisible(true);

    }

}
