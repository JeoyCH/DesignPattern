package proxy_parttern02;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class XIMenQing {

    public static void main(String[] args) {
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo=new WangPo(jiaShi);
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }

}
