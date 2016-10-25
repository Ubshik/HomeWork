package Zadanie12;

/**
 * Created by Acer5740 on 25.10.2016.
 */
public class Car implements MethodsCar{

    Car() {};

    boolean signaling;

    public boolean lockDoors(){
        System.out.println("Your car is locked");
        return signaling = true;//сигнализация установлена
    }

    public boolean unlockDoors(){
        System.out.println("Your car is unlocked");
        return signaling = false; // сигнализация снята
    }
// начать работу
    public void startCar(){
        if (signaling == true){
            System.out.println("You couldn't begin work with car because car is locked");
            return;
        }
        System.out.println("Your car is started to work");
    }
// закончить работу
    public void drownCar(){
        System.out.println("Your car is finished to work");
    }

    Motor motor = new Motor(180);
    public void increaseSpeed(int v){
        if (signaling == true) {
            System.out.println("Car is blocked");
            return;
        }
        if (gaz.volumeTank == 0){
            motor.speed = 0;
            System.out.println("You couldn't run because gasTank is empty");
            return;
        }
        motor.increaseSpeed(v);
        box.changeTransmission(motor.speed);
        print();
    }

    public void decreaseSpeed(int v){
        if (signaling == true) {
            System.out.println("Car is blocked");
            return;
        }
        if (gaz.volumeTank == 0){
            motor.speed = 0;
            System.out.println("You couldn't run because gasTank is empty");
            return;
        }
        motor.decreaseSpeed(v);
        box.changeTransmission(motor.speed);
        print();
    }

    BoxTransmission box = new BoxTransmission();
    private void print(){
        System.out.println("Your speed is " + motor.speed);
        System.out.println("Your transmission is " + box.transmission);
    }

    GasTank gaz = new GasTank();
    public void fillCar(int n){
        gaz.fill(n);
        if (gaz.volumeTank >= gaz.maxGazSize) {
            System.out.println("Your GazTank is full");
        }
    }

    public float runDistance(float distance){
        if (signaling == true) {
            System.out.println("Car is blocked");
            return 0;
        }
        if (motor.speed == 0) {
            System.out.println("Speed = 0, Distance = 0");
            return 0;
        }
        float runDist = gaz.runDistance(distance);
        System.out.println("Distance of car is " + runDist);
        if (gaz.volumeTank <= 0) {
            drownCar();
            System.out.println("Your GazTank is empty");
        }
        return runDist;
    }

    public static void main(String[] args) {
        Car car = new Car ();
        car.lockDoors();
        car.startCar();
        car.unlockDoors();
        car.startCar();
        car.runDistance(25);
        car.increaseSpeed(10);
        car.decreaseSpeed(15);
        car.runDistance(50);
        car.increaseSpeed(45);
        car.runDistance(200);
        car.decreaseSpeed(38);
        car.fillCar(18);
        car.increaseSpeed(68);
        car.runDistance(34);
        car.drownCar();
        car.lockDoors();
    }
}
