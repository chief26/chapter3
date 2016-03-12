package com.tp2Assignment1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/12.
 */
public class ClassMap {
    Map list = new HashMap();

    public void addList(String key, Person x){
        list.put(key, x);
    }

    public void removeFromList(String x){
        list.remove(x);
    }


    public int listSize(){
        return list.size();
    }
}
