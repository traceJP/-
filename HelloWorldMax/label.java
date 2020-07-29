//通过label标签在二维数组中找值

package HelloWorldMax;

public class label {
    public static void main(String[] args) {

        int count = 0;

        que:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < 5; k++) {

                    count++;
                    //break;                    //ij,一共循环5次             ijk.一共循环25次
                    //break que;                //ij,一共循环1次             ijk.一共循环1次
                    //continue;                 //ij,一共循环25次            ijk.一共循环125次
                    //continue que;             //ij,一共循环5次             ijk.一共循环5次
                }
            }
        }

        System.out.println(count);

    }

}
