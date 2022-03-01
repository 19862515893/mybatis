package com.syr.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author syr
 * @date 2022/2/14 - 21:27
 */
//实体类
    //注解 里面写什么，在usermapper中的resulttype中写什么可以进行匹配
    @Alias("user")
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    //ctrl+shift+s
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
