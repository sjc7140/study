package test;

import java.util.Scanner;

public class TestCase1 {
    public static void main(String[] args) {
        int position = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        int[] arr = new int[2];
        for(int i = 0;i<strs.length;i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        int k = arr[1];
        int n = arr[2];


    }

    public static void equalsValue(int k,int n,int position){
        if(k/position == 0){
            while(k>position){
                position = position*2;
                System.out.println(position+"+");
            }
        }else if(k/position == 1){
            while(k-1>position){
                position = position*2+1;
            }
        }
    }
}
