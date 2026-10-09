package com.exemple5.tp;

public class Complexe {

    private double reel;
    private double imaginaire;

    // Constructeur
    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    // Addition de deux nombres complexes
    public Complexe plus(Complexe c) {
        return new Complexe(
            this.reel + c.reel,
            this.imaginaire + c.imaginaire
        );
    }

    // Soustraction de deux nombres complexes
    public Complexe moins(Complexe c) {
        return new Complexe(
            this.reel - c.reel,
            this.imaginaire - c.imaginaire
        );
    }

    // Affichage du nombre complexe
    @Override
    public String toString() {
        if (imaginaire < 0) {
            return reel + " " + imaginaire + "i";
        }
        return reel + " +" + imaginaire + "i";
    }
}


