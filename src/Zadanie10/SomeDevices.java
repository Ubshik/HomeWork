package Zadanie10;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class SomeDevices extends Device implements Methods {
    public String name;
    SomeDevices (String producer, int price, String name){
        super(producer, price);
        this.name = name;
    }
    public Category getType(){
        boolean answer = name.contains("audio");
        if (answer == true) {return  Category.AUDIO;}
        return Category.VIDEO;
    }

    @Override
    public void switchOn() {
        System.out.println("Your device is " + name + " was switch on");
    }

    @Override
    public void switchOff() {
        System.out.println("Your device is " + name + " was switch off");
    }

    @Override
    public void getProducer() {
        System.out.println("Producer of " + name + " is " + this.producer);
    }

    @Override
    public void getPrice() {
        System.out.println("Price of " + name + " is $" + this.price);
    }

    public static void main(String[] args) {
        SomeDevices audioPlayer = new SomeDevices("Sony",80,"audioPlayer");
        SomeDevices videoCamera = new SomeDevices("Panasonic",370,"videoCamera");
        audioPlayer.switchOn();
        System.out.println("Type of " + audioPlayer.name + " is " + audioPlayer.getType());
        audioPlayer.getProducer();
        audioPlayer.getPrice();
        audioPlayer.switchOff();
        System.out.println();
        videoCamera.switchOn();
        System.out.println("Type of " + videoCamera.name + " is " + videoCamera.getType());
        videoCamera.getProducer();
        videoCamera.getPrice();
        videoCamera.switchOff();
    }
}
