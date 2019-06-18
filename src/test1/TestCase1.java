package test1;

import chapter1.Singleton1;
import chapter1.Singleton2;
import chapter1.Singleton3;
import chapter1.Singleton4;
import org.junit.Test;

import java.math.BigInteger;

public class TestCase1 {
    public static BigInteger calculate(String x,String y){
        try{
            BigInteger m = new BigInteger(x);
            BigInteger n = new BigInteger(y);
            return m.multiply(n);
        }catch(Exception e){
            throw new RuntimeException("输入的不是数字");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate("12345467899874","65456465456"));
    }
}
