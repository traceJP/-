package MineClearance;

import javax.swing.*;
import java.util.Random;

public class Algorithms {

    public final int row = 24;    // 行
    public final int col = 30;    // 列
    public final int mine = -1;    //雷标记


    static public int Quantity = 99;    // 雷的数量(可更改)

    static public int MineSum = 0;    // 记雷器

    static public int[][] code = new int[24][30];    // Button对应数据
    static public JButton[][] codeButton = new JButton[24][30];    // Button单独对象名为codeButton[][]
    static public int[][] codeDisplay = new int[24][30];    // Button对应状态：0(未翻开)，1(翻开)，2(旗帜-感叹号)，3(未知-问号)


    public void algorithmsMethodMax() {

        Buriedmine();
        Calculation();

    }

    private void Buriedmine() {    // 埋雷

        Random n = new Random();

        for (int i = 0; i < Quantity; i++) {

            int a = n.nextInt(row);    // 行随机数
            int b = n.nextInt(col);    // 列随机数

            if (code[a][b] == mine) {
                i--;
            } else {
                code[a][b] = mine;
            }
        }

    }

    private void Calculation() {    // 计算雷周围的数字

        for (int i = 1; i < col - 1; i++) {

            if (code[0][i] == mine) {
                continue;
            }

            int count = 0;

            if (code[0][i - 1] == mine) {    //左
                count++;
            }
            if (code[0][i + 1] == mine) {    //右
                count++;
            }
            if (code[1][i - 1] == mine) {    //左下
                count++;
            }
            if (code[1][i] == mine) {    //下
                count++;
            }
            if (code[1][i + 1] == mine) {    //右下
                count++;
            }

            code[0][i] = count;

        }    // 上边框数字计算（不包含角）

        for (int i = 1; i < col - 1; i++) {

            if (code[row - 1][i] == mine) {
                continue;
            }

            int count = 0;

            if (code[row - 1 - 1][i - 1] == mine) {    // 左上
                count++;
            }
            if (code[row - 1 - 1][i] == mine) {    // 上
                count++;
            }
            if (code[row - 1 - 1][i + 1] == mine) {    //右上
                count++;
            }
            if (code[row - 1][i - 1] == mine) {    //左
                count++;
            }
            if (code[row - 1][i + 1] == mine) {    //右
                count++;
            }

            code[row - 1][i] = count;

        }    // 下边框数字计算（不包含角）

        for (int i = 1; i < row - 1; i++) {

            if (code[i][0] == mine) {
                continue;
            }

            int count = 0;

            if (code[i - 1][0] == mine) {    // 上
                count++;
            }
            if (code[i - 1][1] == mine) {    //右上
                count++;
            }
            if (code[i][1] == mine) {    //右
                count++;
            }
            if (code[i + 1][0] == mine) {    //下
                count++;
            }
            if (code[i + 1][1] == mine) {    //右下
                count++;
            }

            code[i][0] = count;

        }    // 左边框数字计算（不包含角）

        for (int i = 1; i < row - 1; i++) {

            if (code[i][col - 1] == mine) {
                continue;
            }

            int count = 0;

            if (code[i - 1][col - 1 - 1] == mine) {    // 左上
                count++;
            }
            if (code[i - 1][col - 1] == mine) {    // 上
                count++;
            }
            if (code[i][col - 1 - 1] == mine) {    //左
                count++;
            }
            if (code[i + 1][col - 1 - 1] == mine) {    //左下
                count++;
            }
            if (code[i + 1][col - 1] == mine) {    //下
                count++;
            }

            code[i][col - 1] = count;

        }    // 右边框数字计算（不包含角）

        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {

                if (code[i][j] == mine) {
                    continue;
                }

                int count = 0;

                if (code[i - 1][j - 1] == mine) {    // 左上
                    count++;
                }
                if (code[i - 1][j] == mine) {    // 上
                    count++;
                }
                if (code[i - 1][j + 1] == mine) {    //右上
                    count++;
                }
                if (code[i][j - 1] == mine) {    //左
                    count++;
                }
                if (code[i][j + 1] == mine) {    //右
                    count++;
                }
                if (code[i + 1][j - 1] == mine) {    //左下
                    count++;
                }
                if (code[i + 1][j] == mine) {    //下
                    count++;
                }
                if (code[i + 1][j + 1] == mine) {    //右下
                    count++;
                }

                code[i][j] = count;

            }

        }    // 中央数字计算

        CalculationAngle();    // 四角数字计算
    }

    private void CalculationAngle() {

        int count = 0;

        if (code[0][0] != mine) {
            if (code[0][1] == mine) {
                count++;
            }
            if (code[1][0] == mine) {
                count++;
            }
            if (code[1][1] == mine) {
                count++;
            }
            code[0][0] = count;
        }    // 左上角

        count = 0;

        if (code[0][col - 1] != mine) {
            if (code[0][col - 1 - 1] == mine) {
                count++;
            }
            if (code[1][col - 1] == mine) {
                count++;
            }
            if (code[1][col - 1 - 1] == mine) {
                count++;
            }
            code[0][col - 1] = count;
        }    // 右上角

        count = 0;

        if (code[row - 1][0] != mine) {
            if (code[row - 1 - 1][0] == mine) {
                count++;
            }
            if (code[row - 1][1] == mine) {
                count++;
            }
            if (code[row - 1 - 1][1] == mine) {
                count++;
            }
            code[row - 1][0] = count;
        }    // 左下角

        count = 0;

        if (code[row - 1][col - 1] != mine) {
            if (code[row - 1][col - 1 - 1] == mine) {
                count++;
            }
            if (code[row - 1 - 1][col - 1] == mine) {
                count++;
            }
            if (code[row - 1 - 1][col - 1 - 1] == mine) {
                count++;
            }
            code[row - 1][col - 1] = count;
        }    // 右下角

    }


}
