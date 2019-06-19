package test;

import Chapter1.LinkedList1;
import org.junit.Test;

public class LinkedList1Test {
    @Test
    public void test1(){
        LinkedList1 list = new LinkedList1<Integer>();
        list.serach(1);
        list.serach(2);
        list.serach(3);
        list.serach(4);
        list.serach(5);
        list.serach(1);
        list.serach(99);
    }
}
