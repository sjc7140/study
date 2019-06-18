package test;

import Chapter1.Stack;
import org.junit.Test;

/**
 * 测试栈
 */
public class TestCase2 {
    @Test
    public void test1(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack.length());
        String str1 = stack.pop();
        System.out.println(str1);
        String str2 = stack.pop();
        System.out.println(str2);
        String str3 = stack.pop();
        System.out.println(str3);
        String str4 = stack.pop();
        System.out.println(str4);
        String str5 = stack.pop();
        System.out.println(str5);
        String str6 = stack.pop();
        System.out.println(str6);

    }
}
