package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
public int codice;
public String nome;
public String descrizione;
public BigDecimal prezzo;
public BigDecimal iva;
public BigDecimal prezzoFinito;
 

 public Prodotto( String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
    Random randomNum = new Random();
    this.codice = randomNum.nextInt(9999);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
   
 }

 public BigDecimal getPrezzoBase(){
    return this.prezzo;
 }
 public BigDecimal getPrezzoIvato(){
    if(prezzo != null && iva != null){
      return prezzo.add(prezzo.multiply(iva).setScale(2,RoundingMode.DOWN));
    }
    return null;
 }

 public String getNomeConcat(){
    if(nome != null){
        return codice + " - " + nome;
    }
    return null;
 }

}
