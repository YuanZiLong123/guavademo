package com.study;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class Question {

    private String userName;
    private String content;

    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    private  EventBus eventBus = new EventBus();


    public  EventBus getEventBus() {
        return eventBus;
    }

    public  void register(Object obj) {
        eventBus.register(obj);
    }

    public  void unregister(Object obj) {
        eventBus.unregister(obj);
    }

    public  void post(Object obj) {
        eventBus.post(obj);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
