package com.tp2Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/12.
 */
public class ClassArrayList {
    List list = new ArrayList();

    public void addList(Person x){
        list.add(x);
    }

    public void removeFromList(int x){
        list.remove(x);
    }

    public int listSize(){
        return list.size();
    }

}
