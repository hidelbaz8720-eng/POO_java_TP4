# TP 4 – Classes et Objets en Java

**Module :** Fondamentaux et Concepts Avancés de la Programmation Java  
**Plateforme :** MLIAEdu  
**Auteur :** Hamza ID EL BAZ

## 📌 Présentation du TP

Ce TP a pour objectif de mettre en pratique les principes fondamentaux de la programmation orientée objet (POO) en Java. À travers six exercices, nous apprenons à créer des classes, définir des attributs et des méthodes, manipuler des objets et établir des associations entre différentes classes.

## 🧩 Exercice 1 : Gestion d’un étudiant avec un tableau de notes
<img width="1366" height="768" alt="1" src="https://github.com/user-attachments/assets/d2eda3c5-16f4-4362-a4d1-8dfa1155aefe" />
<img width="1366" height="768" alt="p1" src="https://github.com/user-attachments/assets/fcd2abc4-e1fb-4941-b8c2-0ccb6bae7d4a" />

### Description
Cet exercice consiste à créer une classe `Etudiant` permettant de représenter un étudiant et de gérer ses notes à l’aide d’un tableau. Il permet de stocker les notes et de réaliser des opérations de gestion et de calcul sur celles-ci.

### Concepts utilisés
- Création de classes et d’objets.
- Attributs et constructeurs.
- Tableaux en Java.
- Boucles et parcours de tableaux.
- Méthodes de calcul et d’affichage.
- Encapsulation des données.

## 🧩 Exercice 2 : Association Étudiant ↔ Filière
<img width="1366" height="768" alt="2" src="https://github.com/user-attachments/assets/5bb9752a-69d2-4f22-83bc-23fec4364a18" />

### Description
Cet exercice consiste à créer deux classes, `Etudiant` et `Filiere`, pour représenter les étudiants et les filières universitaires. Une filière peut contenir plusieurs étudiants. Le projet utilise un tableau dynamique qui s’agrandit automatiquement lorsque sa capacité est atteinte.

### Concepts utilisés
- Association un-à-plusieurs.
- Relations entre objets.
- Identifiants automatiques avec `static`.
- Attributs `private` et `final`.
- Tableaux dynamiques avec `System.arraycopy()`.
- Encapsulation et redéfinition de `toString()`.

## 🧩 Exercice 3 : Gestion des articles
<img width="1366" height="768" alt="3" src="https://github.com/user-attachments/assets/d43aba62-d069-4845-831c-eba7c7e5b28a" />

### Description
Cet exercice porte sur la création d’une application de gestion des articles. Il permet de représenter les articles à l’aide d’une classe dédiée et de manipuler leurs informations en utilisant les principes de la programmation orientée objet.

### Concepts utilisés
- Création et manipulation d’objets.
- Définition des attributs et des constructeurs.
- Méthodes d’accès et de modification.
- Encapsulation.
- Organisation des données.
- Affichage des informations des articles.

## 🧩 Exercice 4 : Gestion des auteurs, livres et bibliothèques
<img width="1366" height="768" alt="4" src="https://github.com/user-attachments/assets/f7c52ebc-e0d7-4ff3-838d-ebc99b205433" />

### Description
Cet exercice consiste à modéliser un système de gestion de bibliothèque à travers les classes `Auteur`, `Livre` et `Bibliotheque`. Il permet de représenter les relations entre les auteurs et leurs livres, ainsi que la gestion des livres au sein d’une bibliothèque.

### Concepts utilisés
- Création de plusieurs classes associées.
- Associations entre objets.
- Gestion de plusieurs livres.
- Tableaux ou collections d’objets selon l’implémentation.
- Encapsulation.
- Parcours et affichage des objets.

## 🧩 Exercice 5 : Gestion des nombres complexes
<img width="1366" height="768" alt="ex5" src="https://github.com/user-attachments/assets/92789f24-8fa5-438b-a624-0b7fc7c74a52" />


### Description
Cet exercice consiste à créer une classe `Complexe` représentant un nombre complexe composé d’une partie réelle et d’une partie imaginaire. La classe permet d’effectuer l’addition et la soustraction de deux nombres complexes, puis d’afficher les résultats sous une forme lisible.

### Fonctionnalités
- Création d’un nombre complexe.
- Addition avec la méthode `plus()`.
- Soustraction avec la méthode `moins()`.
- Affichage personnalisé avec `toString()`.

### Concepts utilisés
- Constructeurs et attributs privés.
- Méthodes retournant des objets.
- Opérations mathématiques.
- Encapsulation.
- Redéfinition de `toString()`.

## 🧩 Exercice 6 : Gestion des points dans un espace cartésien
<img width="1366" height="768" alt="ex6" src="https://github.com/user-attachments/assets/58e8dc4f-30c1-4ea9-82fe-161c52041ca5" />

### Description
Cet exercice consiste à créer une classe `Point` représentant un point dans un plan cartésien à partir de ses coordonnées `x` et `y`. La classe permet de déplacer un point par translation et de calculer la distance entre deux points.

### Fonctionnalités
- Création d’un point à partir de ses coordonnées.
- Translation avec la méthode `translation()`.
- Calcul de distance avec la méthode statique `distance()`.
- Affichage des coordonnées avec `toString()`.

### Concepts utilisés
- Attributs et constructeurs.
- Méthodes d’instance et méthodes `static`.
- Calculs mathématiques avec `Math.sqrt()` et `Math.pow()`.
- Création de nouveaux objets.
- Redéfinition de `toString()`.

## 🎯 Objectifs pédagogiques généraux

À la fin de ce TP, les compétences développées sont :

- Comprendre les bases de la programmation orientée objet en Java.
- Concevoir des classes adaptées à un problème donné.
- Créer et manipuler des objets.
- Utiliser les constructeurs, les attributs et les méthodes.
- Comprendre les associations entre objets.
- Manipuler des tableaux et gérer leur capacité.
- Utiliser les méthodes statiques et les méthodes d’instance.
- Redéfinir la méthode `toString()` pour personnaliser l’affichage.

## 🛠️ Technologies utilisées

- **Langage :** Java
- **Environnement :** JDK 8 ou supérieur
- **Concepts :** Programmation orientée objet (POO)
- **Plateforme pédagogique :** MLIAEdu

## 📚 Conclusion

Ce TP permet de consolider les connaissances en Java à travers des exemples pratiques couvrant la gestion des étudiants, les associations entre objets, les articles, les bibliothèques et les opérations mathématiques. Il constitue une étape importante dans l’apprentissage de la programmation orientée objet et la conception de programmes structurés.

## 👨‍💻 Auteur

**Hamza ID EL BAZ**  
Étudiant à l’École Normale Supérieure de Marrakech  
Université Cadi Ayyad
