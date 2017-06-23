package strategy_pattern01;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
