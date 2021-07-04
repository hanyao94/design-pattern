/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： UserInfo.java
 * 模块说明：
 * 修改历史：
 * 2021年07月01日 - XX - 创建。
 */
package
        com.seven.base.domain;

/**
 * @author XX
 * @since 1.0
 */
public class UserInfo {
    //code、info可以统一定义一个类
    private String code;
    private String info;

    private String name;
    private Integer age;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info, String name, Integer age, String address) {
        this.code = code;
        this.info = info;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
