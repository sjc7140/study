package chapter1;
/**
 * 在一个长度为n的数组里面的所有的数字在0~n-1的范围内。数组中某些数字是重读的，
 * 大是不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个
 * 重复的数字。
 */

import java.util.Arrays;

/**
 * 最常规办法，先把数组进行排序，相同的数字必然相邻，遍历数组，找出相邻数字相同的情况即可。
 */
public class FindDuplicate3 {
    public static int findDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
