package 算法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class 集合 {
    public static void main(String[] args) {
        Collection<String> Obj_a = new ArrayList<String>();
        Collection<String> Obj_b = new ArrayList<String>();
        Obj_a.add("张三");
        Obj_a.add("李四");
        Obj_b.addAll(Obj_a);
        Obj_a.clear();
        if (Obj_a.isEmpty())
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
        System.out.println("b集合现在一共有" + Obj_b.size() + "个元素");
        Iterator next1 = Obj_b.iterator();
        while (next1.hasNext()) {
            Object i = next1.next();
            System.out.println(i);
        }
        Object[] num = Obj_b.toArray();    //为什么是Object类型的


    }

}
