package strategy_pattern01;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
