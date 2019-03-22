package com.study;

import com.google.common.eventbus.EventBus;

public class GuavaTest {


    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Question question = new Question("小明同学","这是一个问题");
        Teacher tomTeacher = new Teacher("Tom");
        Teacher micTeacher = new Teacher("Mic");
        question.getEventBus().register(tomTeacher);
        question.getEventBus().register(micTeacher);
        gPer.publishQuestion(question);
    }
}
