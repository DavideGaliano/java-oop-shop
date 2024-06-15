package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Creazione di un nuovo prodotto
        Prodotto prodotto = new Prodotto("Laptop", "Un laptop performante", 1000.0, 22.0);

        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Nome esteso formattato: " + prodotto.getNomeEstesoFormat());

        // Test del metodo statico formatCodice
        System.out.println("Codice formattato: " + Prodotto.formatCodice(prodotto.getCodice()));
    }
}