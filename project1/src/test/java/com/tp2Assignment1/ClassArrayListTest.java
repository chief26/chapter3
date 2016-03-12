package com.tp2Assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class ClassArrayListTest {
    @Test
    public void testArrayList() throws Exception {
        ClassArrayList list1 = new ClassArrayList();
        ClassArrayList list2 = new ClassArrayList();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Shaun", 21);
        list1.addList(p1);
        list2.addList(p2);
        Assert.assertEquals(list1, list1);
    }

    @Test
    public void testArrayListAdd() throws Exception {
        ClassArrayList list1 = new ClassArrayList();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        list1.addList(p1);
        Assert.assertEquals(list1.listSize(),1);
        list1.addList(p2);
        Assert.assertEquals(list1.listSize(),2);

    }

    @Test
    public void testArrayListSize() throws Exception {
        ClassArrayList list1 = new ClassArrayList();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        Person p3 = new Person("Henny", 21);
        list1.addList(p1);
        list1.addList(p2);
        Assert.assertEquals(list1.listSize(),2);
        list1.addList(p3);
        Assert.assertEquals(list1.listSize(),3);
    }

    @Test
    public void testArrayListRemove() throws Exception {
        ClassArrayList list1 = new ClassArrayList();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        Person p3 = new Person("Henny", 21);
        list1.addList(p1);
        list1.addList(p2);
        list1.addList(p3);
        Assert.assertEquals(list1.listSize(), 3);
        list1.removeFromList(0);
        Assert.assertEquals(list1.listSize(),2);
    }
}
