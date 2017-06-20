//懒汉式单例模式
//懒汉式和饿汉式的区别在于懒汉式是延时加载,只有用到这个用例的时候，再会将他实例化
//该方法的缺点是不能保证线程安全，多线程情况下不能正常工作，会创建多个实例
package Singleton;


public class LazySingleton {
     static int j = 0;

    private static LazySingleton instance = null;

    private  LazySingleton(){
        j++;
        System.out.println("懒汉式单例模式开始调用构造函数,次数为"+j);
    }


    public static LazySingleton getInstance() {

        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
