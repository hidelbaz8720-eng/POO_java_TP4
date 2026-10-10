package com.example.tp;

public class Main {

 public static void main(String[] args) {
	        // Création de deux étudiants
	        Etudiant e1 = new Etudiant("Dupont", "Alice");
	        Etudiant e2 = new Etudiant("Martin", "Bob");

	        // Ajout de notes
	        e1.ajouterNote(14.5);
	        e1.ajouterNote(12.0);
	        e1.ajouterNote(16.0);
	        e2.ajouterNote(10.0);
	        e2.ajouterNote(13.5);
            System.out.println("--------la affichge-------------");
	        // Affichage des notes et moyennes
	        e1.afficherNotes();
	        System.out.println(e1);

	        e2.afficherNotes();
	        System.out.println(e2);
	        
	        System.out.println("--------supprimer Derniere Note-------------");
	        // supprimer Derniere Note
	        e1.supprimerDerniereNote();
	        e2.supprimerDerniereNote();
	        
	        
	        System.out.println("--------Affichage des notes et moyennes apree le supprision-------------");
	        // Affichage des notes et moyennes
	        e1.afficherNotes();
	        System.out.println(e1);

	        e2.afficherNotes();
	        System.out.println(e2);
	        
	        System.out.println("--------le maximent des notes-------------");
	        //le maximent des notes 
	        System.out.println(e1.max());
	        System.out.println(e2.max());
	        
	    }
	}


