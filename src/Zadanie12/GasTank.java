package Zadanie12;

/**
 * Created by Acer5740 on 25.10.2016.
 */
public class GasTank implements MethodGasTank {
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

