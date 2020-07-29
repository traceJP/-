package swing_框架;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTDelegationModel {

    public static void main(String[] args) {

        JFrame f = new JFrame("Swing事件监听");
        f.setSize(200, 100);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("按我显示Hello!");

        b.addActionListener(    //使用Lambda表达式进行事件监听
                e -> {
                    System.out.print("Hello!");
                });

//        b.addActionListener(new ButtonHandler());    使用class定义监听器类进行方法调用

        f.add(b);
        f.setVisible(true);
    }

}

class ButtonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello!");
    }

}
