package Zadanie12_2;

/**
 * Created by Acer5740 on 25.10.2016.
 */
public interface MethodsCar {
    public boolean lockDoors();//заблокировать двери
    public boolean unlockDoors();//разблокировать двери
    public void startCar();//завести автомобиль
    public void finishCar();//заглушить автомобиль
    public void increaseSpeed(int v);//увеличить скорость
    public void decreaseSpeed(int v);//уменьшить скорость
    public void fillCar(int n);//заправить автомобиль
    public float runDistance(float distance);//дистанция прохода автомобиля
}
