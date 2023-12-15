package Singleton.DoubleCheckLock;

public class SingletonClass {

    private static SingletonClass obj;
    private SingletonClass() {};

    public static SingletonClass getInstance() {
        if (obj == null) {
            // To make thread safe
            synchronized (SingletonClass.class) {
                // check again as multiple threads
                // can reach above step
                if (obj == null) {
                    obj = new SingletonClass();
                }
            }
        }
        return obj;
    }

}
