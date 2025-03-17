package org.lessons.java.shop;

import java.math.BigDecimal;

public class pacman {
 public static void main(String[] args) {

    Prodotto PacMan = new Prodotto("PacMan","videogame", new BigDecimal(30),new BigDecimal(0.22));

System.out.println(PacMan.getNomeConcat());
System.out.println(PacMan.getPrezzoBase() + " Euro");
System.out.println(PacMan.getnome());
System.out.println(PacMan.getIva() + " %");
System.out.println(PacMan.getPrezzoIvato() + " Euro");


 }


}
