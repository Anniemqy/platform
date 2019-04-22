package utils;

/**
 * Created by hxq on 2017/6/1.
 * 顾问类型
 */
    public enum  AdviserType {
        FINANCE("1-"),//金融
        ENTERPRISE("2-"),//企业
        LAW("3-");//法律

        private String val;

        AdviserType(String p) {
            this.val = p;
        }

        public String getVal() {
            return val;
        }
    }
