package test;

import java.util.Scanner;

/**
 * 输入一个数字看他的二进制里面有多少个数字1
 */
public class TestCase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);
        int sum = 0;
        while(num>0){
            sum += num&1;
            num = num>>1;
        }
        System.out.println("有"+sum+"个数字1");
    }
}
