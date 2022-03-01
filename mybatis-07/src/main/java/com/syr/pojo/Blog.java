package com.syr.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author syr
 * @date 2022/2/18 - 22:41
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一样
    private int views;
}
