package Zadanie10;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public abstract class Device extends Instrument implements Methods {
    String producer;
    int price;
    Device(String producer, int price){
        this.producer = producer;
        this.price = price;
    }
    abstract Category getType();
}
