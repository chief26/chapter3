package com.tp2Assignment3;

/**
 * Created by student on 2016/03/12.
 */
public class AccountImpl implements AccountInterface {
    @Override
    public int deposit(int x, int y){
        return x+y;
    }

    @Override
    public int withdraw(int x, int y){
        return x-y;
    }
}
