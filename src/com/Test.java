package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Caijh
 * email:codecjh@163.com
 * 2017年7月11日 下午6:27:06
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        BraveKnight br = (BraveKnight) ac.getBean("braveKnight");
        br.saying("hello");
    }
}