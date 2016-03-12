package com.tp2Assignment1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/12.
 */
public class ClassSet {
    Set list = new HashSet();

    public void addList(Person x){
        list.add(x);
    }

    public void removeFromList(Person p){
        list.remove(p);
    }

    public int listSize(){
        return list.size();
    }
}
