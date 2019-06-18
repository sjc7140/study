package chapter1;

/**
 * 单例设计模式第二种，懒汉式，当需要实例时才创建该实例。
 * 为保证多线程安全问题，加锁。
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2;
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
