package com.utflo;

public final class GanzeZahl {
    private long zahl;

    // Konstruktor
    public GanzeZahl(long wert) {
        zahl = wert;
    }

    // get-Methode
    public long getZahl() {
        return zahl;
    }

    // String Override für Ausgabe
    @Override
    public String toString() {
        return String.valueOf(getZahl());
    }

    // Addition
    public void addiereHinzu(GanzeZahl andereZahl) {
        zahl += andereZahl.getZahl();
    }

    // Subtraktion
    public void zieheDavonAb(GanzeZahl andereZahl) {
        zahl -= andereZahl.getZahl();
    }

    // Multiplikation
    public void multipliziereMit(GanzeZahl andereZahl) {
        zahl *= andereZahl.getZahl();
    }

    // Division
    public void teileDurch(GanzeZahl dividend) {
        zahl /= dividend.getZahl();
    }
}
