/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_06.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */

import java.util.concurrent.atomic.AtomicReference;

/**
 *  CAS「AtomicReference」(线程安全)
 * @use
 *  java并发库提供了很多原⼦类来⽀持并发访问的数据安全
 * 性； AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。
 * AtomicReference 可以封装引⽤⼀个V实例，⽀持并发访问如上的单例⽅式就是使⽤了这样的⼀个
 * 特点。
 * 使⽤CAS的好处就是不需要使⽤传统的加锁⽅式保证线程安全，⽽是依赖于CAS的忙等算法，依赖
 * 于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外
 * 的开销，并且可以⽀持较⼤的并发性。
 * 当然CAS也有⼀个缺点就是忙等，如果⼀直没有获取到将会处于死循环中。
 * @author XX
 * @since 1.0
 */
public class Singleton_06 {
    private  static  final AtomicReference<Singleton_06> INSTANCE =    new AtomicReference<Singleton_06>();

    private static  Singleton_06 instance;

    private Singleton_06() {
    }

    public static Singleton_06 getInstance(){
        for (;;){
            instance = INSTANCE.get();
            if (instance !=null) return instance;
            INSTANCE.compareAndSet(null,new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance()); //
        System.out.println(Singleton_06.getInstance()); //
    }
}
