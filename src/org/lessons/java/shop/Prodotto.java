package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
public int codice;
public String nome;
public String descrizione;
public int prezzo;
public int iva;
public int prezzoFinito;
 

 public Prodotto( String nome, String descrizione, int prezzo, int iva){
    Random randomNum = new Random();
    this.codice = randomNum.nextInt(9999);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
   
 }

 public int calcPrezzoBase(){
    return this.prezzo;
 }
public int calcPrezzoIvato(){
    return this.prezzoFinito = (prezzo / 100) * iva;
}

}
