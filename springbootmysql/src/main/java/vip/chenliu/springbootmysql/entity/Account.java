package vip.chenliu.springbootmysql.entity;

/**
 * 描述:
 * 账户实体类
 *
 * @author zhou
 * @create 2019-05-05 下午9:53
 */

public class Account {
    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}