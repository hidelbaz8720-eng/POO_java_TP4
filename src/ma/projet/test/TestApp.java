package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {
	public static void main(String[] args) {
	Categorie []categotie =new Categorie[2];
	Article []article =new Article[4];
	
	categotie[0]=new Categorie("Ordinateur Portable","O PR");
	categotie[1]=new Categorie("Ordinateur Poste","O PO");
	
	
	/*categotie[0].setLibelle("Ordinateur Portable");
	categotie[0].setcode("O PR");
	
	categotie[1].setLibelle("Ordinateur Poste");
	categotie[1].setcode("O PO");*/
	
	// creer 4 articles 
	
	article[0] = new Article(14,"DELL INSPIRON",categotie[0]);
	/*article[0].setCode(14);
	article[0].setDesignation("DELL INSPIRON");
	article[0].setCategorie(categotie[0]);*/
	
	
	article[1]=new Article(4,"SONY VAIO",categotie[0]);
	/*article[1].setCode(4);
	article[1].getDesignation("SONY VAIO");
	article[1].getCategorie(categotie[0]);*/
	

	
	article[2] = new Article(74,"TERRA",categotie[1]);
	/*article[2].setCode(74);
	article[2].setDesignation("HP PAVILLON");
	article[2].setCategorie(categotie[1]);*/
	
	article[3] = new Article(785,"DELL OPTIPLEX",categotie[1]);
	/*article[3].setCode(785);
	article[3].getDesignation("DELL OPTIPLEX");
	article[3].getCategorie(categotie[1]);*/
	
	for(int i=0 ; i<categotie.length; i ++) {
		System.out.println(categotie[i].getLibelle() +":");
		for(int j = 0;j<article.length ; j++ ) {
			if (article [j].getCategorie().getId()==categotie[i].getId()) {
				System.out.println(" - "+article[j].toString());
			}
		}
	}
	}
}
	
	
	
	


