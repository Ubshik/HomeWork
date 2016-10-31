package Zadanie16;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public abstract class Man {
    private String name;

    Man (String name){
        this.name = name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public abstract void ableSpeak();

    public void ableEarn(){
        System.out.println("Everyone wants to have wealth");
    }


}
