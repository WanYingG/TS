/**
 * 为了实现多线程安全，可对MySingleton.java进行修改。
 * 当系统有两个线程线程1和线程2，两线程到达#1前，若线程1（或线程2）抢到锁，执行#2，
 * #3后释放锁，若线程2（或线程1）抢到锁，会执行#2，由于instance为静态类变量，
 * 此时的instance已由线程1实例化了，因此线程2没有执行#2，因此系统只有一个实例化对象。
 * 所以该代码是线程安全的。缺点：尽管该代码是线程安全的，能够在多线程中很好的工作，
 * 而且看起来它也具备很好的lazy loading，但是效率低，99%情况下不需要加锁、解锁的同步操作。
 *
 */

package Singleton;

public class LazySingleton1 {

    static int j = 0;

    private static LazySingleton1 instance = null;

    private   LazySingleton1 (){
        j++;
        System.out.println("改进的懒汉式单例模式开始调用构造函数,次数为"+j);
    }


    public static synchronized LazySingleton1 getInstance() {
        if(instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }
}

