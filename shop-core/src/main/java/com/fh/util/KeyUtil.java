package com.fh.util;

public class KeyUtil {

    public static final int MEMBER_EXPIRE = 10*60;

    public static String buildMemberKey(Long memberId, String uuid) {
        return "member:"+memberId+":"+uuid;
    }

    public static String buildCartKey(Long goodSId) {
        return "cart:"+goodSId;
    }

    public static String buildStockLessKey(Long memberId) {
        return "order:stock:less:"+memberId;

    }

    public static String buildOrderKey(Long memberId) {
        return "order:"+memberId;
    }
}
