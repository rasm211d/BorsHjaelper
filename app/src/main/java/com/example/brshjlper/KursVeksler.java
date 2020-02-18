package com.example.brshjlper;

import java.util.Observable;

public class KursVeksler extends Observable {
    private double antalAktier = 1.0;
    private double koebskurs = 1.0; //Penge
    private double kurtageStart = 29; //Penge
    private double samletAktieVærdi = antalAktier*koebskurs;
    private double kurtage; //procent

    public KursVeksler(){
    }



    public void calcKurtage() {
        if (samletAktieVærdi * kurtage > kurtageStart) {
            kurtage = kurtage * samletAktieVærdi;
        }
    }

    public void setAntalAktier(Double antalAktier) {
        this.antalAktier = antalAktier;
    }

    public double getAntalAktier() {
        return antalAktier;
    }

    public void setKoebskurs(double koebskurs) {
        this.koebskurs = koebskurs;
    }

    public double getKoebskurs() {
        return koebskurs;
    }

    public void setKurtageStart(double kurtageStart) {
        this.kurtageStart = kurtageStart;
    }

    public double getKurtageStart() {
        return kurtageStart;
    }

    public double getKurtage() {
        return kurtage;
    }

    public void setKurtage(double kurtage) {
        this.kurtage = kurtage;
    }


}
