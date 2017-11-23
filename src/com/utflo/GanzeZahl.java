package com.utflo;

public final class GanzeZahl {
    private final long zahl;

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
    public GanzeZahl addiereHinzu(GanzeZahl andereZahl) {
        return new GanzeZahl(zahl + andereZahl.getZahl());
    }

    // Subtraktion
    public GanzeZahl zieheDavonAb(GanzeZahl andereZahl) {
        return new GanzeZahl(zahl - andereZahl.getZahl());
    }

    // Multiplikation
    public GanzeZahl multipliziereMit(GanzeZahl andereZahl) {
        return new GanzeZahl(zahl * andereZahl.getZahl());
    }

    // Division
    public GanzeZahl teileDurch(GanzeZahl divisor) {
        return new GanzeZahl(zahl / divisor.getZahl());
    }
}
