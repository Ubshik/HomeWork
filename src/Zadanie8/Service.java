package Zadanie8;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public final class Service {
    Service(int size) {
        service = new Service[size];
    }
    final Service[] service;


    public static void main(String[] args) {
        Service Not = new Service(15);
        Not.service[0] = new Service(5);
//        Not.service = new Service[7];
    }
}