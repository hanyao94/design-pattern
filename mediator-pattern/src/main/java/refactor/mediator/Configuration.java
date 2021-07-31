/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Configuration.java
 * 模块说明：
 * 修改历史：
 * 2021年07月31日 - XX - 创建。
 */
package
        refactor.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class Configuration {
    protected Connection connection;
    protected Map<String,String> dataSource;
    protected  Map<String,XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
