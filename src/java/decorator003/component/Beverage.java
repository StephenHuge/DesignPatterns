package decorator003.component;

/**
 * Created by 40741 on 2018/7/18.
 * 饮料抽象类，其它的饮料类应该继承它。
 */
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 花费
     */
    public abstract double cost();

    @Override
    public String toString() {
        return this.description + " : " + this.cost();
    }

}
