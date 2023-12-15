package Singleton.SingleThreadImplementation;

public class SingletonClass {
    private static SingletonClass obj;
    private SingletonClass() {};

    public static SingletonClass getInstance() {
        if (obj == null) {
            obj = new SingletonClass();
        }
        return obj;
    }
}
