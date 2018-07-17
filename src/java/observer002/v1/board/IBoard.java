package observer002.v1.board;

/**
 * Created by 40741 on 2018/7/16.
 * 公告板接口，所有布告板应该实现这个接口。
 */
public interface IBoard {
    void update(float temp, float humidity, float pressure);
}
