package utils;

/**
 * Created by huxunqiang on 17/4/16.
 * 板块
 */
public enum RecommendPlate {
    HOME(101),//首页
    LIST(201),//列表
    GENERAL(1);//通用

    private int val;

    RecommendPlate(int i) {
        this.val = i;
    }

    public int getVal() {
        return val;
    }
}
