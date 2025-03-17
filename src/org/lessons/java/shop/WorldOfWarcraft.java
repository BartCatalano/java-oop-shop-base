package org.lessons.java.shop;

import java.math.BigDecimal;

public class WorldOfWarcraft {

    public static void main(String[] args) {
 
        Prodotto WorldOfWarcraft = new Prodotto("World of Warcraft", "videogames", new BigDecimal(55), new BigDecimal(0.22));

        System.out.println(WorldOfWarcraft.getNomeConcat());
        System.out.println(WorldOfWarcraft.getPrezzoBase() + " Euro");
        System.out.println(WorldOfWarcraft.getnome());
        System.out.println(WorldOfWarcraft.getIva() + " %");
        System.out.println(WorldOfWarcraft.getPrezzoIvato() + " Euro");
    }


       

}
