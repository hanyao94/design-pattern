/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Singleton_03.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */

/**
 * 饿汉模式(线程安全)
 * @use
 *  此种⽅式与我们开头的第⼀个实例化 Map 基本⼀致，在程序启动的时候直接运⾏加载，后续有外
 * 部需要使⽤的时候获取即可。
 * 但此种⽅式并不是懒加载，也就是说⽆论你程序中是否⽤到这样的类都会在程序启动之初进⾏创
 * 建。
 * 那么这种⽅式导致的问题就像你下载个游戏软件，可能你游戏地图还没有打开呢，但是程序已经将
 * 这些地图全部实例化。到你⼿机上最明显体验就⼀开游戏内存满了，⼿机卡了，需要换了。
 * @author XX
 * @since 1.0
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    private static Singleton_03 getInstance(){
        return instance;
    }
}
