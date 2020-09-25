package HelloMySql;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class HelloSQL {

    @Test
    public void Test() throws SQLException {

        // java.sql与com.mysql中有两个相同的类名
        // java.sql是java中的接口，com.mysql是mysql驱动实现java的接口，相当于一个多态
        Driver driver = new com.mysql.cj.jdbc.Driver();

        // url：与javaweb中的路径相似
        // jdbc:mysql    协议
        // localhost:3306    ip地址：mysql的默认端口号3306
        // test    数据库名
        // 需要统一连接mysql中的时间区域时差。所以需要给连接端口中serverTimezone中赋值GMT%2B8
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";

        // 将用户名和密码封装在Properties中
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "");

        // 获取连接
        Connection conn = driver.connect(url, info);

        System.out.println(conn);

    }

}
