/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

import messy.QuestionBankController;
import org.junit.Test;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {

    @Test
    public void test1(){
        QuestionBankController controller = new QuestionBankController();
        System.out.println(controller.createPaper("花花", "1000001921032"));
        System.out.println(controller.createPaper("豆豆", "1000001921051"));
        System.out.println(controller.createPaper("大宝", "1000001921987"));
    }

    @Test
    public void test2() throws CloneNotSupportedException {
        refactor.QuestionBankController questionBankController = new refactor.QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
