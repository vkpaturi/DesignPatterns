package Singleton.DoubleCheckLock;

public class Client {
    public static void main(String[] args) {
        // Getting the single instance of the class -> DoubleCheckLock
        SingletonClass st = SingletonClass.getInstance();

        //Printing the Singleton object address
        //Even when we call this getInstance(), in any file, the same object will be returned.
        System.out.println(st);
    }
}
