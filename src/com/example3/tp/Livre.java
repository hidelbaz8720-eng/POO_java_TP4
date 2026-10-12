
package com.example3.tp;

public class Livre {
    private static int compteur = 0;
    private final int id;
    private String titre;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur) {
        this.id = ++compteur;
        this.titre = titre;
        this.auteur = auteur;

        if (auteur != null) {
            auteur.ajouterLivre(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        String nomAuteur = (auteur != null)
                ? auteur.getNom()
                : "Inconnu";

        return "Livre[id=" + id
                + ", titre=" + titre
                + ", auteur=" + nomAuteur + "]";
    }
}
