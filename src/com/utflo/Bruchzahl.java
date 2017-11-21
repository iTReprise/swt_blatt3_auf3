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
    public void bruchAddition(Bruchzahl andererBruch) {
        zaehler.multipliziereMit(andererBruch.getNenner());
        andererBruch.getZaehler().multipliziereMit(nenner);
        nenner.multipliziereMit(andererBruch.getNenner());
        zaehler.addiereHinzu(andererBruch.getZaehler());
    }

    // Subtraktion
    public void bruchSubtraktion(Bruchzahl andererBruch) {
        zaehler.multipliziereMit(andererBruch.getNenner());
        andererBruch.getZaehler().multipliziereMit(nenner);
        nenner.multipliziereMit(andererBruch.getNenner());
        zaehler.zieheDavonAb(andererBruch.getZaehler());
    }

    // Multiplikation
    public void bruchMultiplikation(Bruchzahl andererBruch) {
        zaehler.multipliziereMit(andererBruch.getZaehler());
        nenner.multipliziereMit(andererBruch.getNenner());
    }

    // Division
    public void bruchDivision(Bruchzahl andererBruch) {
        zaehler.multipliziereMit(andererBruch.getNenner());
        nenner.multipliziereMit(andererBruch.getZaehler());
    }
}
