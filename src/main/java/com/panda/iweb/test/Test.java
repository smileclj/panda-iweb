package com.panda.iweb.test;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Test {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        for (int i = 0; i < 100; i++) {
            System.out.println("啦啦啦");
        }
        System.out.println("over");
    }
}
