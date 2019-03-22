package com.study;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by Tom on 2019/3/17.
 */
public class Teacher  {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void func(Question question) {
        System.out.println("**************************************");
        System.out.println("您有一个消息");
        System.out.println(name+",您好！");
        System.out.println("接收到一个问题，问题内容如下：");
        System.out.println(question.getContent());
        System.out.println("提问人："+question.getUserName());
    }
}
