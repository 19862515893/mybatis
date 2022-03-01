package com.syr.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author syr
 * @date 2022/2/18 - 22:49
 */
@SuppressWarnings("all")//抑制警告
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }
}
