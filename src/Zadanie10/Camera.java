package Zadanie10;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class Camera extends Device implements Methods {
    Camera(String producer, int price) {
        super(producer, price);
    }

    @Override
    public Category getType() {
        return Category.VIDEO;
    }

    @Override
    public void getProducer() {
        System.out.println("Producer is " + this.producer);
    }

    @Override
    public void getPrice() {
        System.out.println("Price is $" + this.price);
    }

    public static void main(String[] args) {
        Device camera = new Camera("Sumsung", 120);
        String name = Camera.class.getSimpleName();
        System.out.println("Your device is " + name);
        camera.switchOn();
        System.out.println("Type of this device is " + camera.getType());
        camera.getProducer();
        camera.getPrice();
        camera.switchOff();
    }
}