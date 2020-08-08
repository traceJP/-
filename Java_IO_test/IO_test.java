package Java_IO_test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class IO_test {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.bilibili.com/bangumi/media/md28229233/?spm_id_from=666.25.b_6d656469615f6d6f64756c65.2");

        HttpURLConnection HttpConnection = (HttpURLConnection) url.openConnection();

        HttpConnection.connect();    // 建立连接

        InputStream put = HttpConnection.getInputStream();

        BufferedReader putZ = new BufferedReader(
                    new InputStreamReader(put)
                );


        File test = new File("E:\\测试Java项目\\src\\Java_IO_test\\IO_bilibili.html");

        FileWriter OutFile = new FileWriter(test);


        int isEnd;
        while((isEnd = putZ.read()) != -1) {
            if((byte)isEnd > 0)
                OutFile.write((char)isEnd);
        }

        OutFile.close();
        putZ.close();
        put.close();
        HttpConnection.disconnect();

    }
}
