package com.tp2Assignment3;

/**
 * Created by student on 2016/03/12.
 */
public class otherAccountImpl implements AccountInterface {
    @Override
    public int deposit(int x, int y){
        return x+y+2;
    }

    @Override
    public int withdraw(int x, int y){
        return x-y-2;
    }
}
