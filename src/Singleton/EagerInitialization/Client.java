package Singleton.EagerInitialization;

import static Singleton.EagerInitialization.SingletonClass.*;

public class Client {

    public static void main(String[] args) {
        SingletonClass st = getInstance();
        System.out.println(st);

    }
}
