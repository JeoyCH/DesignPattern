import proxy_parttern02.WangPo;
import strategy_pattern01.BackDoor;
import strategy_pattern01.Test;

public class Main {

    public static void main(String[] args) {
        test01();
        test02();
    }

    private static void test02() {
        WangPo wangPo=new WangPo();
        wangPo.happyWithMan();
        wangPo.makeEyesWithMan();
    }

    private static void test01() {
        Test test = new Test(new BackDoor());
        test.operate();
    }
}
