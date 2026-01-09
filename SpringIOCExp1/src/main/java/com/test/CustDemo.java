package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustDemo {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");

        Customer ct = ctx.getBean("cst", Customer.class);
        System.out.println(ct);
    }
}
