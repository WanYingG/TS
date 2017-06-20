package Singleton;

public class Mian {
    public static void main(String args[]) {
        for(int i = 0; i < 20; i++) {
            new CreatedObjectThread().start();
        }
    }

}


class CreatedObjectThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            LazySingleton.getInstance();
            LazySingleton1.getInstance();
            EagerSingleton.getInstance();
            EagerSingleton1.getInstance();
            DSSingleton.getInstance();
        }
    }
}
