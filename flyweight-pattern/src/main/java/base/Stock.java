/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Stock.java
 * 模块说明：
 * 修改历史：
 * 2021年07月06日 - XX - 创建。
 */
package
        base;

/**
 * @author XX
 * @since 1.0
 */
public class Stock {
    private int total; // 库存总量
    private int used;  // 库存已用

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
