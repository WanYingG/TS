/**
 * 双重检查加锁的方式可以既实现线程安全，又能够使性能不受到很大的影响,
 * 双重检查加锁机制指的是：并不是每次进getInstance方法都需要同步，而是先不同步，进入方法过后，
 * 先检查实例是否存在，如果不存在才进入下面的同步块，这是第一重检查。进入同步块后，再次检查实
 * 例是否存在，如果不存在，就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同
 * 步一次了，从而减少了多次在同步情况下进行判断所浪费的时间。
 */

package Singleton;

public class DSSingleton {
    static int j = 0;
        private volatile static DSSingleton instance;
        private DSSingleton (){
            j++;
            System.out.println("双重检查加锁单例模式开始调用构造函数,次数为"+j);
        }
        public static DSSingleton getInstance() {
            if (instance == null) {
                synchronized (DSSingleton.class) {
                    if (instance == null) {
                        instance = new DSSingleton();
                    }
                }
            }
            return instance;
        }

}
