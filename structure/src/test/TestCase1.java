package test;

import Chapter1.SeqList;
import org.junit.Test;

public class TestCase1 {
    @Test
    public void test1(){
        SeqList list = new SeqList();
        String str = "haha";
        String str2 = "haha";
        String str3 = "haha";
        String str4 = "haha";
        String str5 = "xixi";
        list.add(str);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);

        System.out.println("表长度："+list.length());
        System.out.println("实际长度"+list.size());
        System.out.println("第2个元素："+list.get(1));
        System.out.println("删除第二个元素："+list.delete(1));
        System.out.println("现在实际长度"+list.size());
        System.out.println("查找xixi"+list.serach("wahaha"));
    }
}
