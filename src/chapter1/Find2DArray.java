package chapter1;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * 思路：1,2,8,9
 *      2,4,9,12
 *      4,7,10,13
 *      6,8,11,15
 *
 * 像这样一个
 */
public class Find2DArray {
    public static boolean findNumber(int[][] arr,int target){
        if(arr == null){
            return false;
        }

        int n = arr.length;         //总行数
        int col = arr[0].length-1;    //列索引
        int row = 0;                    //行索引
        while(row<n && col>=0){
            if(target<arr[row][col]){
                col--;
            }else if(target > arr[row][col]){
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
