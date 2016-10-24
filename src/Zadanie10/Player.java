package Zadanie10;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class Player extends Device implements Methods {
    Player (String producer, int price){
        super(producer, price);
    }
    public Category getType(){
        return  Category.AUDIO;
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
        Device player = new Player("Sony", 80);
        String name = Player.class.getSimpleName();
        System.out.println("Your device is " + name);
        player.switchOn();
        System.out.println("Type of this device is " + player.getType());
        player.getProducer();
        player.getPrice();
        player.switchOff();
    }

}
