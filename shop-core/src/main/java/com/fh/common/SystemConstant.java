package com.fh.common;

public class SystemConstant {
    public static  final String LOGIN_USER = "user";
    //pdf 导出的位置
    public static final String PDF_PATH = "/template" ;
    //商品的模板路径
    public static final String product_Template = "productPdTemplate.html" ;

    public static final String WORKBOOK_HEADER = "商品列表" ;

    public static final String PRICE_NUM_STYLE= "0.00";

    public static final String DATE_FORMT= "yyyy-mm-dd";

    public static final String CATELIST_KEY = "cateList";

    public static final int CATELIST_KEY_EXPIRE = 10 * 60;

    public static  final int PRODUCT_IS_DOWN =0;

    public static final String GOODS_IS_UP = "1";

    public static final String GOODS_IS_HOT = "1";

    public static final String HOT_GOODS_LIST_KEY = "hotGoodsList";

    public static final int HOT_GOODS_LIST_KEY_EXPIRE = 30 * 60;

    public static final String RECOMMEND_BRAND = "1";

    public static final String RECOMMEND_BRAND_LIST = "recommendBrandList";

    public static final int RECOMMEND_BRAND_LIST_EXPIRE = 10 * 60;

    public static final String UPLOAD_IMAGE_PATH = "/uploadImages/";

    public static final String UPLOAD_FILE_PATH = "f:/fh1906b/";

    public static final String APP_SECRET = "7987j23[*(}*&&^HNKJKK&^VGVLK!!JW@#%&^&";

    public static final String CURRENT_MEMBER = "currMember";
    // 接口中的变量 默认情况下 就会自动加上 public static final
    public interface OrderStatus{
        int WAIT_PAY = 10;
        int PAY_SUCCESS = 20;
        int SEND_GOODS = 30;


    }
}
