package com;

import org.springframework.stereotype.Component;

@Component("braveKnight")
public class BraveKnight {

    @EnableLogRecord
    public void saying(String name){
        System.out.println("我是骑士..（切点方法）");
    }
}