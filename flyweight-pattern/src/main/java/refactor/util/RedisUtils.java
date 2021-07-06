/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： RedisUtils.java
 * 模块说明：
 * 修改历史：
 * 2021年07月07日 - XX - 创建。
 */
package
        refactor.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author XX
 * @since 1.0
 */
public class RedisUtils {
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger();

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                stock.addAndGet(1);
            }
        },0,1000,  TimeUnit.MICROSECONDS);
    }

    public  int getStockUsed(){
       return stock.get();
    }
}
