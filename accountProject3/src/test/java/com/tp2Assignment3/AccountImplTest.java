package com.tp2Assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/12.
 */
public class AccountImplTest {

    private AccountInterface cal;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cal = (AccountInterface)ctx.getBean("dep");
    }

    @Test
    public void testMultiply() throws Exception {
        int result = cal.deposit(5,5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testAdd() throws Exception {
        int result = cal.withdraw(10,3);
        Assert.assertEquals(7, result);
    }
}
