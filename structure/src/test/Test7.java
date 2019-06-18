package test;

import java.util.Arrays;

/**
 * 将10个1-100随机数字进行排序。
 */
public class Test7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.print("排序前:"+ Arrays.toString(arr));
        selectSort(arr);
        System.out.println( "选择排序后"+Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            boolean ready = true;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ready = false;
                }
            }
            if(ready){
                return;
            }
        }

    }

    public static void selectSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
