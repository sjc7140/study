package test;

import java.util.Scanner;

public class TestCase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] nums = str.split(" ");

        long[] arr = new long[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = Long.parseLong(nums[i]);
        }

        long max1 = Long.MIN_VALUE,max2 = Long.MIN_VALUE,max3 = Long.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(max1<arr[i]){
                max1 = arr[i];
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(max2<arr[i] && arr[i]<max1){
                max2 = arr[i];
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(max3<arr[i] && arr[i]<max2){
                max3 = arr[i];
            }
        }

        System.out.println(max1*max2*max3);
    }
}
