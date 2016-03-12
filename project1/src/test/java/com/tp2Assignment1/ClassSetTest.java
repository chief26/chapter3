package com.tp2Assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class ClassSetTest {
    @Test
    public void testSet() throws Exception {
        ClassSet list1 = new ClassSet();
        ClassSet list2 = new ClassSet();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Shaun", 21);
        list1.addList(p1);
        list2.addList(p2);
        Assert.assertEquals(list1, list1);
    }

    @Test
    public void testSetAdd() throws Exception {
        ClassSet list1 = new ClassSet();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        list1.addList(p1);
        Assert.assertEquals(list1.listSize(),1);
        list1.addList(p2);
        Assert.assertEquals(list1.listSize(),2);

    }

    @Test
    public void testSetSize() throws Exception {
        ClassSet list1 = new ClassSet();
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
    public void testSetRemove() throws Exception {
        ClassSet list1 = new ClassSet();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        Person p3 = new Person("Henny", 21);
        list1.addList(p1);
        list1.addList(p2);
        list1.addList(p3);
        Assert.assertEquals(list1.listSize(), 3);
        list1.removeFromList(p2);
        Assert.assertEquals(list1.listSize(),2);
    }
}
