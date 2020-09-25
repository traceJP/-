package MineClearance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventTrigger {

    Algorithms EventAlgorithms = new Algorithms();

    class MouseOpenButton extends MouseAdapter {    // 监听雷区鼠标左右键

        public void mousePressed(MouseEvent e) {


            for (int i = 0; i < EventAlgorithms.row; i++) {

                for (int j = 0; j < EventAlgorithms.col; j++) {

                    if ((JButton) e.getSource() == EventAlgorithms.codeButton[i][j]) {    // 找到目标Button

                        if (e.getButton() == MouseEvent.BUTTON1) {    // 鼠标左键

                            Openlattice(i, j);
                            return;

                        }

                        if (e.getButton() == MouseEvent.BUTTON3) {    // 鼠标右键

                            insertFlag(i, j);
                            return;

                        }

                    }

                }

            }

        }

        private void Openlattice(int i, int j) {    // 鼠标左键总方法

            if (EventAlgorithms.codeDisplay[i][j] == 1 || EventAlgorithms.codeDisplay[i][j] == 2 || EventAlgorithms.codeDisplay[i][j] == 3) {
                return;    // 状态为翻开或标记时，不予以打开
            }


            if (EventAlgorithms.code[i][j] == EventAlgorithms.mine) {

                EventAlgorithms.codeButton[i][j].setBackground(Color.red);
                EventAlgorithms.codeButton[i][j].setText("*");

                //调用踩雷死亡游戏结束方法
                gameOver();

            } else if (EventAlgorithms.code[i][j] == 0) {

                //调用级联打开方法
                cascadeOpen(i, j);

            } else {

                //打开按钮显示文字
                EventAlgorithms.codeDisplay[i][j] = 1;    // 状态改变为打开
                EventAlgorithms.codeButton[i][j].setBackground(Color.WHITE);
                EventAlgorithms.codeButton[i][j].setText(String.valueOf(EventAlgorithms.code[i][j]));

            }

            if (gameWinCondition()) {    // 游戏胜利条件

                //调用游戏胜利结束方法
                gameWin();

            }

        }

        private void cascadeOpen(int x, int y) {    // 级联打开     !需要优化!

            /*思想优化：当传入过来的buttonCode=0时，将该点坐标坐标x,y压入栈中，并检测该点周围是否还有其他点=0*/

            if (EventAlgorithms.codeDisplay[x][y] != 0) {
                return;
            }

            EventAlgorithms.codeDisplay[x][y] = 1;    // 状态改变为打开
            EventAlgorithms.codeButton[x][y].setBackground(Color.WHITE);
            if (EventAlgorithms.code[x][y] == 0) {
                EventAlgorithms.codeButton[x][y].setText("");
            } else {
                EventAlgorithms.codeButton[x][y].setText(String.valueOf(EventAlgorithms.code[x][y]));
            }

            if (EventAlgorithms.code[x][y] == 0) {

                cascadeOpen(x - 1, y - 1);
                cascadeOpen(x - 1, y);
                cascadeOpen(x - 1, y + 1);
                cascadeOpen(x, y - 1);
                cascadeOpen(x, y + 1);
                cascadeOpen(x + 1, y - 1);
                cascadeOpen(x + 1, y);
                cascadeOpen(x + 1, y + 1);

            }

        }

        private void gameOver() {    // 游戏结束提示窗口

            Object[] text = {"确定", "退出游戏", "再来一局"};

            JOptionPane Over = new JOptionPane();    // 创建提示游戏结束窗口

            int n = JOptionPane.showOptionDialog(Over, "您不小心踩到了地雷！游戏已结束，感谢游玩！", "您已死亡",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, text, text[0]);

            if (n == 0 || n == -1) {    // 点击确定和关闭 & 右上角X符

                for (int i = 0; i < EventAlgorithms.row; i++) {
                    for (int j = 0; j < EventAlgorithms.col; j++) {

                        // 锁定所有雷区按钮
                        EventAlgorithms.codeDisplay[i][j] = 1;    // 调整所有Button为已翻开状态

                        //打开所有按钮
                        if (EventAlgorithms.code[i][j] == -1) {
                            EventAlgorithms.codeButton[i][j].setBackground(Color.red);
                            EventAlgorithms.codeButton[i][j].setText("*");
                        } else {
                            EventAlgorithms.codeButton[i][j].setBackground(Color.WHITE);
                            EventAlgorithms.codeButton[i][j].setText(String.valueOf(EventAlgorithms.code[i][j]));
                        }


                    }

                }

            }
            if (n == 1) {    // 点击退出游戏

                System.exit(0);

            }
            if (n == 2) {    // 再来一局

                LastwindowLoadagain();

            }

        }

        private boolean gameWinCondition() {

            int sum = 0;

            for (int i = 0; i < EventAlgorithms.row; i++) {
                for (int j = 0; j < EventAlgorithms.col; j++) {

                    if (EventAlgorithms.codeDisplay[i][j] == 0) {    // 如果有一个未翻开的就不会赢
                        return false;
                    }

                    if (EventAlgorithms.codeDisplay[i][j] == 1) {
                        sum++;
                    }

                }
            }

            if (sum == EventAlgorithms.row * EventAlgorithms.col - EventAlgorithms.Quantity) {
                return true;
            }

            return false;

        }

        private void gameWin() {

            Object[] text = {"确定", "退出游戏", "再来一局"};

            JOptionPane Win = new JOptionPane();

            int n = JOptionPane.showOptionDialog(Win, "您已经成功排除" + EventAlgorithms.Quantity + "颗地雷，恭喜你！", "游戏胜利",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, text, text[0]);

            if (n == 0 || n == -1) {
                // 不做任何反应
            }
            if (n == 1) {    // 点击退出游戏

                System.exit(0);

            }
            if (n == 2) {    // 再来一局

                LastwindowLoadagain();

            }

        }


        private void LastwindowLoadagain() {    // 雷区再加载方法

            for (int i = 0; i < EventAlgorithms.row; i++) {
                for (int j = 0; j < EventAlgorithms.col; j++) {

                    EventAlgorithms.MineSum = 0;
                    EventAlgorithms.codeDisplay[i][j] = 0;
                    EventAlgorithms.code[i][j] = 0;
                    EventAlgorithms.codeButton[i][j].setBackground(Color.lightGray);
                    EventAlgorithms.codeButton[i][j].setText("");

                }
            }

            EventAlgorithms.algorithmsMethodMax();

        }


        private void insertFlag(int i, int j) {    // 鼠标右键总方法

            if (EventAlgorithms.codeDisplay[i][j] == 0) {

                EventAlgorithms.MineSum++;
                EventAlgorithms.codeButton[i][j].setText("!");
                EventAlgorithms.codeDisplay[i][j] = 2;

            } else if (EventAlgorithms.codeDisplay[i][j] == 2) {

                EventAlgorithms.codeButton[i][j].setText("?");
                EventAlgorithms.codeDisplay[i][j] = 3;

            } else if (EventAlgorithms.codeDisplay[i][j] == 3) {

                EventAlgorithms.MineSum--;
                EventAlgorithms.codeButton[i][j].setText("");
                EventAlgorithms.codeDisplay[i][j] = 0;

            }

            if (gameWinCondition()) {    // 游戏胜利条件

                //调用游戏胜利结束方法
                gameWin();

            }

        }

    }    // 雷区鼠标左右键

    class MouseOpenLableOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Difficulty = "普通";

            if (EventAlgorithms.Quantity == 66) {
                Difficulty = "简单";
            } else if (EventAlgorithms.Quantity == 99) {
                Difficulty = "普通";
            } else if (EventAlgorithms.Quantity == 123) {
                Difficulty = "困难";
            } else if (EventAlgorithms.Quantity == 233) {
                Difficulty = "噩梦";
            }


            JOptionPane Minesum = new JOptionPane();
            JOptionPane.showConfirmDialog(Minesum,
                    "当前游戏难度为：" + Difficulty +
                            "\n\n一共有 " + EventAlgorithms.Quantity + " 个雷\n" +
                            "您已标记了 " + EventAlgorithms.MineSum + " 个雷\n" +
                            "理论剩余 " + (EventAlgorithms.Quantity - EventAlgorithms.MineSum) + " 个雷\n",
                    "场面参数", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);

        }

    }   // 查看标记数量

    class MouseOpenLableTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object[] text = {"简单", "普通", "困难", "噩梦"};

            JOptionPane About = new JOptionPane();

            int n = JOptionPane.showOptionDialog(About,
                    "点击下方按钮即可更改游戏难度\n\n" +
                            "警告:\n" +
                            "游戏难度变更后游戏将重新开始！！！",
                    "难度更改",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, text, text[3]);

            if (n == 0) {

                EventAlgorithms.Quantity = 66;
                new EventTrigger().new MouseOpenButton().LastwindowLoadagain();

            }

            if (n == 1) {

                EventAlgorithms.Quantity = 99;
                new EventTrigger().new MouseOpenButton().LastwindowLoadagain();

            }

            if (n == 2) {

                EventAlgorithms.Quantity = 123;
                new EventTrigger().new MouseOpenButton().LastwindowLoadagain();

            }

            if (n == 3) {

                EventAlgorithms.Quantity = 166;
                new EventTrigger().new MouseOpenButton().LastwindowLoadagain();

            }

        }

    }    // 模式选择

    class MouseOpenLableThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            new EventTrigger().new MouseOpenButton().LastwindowLoadagain();

        }

    }    // 重新开始

    class MouseOpenLableFour implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object[] text = {"我明白了！", "我还是不懂~"};

            JOptionPane Win = new JOptionPane();

            int n = JOptionPane.showOptionDialog(Win,
                    "胜利条件：\n" +
                            "你需要在不点错雷的情况下尽可能快的将所有的雷都标记出来\n\n" +
                            "如何操作：\n" +
                            "鼠标左键即可翻开一格，鼠标右键标记地雷（!），再次右键标记未知方块（？），再次右键即可取消标记\n\n" +
                            "数字是什么意思：\n" +
                            "你点出了一个数字，如果是1就说明它周围的8的格子里有1个雷，如果是2就有两个雷···以此类推。\n\n" +
                            "标识警告：\n" +
                            "（*）星号标识代表 地雷\n" +
                            "（!）感叹号标识代表 标记地雷\n" +
                            "（？）问号标识代表 标记未知方格\n",
                    "游戏规则",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, text, text[0]);

            if (n == 1) {

                JOptionPane Idonotknow = new JOptionPane();
                JOptionPane.showConfirmDialog(Idonotknow,
                        "详细参考www.baidu.com关键词 “扫雷规则”",
                        "为什么你这都看不懂？？？", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);

            }

        }

    }    // 游戏帮助

    class MouseOpenLableFive implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object[] text = {"关于作者", "开发小剧场", "版本号"};

            JOptionPane About = new JOptionPane();

            int n = JOptionPane.showOptionDialog(About,
                    "后记：这只是一个小小的扫雷游戏罢了\n\n" +
                            "开发日期：2020.6.11-2020.6.12\n" +
                            "技术框架：Java语言+Swing框架+数据结构\n" +
                            "作者：JP233\n",
                    "关于",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, text, text[0]);


            if (n == 0) {

                JOptionPane aboutAuthor = new JOptionPane();
                JOptionPane.showConfirmDialog(aboutAuthor,
                        "-在二进制的世界里，没人可以命令我，没规则可以束缚我-\n-LJP-",
                        "关于作者", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);

            }

            if (n == 1) {

                JOptionPane aboutTheater = new JOptionPane();
                JOptionPane.showConfirmDialog(aboutTheater,
                        "2020.6.11(am):\n" +
                                "“me：不过是个扫雷游戏而已嘛...一个小时就能写完\n\n”" +
                                "2020.6.11（pm）：\n" +
                                "“me：我去，这数据结构也太难了把，怎么布雷?...让我思考思考...哦我懂了，\n" +
                                "只需要for几遍，然后ifelse就完事了，没意思，简单的很~" +
                                "我擦为什么我ifelse嵌套了200多行代码？？？这咋整啊，这主界面会卡死的把...\n" +
                                "算了算了...闭着眼睛调优也是可以的，就当没发生过把\n\n”" +
                                "2020.6.11(night):\n" +
                                "me：“我丢，为什么数据分离报错了，？？？啊，难道我之前写的全是错的么？\n" +
                                "我擦，裂开了...（一晚上过去了）...都凌晨1点多了，算了睡觉先把...”\n\n" +
                                "2020.6.12(am):\n" +
                                "“昨晚好像做了一个很奇怪的梦...我梦到了貌似在这行数据上加上一个static\n" +
                                "就能解决问题来着？？.算了试一下呗...？？？竟然不报错了？啊这都行？..\n" +
                                "算了修好就可以了，搞不好是冯诺依曼托梦教我修bug呢...”\n\n" +
                                "2020.6.12(pm-night):\n" +
                                "“终于结束了么？虽然代码千疮百孔，但...好歹可以跑起来了,那就写到这吧~”\n\n",
                        "开发小剧场", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);

            }

            if (n == 2) {

                JOptionPane aboutVersion = new JOptionPane();
                JOptionPane.showConfirmDialog(aboutVersion,
                        "当前版本：-v3.0-\n" +
                                "更新时间：2020.6.14\n" +
                                "本次更新：\n" +
                                "-更改了雷数字的背景颜色为白色，降低了噩梦难度下雷的数量\n" +
                                "-优化了级联打开功能\n" +
                                "-修复了初始化难度不显示的Bug,记雷器未被重置的Bug",
                        "版本号", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE);

            }

        }


    }    // 关于


}
