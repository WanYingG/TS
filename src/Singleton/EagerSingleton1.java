//插入静态内部类,实现了多线程安全
package Singleton;

public class EagerSingleton1 {
    static int j = 0;

    private EagerSingleton1() {
        j++;
        System.out.println("插入静态类饿汉式单例模式开始调用构造函数,次数为" + j);
    }

    static class Nested {
        private static EagerSingleton1 instance = new EagerSingleton1();
    }

    public static EagerSingleton1 getInstance() {
        return Nested.instance;
    }

}