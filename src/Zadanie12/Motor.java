package Zadanie12;

/**
 * Created by Acer5740 on 25.10.2016.
 */
public class Motor implements MethodMotor{
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
