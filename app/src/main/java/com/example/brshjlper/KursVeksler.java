package com.example.brshjlper;

import java.util.Observable;

public class KursVeksler extends Observable {
    private int antalAktier = 1;
    private double koebskurs = 1.0; //Penge
    private double kurtageStart = 29; //Penge
    private double samletAktieVærdi = antalAktier*koebskurs;
    private double kurtage; //procent


    public void calcKurtage() {
        if (samletAktieVærdi * kurtage > kurtageStart) {
            kurtage = kurtage * samletAktieVærdi;
        }
    }

    public void setAntalAktier(int antalAktier) {
        this.antalAktier = antalAktier;
    }

    public int getAntalAktier() {
        return antalAktier;
    }

    public void setKoebskurs(double koebskurs) {
        this.koebskurs = koebskurs;
    }

    public double getKoebskurs() {
        return koebskurs;
    }

    public double getKurtage() {
        return kurtage;
    }

    public void setKurtage(double kurtage) {
        this.kurtage = kurtage;
    }

    public KursVeksler(){
    }
}
