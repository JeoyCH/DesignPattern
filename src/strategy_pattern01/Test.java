package strategy_pattern01;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class Test {
    private  IStrategy strategy;

    public Test(IStrategy iStrategy) {
        this.strategy=iStrategy;
    }

    public  void operate(){
        this.strategy.operate();
    }


}
