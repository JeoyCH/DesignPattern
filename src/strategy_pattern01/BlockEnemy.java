package strategy_pattern01;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class BlockEnemy implements  IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
