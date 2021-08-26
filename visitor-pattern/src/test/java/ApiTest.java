/**
 * 项目名：	design-pattern
 * 文件名：	ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */

import com.seven.refactor.DataView;
import com.seven.refactor.visitor.impl.Parent;
import com.seven.refactor.visitor.impl.Princial;
import org.junit.Test;

/**
 * @author seven
 */
public class ApiTest {

  @Test
  public  void test(){
    DataView dataView = new DataView();
    dataView.show(new Parent());
    dataView.show(new Princial());
  }
}
