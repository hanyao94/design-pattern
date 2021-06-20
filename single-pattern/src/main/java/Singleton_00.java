/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_00.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使⽤
 * @use
 *  以上这种⽅式在我们平常的业务开发中⾮常场常⻅，这样静态类的⽅式可以在第⼀次运⾏的时候直接初始化Map类，同时这⾥我们也不需要到延迟加载在使⽤。
 *  在不需要维持任何状态下，仅仅⽤于全局访问，这个使⽤使⽤静态类的⽅式更加⽅便。
 *  但如果需要被继承以及需要维持⼀些特定状态的情况下，就适合使⽤单例模式
 * @author XX
 * @since 1.0
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
