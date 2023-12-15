package Singleton.EagerInitialization;

// This is the first approach to solve the multithreading problem,
// We just eagerly initialize the object and just return it, So when multiple threads call getInstance() in the Client class,
// the same object is returned

public class SingletonClass {
    private static SingletonClass obj = new SingletonClass();
    private SingletonClass() {};

    public static SingletonClass getInstance() {
        return obj;
    }

    // But the issue with the EagerInitialization is that the object creation is made static and it increases app load up time.
}
