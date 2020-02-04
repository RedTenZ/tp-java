import java.util.Scanner;
public class Mastermind2 {
  static Scanner clavier = new Scanner(System.in);

  public static void afficherTableauEntiers(int[] t) {
    for(int i=0; i<t.length; i++) {
      System.out.print(t[i] + " ");
    }
  }

  public static void afficherTableauCaracteres(char[] t) {
    for(int i=0; i<t.length; i++) {
      System.out.print(t[i] + " ");
    }
  }

  public static int[] remplirSolution(int taille, int borneMin,int borneMax){
    int t[] = new int[taille];
    boolean pareil = false;
    int a;
    for(int i=0; i<t.length; i++){
      a = (int)(Math.random()*(borneMax -borneMin)+borneMin);
      pareil = dansTab(t, a);
      while(pareil){
        a = (int)(Math.random()*(borneMax -borneMin)+borneMin);
        pareil = dansTab(t, a);
      }
      t[i] = a;
    }
    return t;
  }

  public static boolean dansTab(int[] tab, int a){
    boolean result = false;
    for(int i=0; i<tab.length; i++){
      if(a==tab[i]){result = true;}
    }
    return result;
  }

  public static int[] saisirProposition(int taille, int borneMin,int borneMax){
    int t2[] = new int[taille];
    for(int i=0; i<taille; i++){
        System.out.println("Saisir un chiffre");
        int a = clavier.nextInt();
        while(a>borneMax || a<borneMin){
          a = clavier.nextInt();
        }
        t2[i] = a;
    }
    return t2;
  }

  public static int[] saisirSolution(int taille, int borneMin,int borneMax){
    int t[] = new int[taille];
    System.out.println("Proposez une solution !");
    for(int i=0; i<taille; i++){
        System.out.println("Saisir un chiffre");
        int a = clavier.nextInt();
        while(a>borneMax || a<borneMin){
          a = clavier.nextInt();
        }
        t[i] = a;
    }
    for(int i=0; i<20; i++){
      System.out.println();
    }
    return t;
  }

  public static boolean bienPlacee(int[] solution, int valeur, int position){
    return solution[position]==valeur;
  }

  public static boolean malPlacee(int[] solution, int valeur, int position){
    boolean res = false;
    if(!bienPlacee(solution, valeur,position)){
      for(int i=0; i<solution.length; i++){
        if (valeur == solution[i]) {res = true;}
      }
    }
    return res;
  }

/*  public static char[] compare(int[] proposition, int[] solution){
    char t[] = new char[proposition.length];
    for(int i=0; i<proposition.length; i++){
      if(bienPlacee(solution, proposition[i], i)){
        t[i] = 'B';
      }else if(malPlacee(solution, proposition[i], i)){
        t[i] = 'M';
      }else{
        t[i] = '-';
      }
    }
    return t;
  }*/

  public static char[] compare(int[] proposition, int[] solution){
      int k=0;
      int count = 0;
      int countB = 0;
      int countM = 0;
      for(int i=0; i<proposition.length; i++){
        if(bienPlacee(solution, proposition[i], i)){
          count++;
          countB++;
        }else if(malPlacee(solution, proposition[i], i)){
          count++;
          countM++;
        }
      }
      char t[] = new char[count];
      for(int i=0; i<countB; i++){
        t[i] = 'B';
      }
      for(int i=countB; i<countB+countM; i++){
        t[i] = 'M';
      }
      if(t.length>0){
        return t;
      }else{
        return null;
      }

  }

  public static boolean gagne(char[] resultat, int taille){
    boolean res=false;
    int count=0;
    for(int i=0; i<resultat.length; i++){
      if(resultat[i]=='B'){
        count++;
      }
    }
    if(count==taille){
      res=true;
    }
    return res;
  }

  public static boolean afficherResultat(int[] proposition, int[] solution){
    char t[] = compare(proposition, solution);

    afficherTableauEntiers(proposition);

    System.out.println();

    afficherTableauCaracteres(t);
    System.out.println();

    return gagne(t, proposition.length);
  }

/*public static void main(String[] args){
    System.out.println("Choisissez une taille pour le mastermind ! : ");
    int a = clavier.nextInt();
    System.out.println("Choisissez la borne basse de l'intervalle pour le mastermind ! : ");
    int b = clavier.nextInt();
    System.out.println("Choisissez la borne haute de l'intervalle pour le mastermind ! : ");
    int c = clavier.nextInt();
    int tour = 1;
    //int solution[] = remplirSolution(a);
    int solution[] = remplirSolution(a, b, c);

    //int proposition[] = saisirProposition(a);
    int proposition[] = saisirProposition(a, b, c);
    boolean win = afficherResultat(proposition, solution);
    while(!win){
      tour += 1;
      //proposition = saisirProposition(a);
      proposition = saisirProposition(a,b,c);
      win = afficherResultat(proposition, solution);
    }
    System.out.println("Le nombre de tour pour reussir est de " + tour);
  }
}*/

public static void main(String[] args){
    int j1t = 0;
    int j2t = 0;
    System.out.println("Choisissez une taille pour le mastermind ! : ");
    int a = clavier.nextInt();
    System.out.println("Choisissez la borne basse de l'intervalle pour le mastermind ! : ");
    int b = clavier.nextInt();
    System.out.println("Choisissez la borne haute de l'intervalle pour le mastermind ! : ");
    int c = clavier.nextInt();
    int tour = 1;
    //int solution[] = remplirSolution(a);

    int solution[] = saisirSolution(a, b, c);
    //int proposition[] = saisirProposition(a);
    System.out.println("C'est au joueur 1 :");
    int proposition[] = saisirProposition(a, b, c);

    boolean win = afficherResultat(proposition, solution);
    while(!win){
      tour += 1;
      //proposition = saisirProposition(a);
      proposition = saisirProposition(a,b,c);
      win = afficherResultat(proposition, solution);
    }
    System.out.println("Le nombre de tour pour reussir est de " + tour);
    j1t = tour;

    solution = saisirSolution(a, b, c);
    System.out.println("C'est au joueur 2 :");
    proposition = saisirProposition(a, b, c);
    win = afficherResultat(proposition, solution);
    while(!win){
      tour += 1;
      //proposition = saisirProposition(a);
      proposition = saisirProposition(a,b,c);
      win = afficherResultat(proposition, solution);
    }
    System.out.println("Le nombre de tour pour reussir est de " + tour);
    j2t = tour;
    if(j2t>j1t){
      System.out.println("Joueur 1 est gagnant");
    }else{
      System.out.println("Joueur 2 est gagnant");
    }
  }
}
