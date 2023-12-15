package Singleton.LazyInitialization;

// EagerInit makes the object creation static, hence the object creation happens at load time,
// If this singleton classes are heavy and many in number, the load time will increase.

// Hence we would return back to the Lazy Init, it is just that we would make getInstance() method 'synchronized'

public class SingletonClass {
    private static SingletonClass obj;
    private SingletonClass() {};

    public static synchronized SingletonClass getInstance() {
        if (obj == null) {
            obj = new SingletonClass();
        }
        return obj;
    }

    // The main disadvantage of this method is that using synchronized every time while creating the singleton object is expensive
    // and may decrease the performance of your program.
}
