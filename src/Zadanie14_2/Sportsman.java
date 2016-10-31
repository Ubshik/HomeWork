package Zadanie14_2;

import java.util.TreeSet;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class Sportsman {
    String name;
    int gold;
    int silver;
    int bronze;
    int age;

    Sportsman (String name, int gold, int silver, int bronze, int age) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.age = age;
    }

    public int getMedals (){
        return gold + silver + bronze;
    }
       

    public static void main(String[] args) {

        Sportsman[] team = new Sportsman[10];
        team [0] = new Sportsman("Mike Colins", 12, 5, 4, 28);
        team [1] = new Sportsman("Nike Moll", 7, 1, 5, 21);
        team [2] = new Sportsman("Riki Browns", 10, 4, 1,  34);
        team [3] = new Sportsman("Ron Matis", 2, 14, 6, 28);
        team [4] = new Sportsman("Don Dulitl", 4, 6, 8, 30);
        team [5] = new Sportsman("Dave Corn", 5, 8, 2, 18);
        team [6] = new Sportsman("Fill Lock", 5, 0, 2, 24);
        team [7] = new Sportsman("Brad White", 3, 7, 2, 26);
        team [8] = new Sportsman("Kolin Black", 0, 0, 4, 27);
        team [9] = new Sportsman("Pol Hot", 4, 2, 5, 29);

        TreeSet <Sportsman> sportsman = new TreeSet<Sportsman>((new MedalComparators()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman.add(element);
        }

        for (Sportsman element : sportsman){
            System.out.println("Sort Sportsmen by medal " + element.name +" "+ element.getMedals());
        }
        System.out.println();



        TreeSet <Sportsman> sportsman2 = new TreeSet<Sportsman>((new GoldComparators()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman2.add(element);
        }

        for (Sportsman element : sportsman2){
            System.out.println("Sort Sportsmen by gold " + element.name +" "+ element.gold);
        }
        System.out.println();



        TreeSet<Sportsman> sportsman3 = new TreeSet<Sportsman>((new AgeComparators()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman3.add(element);
        }

        for (Sportsman element : sportsman3){
            System.out.println("Sort Sportsmen by age1 " + element.name +" "+ element.age);
        }



    }
}
