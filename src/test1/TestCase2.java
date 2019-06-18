package test1;

import chapter1.Find2DArray;
import chapter1.FindDuplicate;
import chapter1.FindDuplicate2;
import chapter1.FindDuplicate3;
import org.junit.Test;

import java.util.Random;

public class TestCase2 {
    @Test
    public void test1() {
        int[] arr = new int[1000];
        for(int i = 0;i<1000;i++){
            arr[i] = (int)(Math.random()*1000);
        }
        int n = FindDuplicate.duplicate(arr);
        System.out.println(n);
    }
    @Test
    public void test2(){
        int[] arr = {9,8,7,6,7,7,5,4,3,2,1,6};
        int n = FindDuplicate2.findDuplicate(arr);
        System.out.println(n);
    }
    @Test
    public void test3(){
        int[] arr = {9,8,7,6,7,7,5,4,3,2,1,6};
        int n = FindDuplicate3.findDuplicate(arr);
        System.out.println(n);

    }
    @Test
    public void test4(){
//        int[][]arr = new int[9][9];
//        for(int i = 0;i<9;i++){
//            for(int j = 0;j<9;j++){
//                arr[i][j] = (int)(Math.random()*100);
//            }
//        }
        int[][] arr = { {1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean falg = Find2DArray.findNumber(arr,6);
        System.out.println(falg);
    }
}
