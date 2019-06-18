package chapter1;

/**
 * 单例设计模式：
 * 1.构造器私有化
 * 2.内部创建本类实例
 * 3.对外提供访问方法
 */
public class Singleton1 {
    private Singleton1(){}

    private static Singleton1 singletion1 = new Singleton1();

    public static Singleton1 getInstance(){
        return singletion1;
    }

}
