package test;

import Chapter1.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList list;

    @Before
    public void add() {
        list = new LinkedList<Integer>();
        for(int i = 0;i<10;i++){
            list.add(i);
        }
    }

    @Test
    public void get() {
//        System.out.println(list.get(-1));
        System.out.println(list.get(0));
//        System.out.println(list.get(5));
//        System.out.println(list.get(9));
//        System.out.println(list.get(10));
    }

    @Test
    public void delete() {
        System.out.println(list);
        list.delete();
        System.out.println(list);
    }

    @Test
    public void length() {
        System.out.println(list.length());
    }

    @Test
    public void isEmpty() {
//        for(int i = 0;i<10;i++) {
//            System.out.println(list.delete());
//        }
        System.out.println(list.isEmpty());
    }

    @Test
    public void isContain() {
        System.out.println(list.isContain(6));
    }

    @Test
    public void insert() {
        System.out.println(list);
        list.insert(9,10);
        System.out.println(list);
    }

    @Test
    public void remove() {
        System.out.println(list);
        list.remove(9);
        System.out.println(list);
    }

    @Test
    public void toString1() {
        System.out.println(list);
    }
}
