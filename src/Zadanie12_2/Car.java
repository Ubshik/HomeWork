package Zadanie12_2;

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
// begin working
    public void startCar(){
        if (signaling == true){
            System.out.println("You couldn't begin work with car because car is locked");
            return;
        }
        System.out.println("Your car is started to work");
    }
// finish working
    public void finishCar(){
        System.out.println("Your car is finished to work");
    }

    class Motor implements MethodMotor {
        int speed = 0;
        int maxSpeed;
        Motor(int maxSpeed){
            this.maxSpeed = maxSpeed;
            this.speed = 0;
        };

        public int increaseSpeed(int v){
            speed+=v;
            if (speed > maxSpeed) speed = maxSpeed;
            return speed;
        }

        public int decreaseSpeed(int v){
            speed-=v;
            if (speed < 0) speed = 0;
            return speed;
        }
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

    class BoxTransmission implements MethodTransmission {
        private int transmission;
        BoxTransmission(){
            this.transmission = 0;
        }
        public int changeTransmission(int speed){
            if (speed == 0) return transmission = 0;
            if (speed <= 10) return transmission = 1;
            if (speed <= 20) return transmission = 2;
            if (speed <= 40) return transmission = 3;
            if (speed <= 60) return transmission = 4;
            return transmission = 5;
        }
    }

    BoxTransmission box = new BoxTransmission();
    private void print(){
        System.out.println("Your speed is " + motor.speed);
        System.out.println("Your transmission is " + box.transmission);
    }

    class GasTank implements MethodGasTank {
        float volumeTank;
        int maxGazSize;
        int pass;
        GasTank () {
            this.volumeTank = 10;
            this.pass = 15;
            this.maxGazSize = 40;
        }

        GasTank (float volumeTank, int maxGazSize, int pass) {
            this.volumeTank = 0;
            this.maxGazSize = maxGazSize;
            fill(volumeTank);
            this.pass = pass;
        }

        public float fill(float n){ //n - volume of oil to fill
            volumeTank+=n;
            if (volumeTank > maxGazSize) volumeTank = maxGazSize;
            return volumeTank;
        }

        private float consume(float n){
            volumeTank-=n;
            if (volumeTank < 0) volumeTank = 0;
            return volumeTank;
        }

        public float runDistance(float distance) {
            if (volumeTank*pass > distance) {
                consume(distance/pass);
                return distance;
            }
            float returnDistance = volumeTank*pass;
            volumeTank = 0;
            return returnDistance;
        }
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
            finishCar();
            System.out.println("Your GazTank is empty");
        }
        return runDist;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.lockDoors();
        car.startCar();
        car.unlockDoors();
        car.startCar();
        car.runDistance(24);
        car.increaseSpeed(10);
        car.decreaseSpeed(15);
        car.runDistance(50);
        car.increaseSpeed(45);
        car.runDistance(200);
        car.decreaseSpeed(38);
        car.fillCar(18);
        car.increaseSpeed(68);
        car.runDistance(34);
        car.finishCar();
        car.lockDoors();
    }
}
