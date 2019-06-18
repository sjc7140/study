package test;

import java.util.Arrays;

/**
 *
 */
public class Test8 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*Integer.MAX_VALUE);
        int result = num;
        int[] arr = new int[32];
        String str =  Integer.toBinaryString(num);
        if(str.length()<32){
            str = "0"+str;
        }
        for (int i = 0;i<str.length();i++){
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }
}
