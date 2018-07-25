package factory004.pizza;

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
    protected String dough;
    /**
     * 酱料
     */
    protected String sauce;
    /**
     * 佐料
     */
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("正在准备 : " + name);
        System.out.println("正在揉面...");
        System.out.println("正在添加酱料...");
        System.out.println("正在添加佐料...");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }

    }
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
}
