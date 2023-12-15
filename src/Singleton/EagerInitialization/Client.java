package Singleton.EagerInitialization;

import static Singleton.EagerInitialization.SingletonClass.*;

public class Client {

    public static void main(String[] args) {
        // Getting the single instance of the class -> Eager Init
        SingletonClass st = getInstance();

        //Printing the Singleton object address
        //Even when we call this getInstance(), in any file, the same object will be returned.
        System.out.println(st);

    }
}
