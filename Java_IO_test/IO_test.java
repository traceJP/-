package Java_IO_test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class IO_test {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.baidu.com");

        HttpURLConnection HttpConnection = (HttpURLConnection) url.openConnection();

        HttpConnection.connect();    // 建立连接

        // 输入流
        BufferedReader putZ = new BufferedReader(
                new InputStreamReader(
                        HttpConnection.getInputStream()
                )
        );
        // 文件流
        FileWriter OutFile = new FileWriter(
                new File("E:\\测试Java项目\\src\\Java_IO_test\\IO_bilibili.html")
        );

        int isEnd;
        while ((isEnd = putZ.read()) != -1) {
            OutFile.write((char) isEnd);
        }

        OutFile.close();
        putZ.close();
        HttpConnection.disconnect();

    }
}
