/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： AuthLink.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */
package
        refactor;

import base.AuthInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public abstract class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
    protected String levelUserId;
    protected String levelUserName;
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }


    public AuthLink next(){
        return next;
    }

    public  AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    public  abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
