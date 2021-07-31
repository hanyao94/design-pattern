/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： JDBCUtil.java
 * 模块说明：
 * 修改历史：
 * 2021年07月17日 - XX - 创建。
 */
package
        messy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author XX
 * @since 1.0
 */
public class JDBCUtil {
    private static Logger logger = LoggerFactory.getLogger(JDBCUtil.class);

    public static final String URL = "jdbc:mysql://rm-bp1s58ir8o88dhv4yto.mysql.rds.aliyuncs.com:3306/mas";
    public static  final  String  USER = "mas";
    public static  final  String  PASSWORD = "bB2^lQ0*hF1h7H";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM mas_user");
        while (resultSet.next()){
            logger.info("测试结果 姓名：{} 年龄：{}",
                    resultSet.getString("name"),resultSet.getInt("fversion"));
        }

    }

}
