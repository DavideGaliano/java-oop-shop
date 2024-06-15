package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Genera un codice random
    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);//Genera un numero casuale positivo
    }


    public int getCodice() {
        return codice;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    public double getPrezzoBase() {
        return prezzo;
    }


    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }


    public String getNomeEsteso() {
        return String.format("%d-%s", codice, nome);
    }
    
    public String getNomeEstesoFormat() {
        return String.format("%08d-%s", codice, nome);
    }

    // Metodo statico per formattare il codice con pad left di 0 per arrivare a 8 caratteri
    public static String formatCodice(int codice) {
        return String.format("%08d", codice);
    }
}