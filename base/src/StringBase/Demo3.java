package StringBase;

import org.junit.Test;

import java.util.Scanner;

/**
 * 从键盘输入一个数字，判断是整数还是小数。
 */
public class Demo3 {

    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try{
            double n = Double.parseDouble(str);
            int i = (int)n;
            double j = (double) i;
            if(j == n){
                System.out.println("您输入的是：整数");
            }else {
                System.out.println("您输入的是：小数");
            }
        }catch (NumberFormatException e){
            System.out.println("您输入的是：非数字");
        }
    }
}
