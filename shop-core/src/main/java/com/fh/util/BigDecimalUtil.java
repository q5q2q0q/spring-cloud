package com.fh.util;

import java.math.BigDecimal;

//计算价格
public class BigDecimalUtil {
    public static BigDecimal mul(String s1,String s2){
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);
        //b1 * b2                      设置两位小数
        return b1.multiply(b2).setScale(2);
    }
    public static BigDecimal add(String s1,String s2){
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);
        //b1 + b2
        return b1.add(b2);
    }
}
