package com.wjh.myssm.basedao;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnUtil {

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    //private static ThreadLocal<Object> threadLocal2 = new ThreadLocal<>();
    //private static ThreadLocal<Object> threadLocal3 = new ThreadLocal<>();

    //    public static String DRIVER;
//    public static String URL;
//    public static String USER;
//    public static String PWD;
    static Properties pro = new Properties();

    static {
        InputStream is = ConnUtil.class.getClassLoader().getResourceAsStream("JDBC.properties");

        try {
            pro.load(is);
//            DRIVER = pro.getProperty("driver");
//            URL = pro.getProperty("url");
//            USER = pro.getProperty("username");
//            PWD = pro.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Connection createConn() {
        try {

            DruidDataSourceFactory dataSourceFactory = new DruidDataSourceFactory();
            DataSource dataSource = dataSourceFactory.createDataSource(pro);
            return dataSource.getConnection();

            //1.加载驱动
//            Class.forName(DRIVER);
            //2.通过驱动管理器获取连接对象
//            return DriverManager.getConnection(URL, USER, PWD);
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Connection getConn() {
        Connection conn = threadLocal.get();
        if (conn == null) {
            conn = createConn();
            threadLocal.set(conn);
        }
        return threadLocal.get();
    }

    public static void closeConn() throws SQLException {
        Connection conn = threadLocal.get();
        if (conn == null) {
            return;
        }
        if (!conn.isClosed()) {
            conn.close();
            //threadLocal.set(null);
            threadLocal.remove();
        }
    }
}
