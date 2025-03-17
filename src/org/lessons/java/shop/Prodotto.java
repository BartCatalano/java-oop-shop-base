package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
private BigDecimal prezzo;
private BigDecimal iva;
private int codice;
private String nome;
private String descrizione;

 

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
 public void  setPrezzoBase(BigDecimal prezzo){
      this.prezzo = prezzo;
   }
   public BigDecimal getIva(){
      return this.iva;
   }

   public void setIva(BigDecimal iva){
      this.iva = iva;
   }

   public int getCodice(){
      return this.codice;
   }

   public void setCodice(int codice){
      this.codice = codice;
   }

   public String getnome(){
      return this.nome;
   }

   public void setnome(String nome){
      this.nome = nome;
   }

   public String getDescrizione(){
      return this.descrizione;
   }

   public void setDescrizione(String Descrizione){
      this.descrizione = Descrizione;
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
