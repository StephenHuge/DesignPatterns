package decorator003;

import decorator003.component.Beverage;
import decorator003.component.impl.DarkRoast;
import decorator003.component.impl.Decaf;
import decorator003.component.impl.Espresso;
import decorator003.component.impl.HouseBlend;
import decorator003.decorator.impl.Mocha;
import decorator003.decorator.impl.Soy;
import decorator003.decorator.impl.Whip;

/**
 * Created by 40741 on 2018/7/18.
 * 星巴兹咖啡馆，装饰者模式测试类。
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 来杯浓缩咖啡
        Beverage espresso = new Espresso();
        System.out.println(espresso);

        // 无咖啡因咖啡，加双份摩卡，1份奶泡
        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        System.out.printf("%s : %.2f\n", decaf.getDescription(), decaf.cost());
        // 深焙咖啡，加双份摩卡，1份奶泡
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.printf("%s : %.2f\n", darkRoast.getDescription(), darkRoast.cost());
        // 综合咖啡，加一份豆浆，一份摩卡，一份奶泡
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.printf("%s : %.2f\n", houseBlend.getDescription(), houseBlend.cost());


    }
}
