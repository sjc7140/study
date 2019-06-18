package test;

import Chapter1.LinkedList;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void test(){
        LinkedList  list  = new LinkedList<>();
        for(int i = 0;i<10;i++){
            list.add(i);
        }
        System.out.println(list.getLastNode());
    }
}
