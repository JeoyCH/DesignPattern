package proxy_parttern02;

/**
 * Created by Android_61 on 2017/5/5.
 */
public class WangPo implements KindWomen {
    private  KindWomen kindWomen;

    public WangPo() {
        this.kindWomen=new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
