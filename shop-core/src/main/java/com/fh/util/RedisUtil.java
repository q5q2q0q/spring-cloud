package com.fh.util;

import redis.clients.jedis.Jedis;

public class RedisUtil {


    public static void set(String key,String value){
        Jedis jedis = null ;
        try {
            jedis= RedisPool.getResource();
            jedis.set(key,value);
        } catch (Exception e) {
            //打印异常
            e.printStackTrace();
            //运行异常立即抛出 项目停止运行
            throw new RuntimeException(e);
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static String get(String key){
        Jedis jedis = null;
        try {
            jedis = RedisPool.getResource();
            String res = jedis.get(key);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
    public static void delete(String key){
        Jedis jedis = null;
        try {
            jedis= RedisPool.getResource();
            jedis.del(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static void setEx(String key, String value, int seconds) {
        Jedis resource = null;
        try {
            resource = RedisPool.getResource();
            resource.setex(key, seconds, value);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (null != resource) {
                resource.close();
            }
        }
    }

    public static void expire(String key, int seconds) {
        Jedis resource = null;
        try {
            resource = RedisPool.getResource();
            resource.expire(key, seconds);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (resource != null) {
                resource.close();
            }
        }
    }

    public static boolean exist(String key) {
        Jedis resource = null;
        try {
            resource = RedisPool.getResource();
            return resource.exists(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (null != resource) {
                resource.close();
            }
        }
    }
}
