package test;

import Chapter1.LinkedList1;
import org.junit.Test;

public class LinkedList1Test {
    @Test
    public void test1(){
        LinkedList1 list = new LinkedList1<Integer>();
        list.serach(1);
        list.printCache();
        list.serach(2);
        list.printCache();
        list.serach(3);
        list.printCache();
        list.serach(4);
        list.printCache();
        list.serach(5);
        list.printCache();
        list.serach(1);
        list.printCache();
        list.serach(99);
        list.printCache();
    }
}
