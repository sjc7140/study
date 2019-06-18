package chapter1;

/**
 * 在一个长度为n+1的数组里面的所有的数字在1~n的范围内。所以肯定至少有一个数字是重复的。
 * 请找出一个重复的数字，不能修改输入的数组。
 */

/**
 * 思路，创建一个新的数组，将原来的数组往新数组里复制，将原来数组对应数字存到对应下标，
 * 比如1，存到arr[1],2存入arr[2]。
 * 因为数字是1~n，没有0。而数组初始化后默认下标里面存放的是0，所以存入数据是判断当前下标里数字是不是0
 * 如果是0表示这是唯一一个存进去的数字。如果当前下标不是0了，则说明之前有数字已经存放进去，该数字重复了。
 */
public class FindDuplicate2 {
    public static int findDuplicate(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<1 || arr[i]>arr.length-1){
                return -1;
            }
        }
        int[] arr1 = new int[arr.length+1];
        for(int i = 0;i<arr.length;i++){
            if(arr1[arr[i]] == 0){
                arr1[arr[i]] = arr[i];
            }else{
                return arr[i];
            }
        }
        return -1;
    }
}
