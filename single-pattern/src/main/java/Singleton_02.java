/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_02.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

/**
 * 懒汉模式(线程安全)
 * @use
 *  此种模式虽然是安全的，但由于把锁加到⽅法上后，所有的访问都因需要锁占⽤导致资源的浪费。
 * 如果不是特殊情况下，不建议此种⽅式实现单例模式
 * @author XX
 * @since 1.0
 */
public class Singleton_02 {
    private static  Singleton_02 instance;

    private Singleton_02() {
    }

    private static synchronized Singleton_02 getInstance(){
        if(instance != null) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
