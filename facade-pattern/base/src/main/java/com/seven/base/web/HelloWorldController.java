/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： HelloWorldController.java
 * 模块说明：
 * 修改历史：
 * 2021年07月02日 - XX - 创建。
 */
package
        com.seven.base.web;

import com.seven.base.domain.UserInfo;
import com.seven.base.plugin.annotation.DoDoor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XX
 * @since 1.0
 */
@RestController
public class HelloWorldController {

    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"⾮⽩名单可访问⽤户拦截！\"}")
    @RequestMapping(path = "/api/query-user-info2",method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId){
        return new UserInfo("⾍⾍:" + userId, 19, "天津市南开区旮旯胡同100号");
    }
}
