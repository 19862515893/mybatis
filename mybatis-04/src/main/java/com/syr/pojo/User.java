package com.syr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author syr
 * @date 2022/2/14 - 21:27
 */
//实体类

@Data  //无参构造 ，get、set、toString、hashcode、equals
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;


}
