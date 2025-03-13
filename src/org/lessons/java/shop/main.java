package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {
 public static void main(String[] args) {

    Prodotto mioProdotto = new Prodotto("PacMan","videogame", new BigDecimal(30),new BigDecimal(0.22));

System.out.println(mioProdotto.getNomeConcat());
System.out.println(mioProdotto.getPrezzoBase() + " Euro");
System.out.println(mioProdotto.nome);
System.out.println(mioProdotto.descrizione);
System.out.println(mioProdotto.getPrezzoIvato() + "Euro");

 }


}
