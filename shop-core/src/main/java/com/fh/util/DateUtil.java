package com.fh.util;


import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final String Y_M_D="yyyy-MM-dd";
    public static final String FULL_TIME = "yyyy-MM-dd HH:mm:ss";
    //传一个Date类型的日期 转换为 String 类型的字符串日期
    public static String date2str(Date date, String pattern){
        if (date ==null){
            return "";
        }
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern);
        String result = simpleDateFormat.format(date);
        return result;
    }

    //传一个String类型的字符串日期  转换为 Date类型的日期
    public static Date str2date(String date,String pattern){
        if (StringUtils.isEmpty(date)){
            throw new RuntimeException("日期格式的字符串为空！！！");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date1 = null;
        try {
            date1=simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }
}
