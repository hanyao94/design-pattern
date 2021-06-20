/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_01.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

/**
 * 懒汉模式(线程不安全)
 * @use
 *  ⽬前此种⽅式的单例确实满⾜了懒加载，但是如果有多个访问者同时去获取对象实例你可以想象成
 *  ⼀堆⼈在抢厕所，就会造成多个同样的实例并存，从⽽没有达到单例的要求
 * @author XX
 * @since 1.0
 */
public class Singleton_01 {
    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance(){
        if (null != instance) return instance;
        instance = new Singleton_01();
        return instance;
    }
}
