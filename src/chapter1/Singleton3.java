package chapter1;

/**
 * 单例设计模式第三种，使用静态内部类。
 * 即实现了按需创建，同时保证了多线程的安全问题。
 * 内部类不会随着外部类的加载而加载，它的加载时独立的。
 * jvm保证了静态内部类只会加载一次。
 */
public class Singleton3 {
    private Singleton3(){}

    private static class Innner{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Innner.singleton3;
    }
}
