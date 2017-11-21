package com.utflo;

public class Main {

    public static void main(String[] args) {
        // Werte der Zahlen, mit denen gerechnet wird
        GanzeZahl testZaehlerZahl = new GanzeZahl(3);
        GanzeZahl testNennerZahl = new GanzeZahl(2);
        GanzeZahl testZaehlerZahl2 = new GanzeZahl(7);
        GanzeZahl testNennerZahl2 = new GanzeZahl(9);

        // Variablen für  Addition
        Bruchzahl testBruchzahl_ADD = new Bruchzahl(testZaehlerZahl, testNennerZahl);
        Bruchzahl andereBruchzahl_ADD = new Bruchzahl(testZaehlerZahl2, testNennerZahl2);

        // Variablen für Subtraktion
        Bruchzahl testBruchzahl_SUB = new Bruchzahl(testZaehlerZahl, testNennerZahl);
        Bruchzahl andereBruchzahl_SUB = new Bruchzahl(testZaehlerZahl2, testNennerZahl2);

        // Variablen für Multiplikation
        Bruchzahl testBruchzahl_MULT = new Bruchzahl(testZaehlerZahl, testNennerZahl);
        Bruchzahl andereBruchzahl_MULT = new Bruchzahl(testZaehlerZahl2, testNennerZahl2);

        // Variablen für Division
        Bruchzahl testBruchzahl_DIV = new Bruchzahl(testZaehlerZahl, testNennerZahl);
        Bruchzahl andereBruchzahl_DIV = new Bruchzahl(testZaehlerZahl2, testNennerZahl2);

        // Addition - ungekürzt
        System.out.print("Test Addition: " + testBruchzahl_ADD + " + " + andereBruchzahl_ADD + " = ");
        testBruchzahl_ADD.bruchAddition(andereBruchzahl_ADD);
        System.out.println(testBruchzahl_ADD);

        // Subtraktion - ungekürzt
        System.out.print("Test Subtraktion: " + testBruchzahl_SUB + " - " + testBruchzahl_SUB + " = ");
        testBruchzahl_SUB.bruchSubtraktion(andereBruchzahl_SUB);
        System.out.println(testBruchzahl_SUB);

        // Multiplikation - ungekürzt
        System.out.print("Test Multiplikation: " + testBruchzahl_MULT + " * " + testBruchzahl_MULT + " = ");
        testBruchzahl_MULT.bruchMultiplikation(andereBruchzahl_MULT);
        System.out.println(testBruchzahl_MULT);

        // Division - ungekürzt
        System.out.print("Test Division: " + testBruchzahl_DIV + " / " + testBruchzahl_DIV + " = ");
        testBruchzahl_DIV.bruchDivision(andereBruchzahl_DIV);
        System.out.println(testBruchzahl_DIV);
    }
}
