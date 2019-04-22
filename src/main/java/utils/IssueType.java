package utils;

/**
 * Created by hxq on 2017/3/29.
 * 1产品，2需求，3顾问，4通用
 */
public enum IssueType {
    PRODUCT(1),
    NEED(2),
    ADVISER(3),
    GENERAL(4);

    private int val;
    IssueType(int i) {
        this.val = i;
    }

    public int getVal() {
        return val;
    }
}
