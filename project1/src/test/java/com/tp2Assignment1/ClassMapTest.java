package com.tp2Assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class ClassMapTest {
    @Test
    public void testSet() throws Exception {
        ClassMap list1 = new ClassMap();
        ClassMap list2 = new ClassMap();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Shaiun", 21);
        Person p3 = new Person("Shasiun", 21);
        list1.addList("1",p1);
        list2.addList("2", p2);
        Assert.assertEquals(list1, list1);
    }

    @Test
    public void testSetAdd() throws Exception {
        ClassMap list1 = new ClassMap();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        list1.addList("1",p1);
        Assert.assertEquals(list1.listSize(), 1);
        list1.addList("2", p2);
        Assert.assertEquals(list1.listSize(), 2);

    }

    @Test
    public void testSetSize() throws Exception {
        ClassMap list1 = new ClassMap();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        Person p3 = new Person("Henny", 21);
        list1.addList("1",p1);
        list1.addList("2",p2);
        Assert.assertEquals(list1.listSize(), 2);
        list1.addList("3", p3);
        Assert.assertEquals(list1.listSize(), 3);
    }

    @Test
    public void testSetRemove() throws Exception {
        ClassMap list1 = new ClassMap();
        Person p1 = new Person("Shaun", 21);
        Person p2 = new Person("Gene", 21);
        Person p3 = new Person("Henny", 21);
        list1.addList("1",p1);
        list1.addList("2",p2);
        list1.addList("3",p3);
        Assert.assertEquals(list1.listSize(), 3);
        list1.removeFromList("2");
        Assert.assertEquals(list1.listSize(),2);
    }
}
