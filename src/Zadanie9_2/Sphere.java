package Zadanie9_2;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class Sphere {

    private String color;
    private int size;

    Sphere (){
        color = "";
        size = 0;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setSize (int size){
        this.size = size;
    }

    public String getColor (){
        return color;
    }

    public int getSize (){
        return size;
    }
}
