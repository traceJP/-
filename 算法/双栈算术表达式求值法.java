package 算法;

import java.util.Stack;
import java.util.Scanner;

public class 双栈算术表达式求值法 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner StdIn = new Scanner(System.in);
        while (StdIn.hasNext()) {                           //hasNext不会返回false,只会等待输入，形成闭塞
            String s = StdIn.next();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v += vals.pop();
                else if (op.equals("-")) v -= vals.pop();
                else if (op.equals("*")) v *= vals.pop();
                else if (op.equals("/")) v /= vals.pop();
                vals.push(v);
            } else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
