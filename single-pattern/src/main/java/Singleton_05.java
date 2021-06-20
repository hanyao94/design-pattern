/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_05.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

/**
 * 双重锁校验(线程安全)
 * @use
 *  双重锁的⽅式是⽅法级锁的优化，减少了部分获取实例的耗时。
 * 同时这种⽅式也满⾜了懒加载
 * @author XX
 * @since 1.0
 */
public class Singleton_05 {
    private static  Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance(){
        if (instance != null) return  instance;
        synchronized (Singleton_05.class){
            if (instance == null){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
