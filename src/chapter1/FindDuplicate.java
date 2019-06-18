package chapter1;

/**
 * 在一个长度为n的数组里面的所有的数字在0~n-1的范围内。数组中某些数字是重读的，
 * 大是不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个
 * 重复的数字。
 */

/**
 * 思路:因为是0-n-1，所以假设没有重复，那么数组的每一个下标都能对应一个相同的数字。
 * 从下标0开始，如果是0，跳到下标1，如果是1，继续查找对比下标2。
 * 假设下标2不是数字2，是4，那么对比下标2和下标4，不相等就交换下标2和下标4，保证下标4正确。相等就找到
 * 继续查看下标2，如果是数字2，跳到下标3，如如果不是数字2，假设是数字7，
 * 对比下标2和下标7，相等就找到，不等就继续。
 *
 * 这样相当于完成了数组的排序，如果到最后排序完成，没有重复，返回-1，查找失败。
 */
public class FindDuplicate {
    public static int duplicate(int[] arr){
        for(int i = 0;i<arr.length;i++){            //如果数组内有数字越界，返回-1，查找失败。
            if(arr[i]<1 || arr[i]>arr.length-1){
                return -1;
            }
        }
        int n = 0;      //指针
        while(n<arr.length){
            if (arr[n] == n){//对应下标上的数字和下标相等，就跳到下一个
                if(n == arr.length-1) {
                    return -1;
                }else {
                    n++;
                }
            }
            while(arr[n] != n){
                if (arr[n] == arr[arr[n]]){
                    return arr[n];
                }
                int temp = arr[arr[n]];
                arr[arr[n]] = arr[n];
                arr[n] = temp;
            }
        }
        return -1;
    }
}
