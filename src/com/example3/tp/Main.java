
package com.example3.tp;

public class Main {
    public static void main(String[] args) {
        Auteur hugo = new Auteur("Victor Hugo");
        Auteur orwell = new Auteur("George Orwell");

        Livre livre1 = new Livre("Les Misérables", hugo);
        Livre livre2 = new Livre("Notre-Dame de Paris", hugo);
        Livre livre3 = new Livre("1984", orwell);

        Bibliotheque centrale = new Bibliotheque("Centrale");
        Bibliotheque quartier = new Bibliotheque("Quartier");

        centrale.ajouterLivre(livre1);
        centrale.ajouterLivre(livre3);

        quartier.ajouterLivre(livre1);
        quartier.ajouterLivre(livre2);

        System.out.println(hugo);
        for (Livre livre : hugo.getLivres()) {
            System.out.println("  " + livre);
        }

        System.out.println(orwell);
        for (Livre livre : orwell.getLivres()) {
            System.out.println("  " + livre);
        }

        System.out.println(centrale);
        for (Livre livre : centrale.getCollection()) {
            System.out.println("  " + livre.getTitre());
        }

        System.out.println(quartier);
        for (Livre livre : quartier.getCollection()) {
            System.out.println("  " + livre.getTitre());
        }
    }
}
