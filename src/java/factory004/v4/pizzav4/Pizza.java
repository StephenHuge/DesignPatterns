package factory004.v4.pizzav4;

import factory004.v4.ingredient.*;

import java.util.ArrayList;

/**
 * Created by 40741 on 2018/7/23.
 */
public abstract class Pizza {
    /**
     * 名称
     */
    protected String name;
    /**
     * 面团类型
     */
    protected Dough dough;
    /**
     * 酱料
     */
    protected Sauce sauce;
    /**
     * 蔬菜
     */
    protected Veggie[] veggies;

    /**
     * 奶酪
     */
    protected Cheese cheese;

    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("温度350摄氏度，烤制25分钟。");
    }
    public void cut() {
        System.out.println("开始沿对角线切披萨...");
    }
    public void box() {
        System.out.println("将披萨装入正规的包装袋...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
