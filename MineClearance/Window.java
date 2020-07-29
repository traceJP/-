package MineClearance;

import javax.swing.*;
import java.awt.*;

public class Window {

    Algorithms Codetest = new Algorithms();    // 数据结构实例

    EventTrigger Eventtest = new EventTrigger();



    public void WindowJframe() {    // 顶层窗口

        JFrame SaoleiWindow = new JFrame("扫雷GAME");
        SaoleiWindow.setLayout(new BorderLayout());

        SaoleiWindow.setSize(1250, 900);
        SaoleiWindow.setResizable(false);    // 固定窗口大小

        SaoleiWindow.add(Firstwindow(), "North");
        SaoleiWindow.add(Lastwindow(), "Center");

        SaoleiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SaoleiWindow.setVisible(true);

    }


    private JPanel Firstwindow() {    // 标签按钮

        JPanel firstlable = new JPanel();

        firstlable.setLayout(new GridLayout(1, 5));

        JButton lableOne = new JButton("查看标记数量");
        JButton lableTwo = new JButton("模式选择");
        JButton lableThree = new JButton("重新开始");
        JButton lableFour = new JButton("游戏帮助");
        JButton lableFive = new JButton("关于");

        lableOne.addActionListener(Eventtest.new MouseOpenLableOne());
        lableTwo.addActionListener(Eventtest.new MouseOpenLableTwo());
        lableThree.addActionListener(Eventtest.new MouseOpenLableThree());
        lableFour.addActionListener(Eventtest.new MouseOpenLableFour());
        lableFive.addActionListener(Eventtest.new MouseOpenLableFive());

        firstlable.add(lableOne);
        firstlable.add(lableTwo);
        firstlable.add(lableThree);
        firstlable.add(lableFour);
        firstlable.add(lableFive);

        firstlable.setVisible(true);

        return firstlable;

    }



    private JPanel Lastwindow() {    // 雷区

        JPanel lastlable = new JPanel();

        lastlable.setLayout(new GridLayout(24, 30));

        Codetest.algorithmsMethodMax();    // 调用数据结构总方法


        for (int i = 0; i < Codetest.row; i++) {
            for (int j = 0; j < Codetest.col; j++) {

                Codetest.codeButton[i][j] = new JButton();    // Button暗格

                Codetest.codeButton[i][j].setBackground(Color.lightGray);

//              Codetest.codeButton[i][j] = new JButton(String.valueOf(Codetest.code[i][j]));   //显示所有数据

                Codetest.codeButton[i][j].addMouseListener(Eventtest.new MouseOpenButton());    // 监听器注册

                lastlable.add(Codetest.codeButton[i][j]);

            }
        }

        lastlable.setVisible(true);

        return lastlable;

    }



}
