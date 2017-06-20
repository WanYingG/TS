//饿汉式单例模式则是程序只要开始，就将他实例化，到用到他的时候就省去了再实例的时间，所以速度和反应快
package Singleton;

public class EagerSingleton {
    static int j = 0;
    private static EagerSingleton instance = new EagerSingleton();

    //私有化构造函数
    private EagerSingleton(){
        j++;
        System.out.println("饿汉式单例模式开始调用构造函数,次数为"+j);
    }

    //开放一个公有方法，判断是否已经存在实例，有则返回，没有则新建一个再返回
    public static EagerSingleton getInstance(){
        return instance;
    }

}
