package com.tp2Assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/12.
 */
public class otherAccountImplTest {
    private AccountInterface acc;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        acc = (AccountInterface)ctx.getBean("newDep");
    }

    @Test
    public void testMultiply() throws Exception {
        int result = acc.deposit(5,5);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testAdd() throws Exception {
        int result = acc.withdraw(10,3);
        Assert.assertEquals(5, result);
    }
}
