package Zadanie9;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class SphereService {
    public static void sortBySize(Sphere[] spheres) {
        for (int i = 0; i < spheres.length; i++) {
            for (int j = 0; j < spheres.length - 1; j++) {
                if (spheres[j + 1].size < spheres[j].size) {
                    Sphere a = spheres[j];
                    spheres[j] = spheres[j + 1];
                    spheres[j + 1] = a;
                }
            }
        }
    }
    public static void sortByColor(Sphere[] spheres) {
        for (int i = 0; i < spheres.length; i++) {
            for (int j = 0; j < spheres.length-1; j++) {
                if (spheres[j + 1].color.compareTo(spheres[j].color)<0) {
                    Sphere a = spheres[j];
                    spheres[j] = spheres[j + 1];
                    spheres[j + 1] = a;
                }
            }
        }
    }
    public static void print(Sphere[] spheres){
        for (int i=0;i<spheres.length;i++){
            System.out.println("["+i+"]"+" "+spheres[i].color);
            System.out.println("["+i+"]"+" "+spheres[i].size);
        }
    }

    public static void main(String[] args) {
        Sphere[]spheres = new Sphere[5];
        for(int i =0; i < spheres.length; i++)
            spheres[i] = new Sphere();


        spheres[0].color = "green";
        spheres[1].color = "white";
        spheres[2].color = "rad";
        spheres[3].color = "yellow";
        spheres[4].color = "black";
        spheres[0].size = 14;
        spheres[1].size = 8;
        spheres[2].size = 3;
        spheres[3].size = 5;
        spheres[4].size = 9;
        sortByColor(spheres);
        print(spheres);

        sortBySize(spheres);
        print(spheres);
    }
}