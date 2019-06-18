package StringBase;

import org.junit.Test;

public class Demo1 {
    @Test
    public void test1(){
        String str = "What is my book?";
        String str1 = str.replace(' ','%');
        System.out.println(str);
        System.out.println(str1);
    }
}
