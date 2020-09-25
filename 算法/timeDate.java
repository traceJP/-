/*一种封装日期的抽象数据类型的实现方法*/

package 算法;

public class timeDate {
    private final int value;

    public timeDate(int m, int d, int y) {
        value = y * 512 + m * 32 + d;
    }

    public int month() {
        return (value / 32) % 16;
    }

    public int day() {
        return value % 32;
    }

    public int year() {
        return value / 512;
    }

    public String toString_timeDate() {
        return month() + "/" + day() + "/" + year();
    }
}
