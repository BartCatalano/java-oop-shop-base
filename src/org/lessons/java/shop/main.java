package org.lessons.java.shop;

public class main {
 public static void main(String[] args) {

    Prodotto mioProdotto = new Prodotto("PacMan","videogame", 15, 22);

System.out.println(mioProdotto.codice);
System.out.println(mioProdotto.prezzo + " Euro");
System.out.println(mioProdotto.nome);
System.out.println(mioProdotto.descrizione);
System.out.println(mioProdotto.iva + " %");
System.out.println(mioProdotto.prezzoFinito + " Euro");

 }


}
