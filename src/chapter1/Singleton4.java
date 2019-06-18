package chapter1;

/**
 * 单例设计模式第四种。
 * 使用静态代码块。
 * 静态代码块随着类的加载只会加载一次。
 * 使用静态代码块可以干更多的事情，比如初始化一些数据。
 */
public class Singleton4 {
    private Singleton4(){}

    private static Singleton4 singleton4;

    static{
        singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return singleton4;
    }
}
