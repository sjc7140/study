package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 大数字相乘
 */
public class TestCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        int[] num1 = new int[arr1.length];
        int[] num2 = new int[arr2.length];
        int[] result = new int[arr1.length+arr2.length];

        for (int i = 0;i<arr1.length;i++){
            num1[i] = Integer.parseInt(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            num2[i] = Integer.parseInt(arr2[i]);
        }

        for(int i = arr1.length-1;i>0;i--){
            for(int j = arr2.length-1;j>0;j--){

            }
        }
    }
}
