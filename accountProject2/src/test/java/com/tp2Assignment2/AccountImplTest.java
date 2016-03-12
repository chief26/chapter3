package com.tp2Assignment2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class AccountImplTest {
    @Test
    public void testDeposit() throws Exception {
        AccountInterface deposit = new AccountImpl();
        int result = deposit.deposit(50,50);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testWithdraw() throws Exception {
        AccountInterface withdraw = new AccountImpl();
        int result = withdraw.withdraw(50,25);
        Assert.assertEquals(25, result);
    }
}
