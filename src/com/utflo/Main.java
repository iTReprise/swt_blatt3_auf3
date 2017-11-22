package com.utflo;

public class Main {

    public static void main(String[] args) {

        // Deklaration der Zahlen, mit denen gerechnet wird
        GanzeZahl testZaehlerZahl = new GanzeZahl(3);
        GanzeZahl testNennerZahl = new GanzeZahl(2);
        GanzeZahl andereZaehlerZahl = new GanzeZahl(7);
        GanzeZahl andereNennerZahl = new GanzeZahl(9);
        Bruchzahl testBruchzahl = new Bruchzahl(testZaehlerZahl, testNennerZahl);
        Bruchzahl andereBruchzahl = new Bruchzahl(andereZaehlerZahl, andereNennerZahl);

        System.out.println("Für alle Operationen werden folgende Bruchzahlen verwendet:");
        System.out.println("Erste Bruchzahl: " + testBruchzahl);
        System.out.println("Zweite Bruchzahl: " + andereBruchzahl);

        System.out.println("------ Operationen ------");
        System.out.println("Ergebnis der Addition: " + testBruchzahl.bruchAddition(andereBruchzahl));
        System.out.println("Ergebnis der Subtraktion: " + testBruchzahl.bruchSubtraktion(andereBruchzahl));
        System.out.println("Ergebnis der Multiplikation: " + testBruchzahl.bruchMultiplikation(andereBruchzahl));
        System.out.println("Ergebnis der Division: " + testBruchzahl.bruchSubtraktion(andereBruchzahl));
    }
}
