package Zadanie12;

/**
 * Created by Acer5740 on 25.10.2016.
 */
public class BoxTransmission implements MethodTransmission {
    int transmission;
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
