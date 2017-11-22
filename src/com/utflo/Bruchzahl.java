package com.utflo;

public final class Bruchzahl {

    private final GanzeZahl zaehler;
    private final GanzeZahl nenner;

    // Konstruktor
    public Bruchzahl(GanzeZahl zaehlerZahl, GanzeZahl nennerZahl) {
        zaehler = new GanzeZahl(zaehlerZahl.getZahl());
        nenner = new GanzeZahl(nennerZahl.getZahl());
    }

    // get-Methode für Zähler
    public GanzeZahl getZaehler() {
        return zaehler;
    }

    // get-Methode für Nenner
    public GanzeZahl getNenner() {
        return nenner;
    }

    // String Override für Ausgabe
    @Override
    public String toString() {
        return getZaehler() + "/" + getNenner();
    }

    // Addition
    public Bruchzahl bruchAddition(Bruchzahl andererBruch) {
        Bruchzahl zwischenBruch = new Bruchzahl(zaehler.multipliziereMit(andererBruch.nenner), nenner.multipliziereMit(andererBruch.nenner));
        Bruchzahl zwischenBruch2 = new Bruchzahl(andererBruch.zaehler.multipliziereMit(nenner), zwischenBruch.nenner);
        return new Bruchzahl(zwischenBruch.zaehler.addiereHinzu(zwischenBruch2.zaehler), zwischenBruch.nenner);
    }

    // Subtraktion
    public Bruchzahl bruchSubtraktion(Bruchzahl andererBruch) {
        Bruchzahl zwischenBruch = new Bruchzahl(zaehler.multipliziereMit(andererBruch.nenner), nenner.multipliziereMit(andererBruch.nenner));
        Bruchzahl zwischenBruch2 = new Bruchzahl(andererBruch.zaehler.multipliziereMit(nenner), zwischenBruch.nenner);
        return new Bruchzahl(zwischenBruch.zaehler.zieheDavonAb(zwischenBruch2.zaehler), zwischenBruch.nenner);
    }

    // Multiplikation
    public Bruchzahl bruchMultiplikation(Bruchzahl andererBruch) {
        return new  Bruchzahl(zaehler.multipliziereMit(andererBruch.zaehler), nenner.multipliziereMit(andererBruch.nenner));
    }

    // Division
    public Bruchzahl bruchDivision(Bruchzahl andererBruch) {
        return new  Bruchzahl(zaehler.multipliziereMit(andererBruch.nenner), nenner.multipliziereMit(andererBruch.zaehler));
    }
}
