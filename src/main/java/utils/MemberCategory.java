package utils;

import com.hiveview.enums.CategoryEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hxq on 2017/3/23.
 */
public class MemberCategory {

    private static Map<String,CategoryEnum> categoryMap = new HashMap<String,CategoryEnum>();

    static {
        for (CategoryEnum c : CategoryEnum.values()){
            categoryMap.put(c.getCode()+"-",c);
        }
    }

    /**
     * 获得需求类目
     */
    public static String getNeedCode(String code){
        if(code==null)
            return null;
        CategoryEnum c = categoryMap.get(code);
        if(c!=null){
            return c.getnCode()!=null?(c.getnCode().toString()+"-"):null;
        }
        return null;
    }


    /**
     * 获得产品类目
     * @param code
     * @return
     */
    public static String getProCode(String code){
        if(code==null)
            return null;
        CategoryEnum c = categoryMap.get(code);
        if(c!=null){
            return c.getpCode()==null?(c.getpCode().toString()+"-"):null;
        }
        return null;
    }
}
