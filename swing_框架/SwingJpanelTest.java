package swing_框架;

import javax.swing.*;
import java.awt.*;

public class SwingJpanelTest {

    public static void main(String[] args) {

        JFrame fr = new JFrame("Hello !");

        fr.setSize(200, 200);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();

        pan.setSize(200, 100);

        pan.setBackground(Color.YELLOW);    // 设置通用容器的背景图片为：颜色.黄色

        pan.setLayout(new GridLayout(2, 1));    // 网格布局管理器:将通用容器分割为2行1列

        pan.add(new JButton("确定"));    // JButton:按钮类,该行意思为实例化一个按钮类添加到pan通用容器中

        fr.setContentPane(pan);    //将 pan(通用容器) 显示在 fr(顶层容器) 的内容面板上

        fr.setVisible(true);

    }


}
