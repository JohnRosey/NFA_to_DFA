package projet_compilationAFTtoAFD;
import java.util.*;
import java.lang.*;

public class AFD {
private ArrayList <Character> alphabet;
private ArrayList <String> etats;
private ArrayList <String> etatsFinaux;
private String [][] fonctionTransition;//pas initialis�e au sein d'un constructeur
private String etatInitial;//pas initialis�e au sein d'un constructeur

Scanner lectureClavier=new Scanner(System.in);
public AFD(){
	alphabet= new ArrayList <Character> ();
	etats= new ArrayList <String> () ;
	etatsFinaux= new ArrayList <String>() ;
}
///////////////////////::::::::alphabet////////////////////
public void ajouterSymbole(){
	char a;
	System.out.print("donner un symbole:   ");
	a=lectureClavier.next().charAt(0);
	alphabet.add(new Character(a));
	System.out.print("votre symbole est :   "+a);
}

public void supprimerSymbole(){
    int num;char choix;
    System.out.println("saisir le symbole ");
    choix=lectureClavier.next().charAt(0);
    Character ch=new Character(choix);
	num=alphabet.indexOf(ch);
	alphabet.remove(num);
}
//fontion taille
//fontion affichage
public void menuSymbole(){
	System.out.println("choix 1: ajouter symbole");
	System.out.println("choix 2: supprimer symbole");
	System.out.println("choix 3: afficher alphabet");
	System.out.println("choix 4: afficher taille alphabet");
	System.out.println("choix 5:j'ai terminer la soisie de mon alphabet, je veux sortir de cette boucle");
}

///////////////////////::::::::alphabet////////////////////
///////////////////////::::::::�tats ////////////////////
public void menuEtat(){
	System.out.println("choix 1: ajouter etat");
	System.out.println("choix 2: supprimer etat");
	System.out.println("choix 3: afficher etat");
	System.out.println("choix 4: afficher taille etats");
	System.out.println("choix 5:j'ai terminer la soisie de mes �tats, je veux sortir de cette boucle");
}
public void ajouterEtat(){
	String a;
	System.out.print("donner un �tat sous la forme suivante:q0 ou q1 .....   ");
	a=lectureClavier.nextLine();
	etats.add(a);
	System.out.print("votre �tat est :   "+a);
}

public void supprimeretat(){
    int num;String choix;
    System.out.println("saisir l'�tat ");
    choix=lectureClavier.nextLine();
    num=alphabet.indexOf(choix);
	alphabet.remove(num);
}
//fontion taille
//fontion affichage
///////////////////////::::::::�tats ////////////////////

///////////////////////::::::::Fontion de transition ////////////////////
                 varalphabet=//fontiontaillealphabet
                 var�tats=//fontiontaille�tats
           //taille de mon tableau va �tre varalphabet*vartab  
            //demande de saisie de chaque �l�ment (q0,0)...;
///////////////////////::::::::Fontion de transition ////////////////////                 
  
                 
                 ///////////////////////::::::::�tatsfinaux ///////////////////////:
                 //saisir les �tats finaux 
        ////////////////////�tat finaux ////////////////////
                
                 
                 ////�tat initial//:
                 //choisir un �tat intial
               //choir un �tat initial
 
                 
                 
                 

    


}

