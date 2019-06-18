package test;

/**
 * 求n！
 */
public class Test6 {
    public static void main(String[] args) {
        int n = Utils.printInNumber();
        System.out.println(calculate(n));
    }

    public static int calculate(int n){
        if(n<1){
            throw new RuntimeException("数字不能小于1");
        }
        if(n == 1 || n == 2){
             return n;
        }else{
            return n*calculate(n-1);
        }
    }
}
