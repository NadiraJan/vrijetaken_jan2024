package be.nadira;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShoeApp {
    public static void main(String[] args) {

        ShoePair nike = new ShoePair("Nike", false, "white", 41, 69.99);
        ShoePair timberland = new ShoePair("Timberland", true, "brown", 41, 2199.99);
        ShoePair balenciaga = new ShoePair("Balenciaga", true, "black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike", true, "white", 42, 29.99);
        ShoePair timberland2 = new ShoePair("Timberland", true, "black", 39, 170.00);
        ShoePair balenciaga2 = new ShoePair("Balenciaga", false, "black", 45, 50.00);
        ShoePair nike3 = new ShoePair("Nike", true, "white", 41, 79.99);
        ShoePair timberland3 = new ShoePair("Timberland", true, "yellow", 41, 80.00);
        ShoePair balencaga3 = new ShoePair("Balenciaga", false, "black", 37, 349.99);


        ShoePair[] shoePairs = {nike, timberland, balenciaga, nike2, timberland2, balenciaga2,
                nike3, timberland3, balencaga3};

        System.out.println("______ ALL SHOES _______");
        for (ShoePair s : shoePairs) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("--------SORTED SHOES:");

        for (ShoePair pair : shoePairs) {
            if (pair.getSize() == 41 && pair.isComplete()) {
                System.out.println(pair);
            }
        }

        System.out.println();
        System.out.println("-------UNCOMPLETED SHOES & LOST MONEY: ");

        double lostMoney = 0;
        for (ShoePair uncompleted : shoePairs) {
            if (!uncompleted.isComplete()) {
                System.out.println(uncompleted);

                lostMoney += uncompleted.getPrice();

            }
        }
        System.out.println("LostMoney: EUR = " + lostMoney);
    }

}


