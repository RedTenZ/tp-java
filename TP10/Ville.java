<<<<<<< HEAD
import java.util.Scanner;

class Ville {
    static Scanner clavier = new Scanner(System.in);

    public static String[] saisirVilles(){
        System.out.println("Entrez le nombre de ville :");
        int nbVille = clavier.nextInt();
        String[] t = new String[nbVille];
        clavier.nextLine();
        for(int i = 0; i<t.length; i++){
            System.out.println("Entrez le nom de la ville : ");
            t[i] = clavier.nextLine();
        }
        return t;
    }

    public static void afficherVille(String t[]){
        for(int i=0; i<t.length; i++){
            System.out.println(i + " : " + t[i]);
        }
    }

    public static int[][] saisirDistances(String t[]){
      int [][] matrice = new int[t.length][t.length];
      for(int i=0; i<matrice.length; i++){
        System.out.println("Saisir la distance entre " + t[i] + " et :");
        for(int j=0; j<matrice[i].length; j++){
          System.out.print("-" + t[j] + " : ");
          matrice[i][j] = clavier.nextInt();
        }
      }
      return matrice;
    }

    public static void afficherDistances(int matrice[][]){
      for(int i=0; i<matrice.length; i++){
        for(int j=0; i<matrice[i].length; j++){
          System.out.print(matrice[i][j]+" ");
        }
        System.out.println();
      }
    }

    public static int[] saisirParcours(){
      System.out.println("Saisir le nombre de ville qui compose le parcours : ");
      int nbVille = clavier.nextInt();
      int [] tab = new int[nbVille];
      for(int i=0; i<tab.length; i++){
        System.out.println("Saisir la ville numéro" + (i+1) + " : ");
        tab[i] = clavier.nextInt();
      }
      return tab;
    }

    public static void afficherParcours(String t[], int tab[]){
      for(int i=0; i<tab.length; i++){
        System.out.print(t[tab[i]] + "-");
      }
    }

    public static int distanceParcours(int tab[], int matrice[][]){
      int distance = 0;
      for(int i=0; i<tab.length-1; i++){
        distance += matrice[tab[i]][tab[i+1]];
      }
      return distance;
    }

    public static void main(String[] args){
        String t[] = saisirVilles();
        afficherVille(t);
        int[][] matrice = saisirDistances(t);
        afficherDistances(matrice);
        int[] tab = saisirParcours();
        afficherParcours(t, tab);
        int distance = distanceParcours(tab, matrice);
        System.out.println("La distance du parcours est de : " + distance);
    }

}
=======
import java.util.Scanner;

class Ville {
    static Scanner clavier = new Scanner(System.in);

    public static String[] saisirVilles(){
        System.out.println("Entrez le nombre de ville :");
        int nbVille = clavier.nextInt();
        String[] t = new String[nbVille];
        clavier.nextLine();
        for(int i = 0; i<t.length; i++){
            System.out.println("Entrez le nom de la ville : ");
            t[i] = clavier.nextLine();
        }
        return t;
    }

    public static void afficherVille(String t[]){
        for(int i=0; i<t.length; i++){
            System.out.println(i + " : " + t[i]);
        }
    }

    public static int[][] saisirDistances(String t[]){
      int [][] matrice = new int[t.length][t.length];
      for(int i=0; i<matrice.length; i++){
        System.out.println("Saisir la distance entre " + t[i] + " et :");
        for(int j=0; j<matrice[i].length; j++){
          System.out.print("-" + t[j] + " : ");
          matrice[i][j] = clavier.nextInt();
        }
      }
      return matrice;
    }

    public static void afficherDistances(int matrice[][]){
      for(int i=0; i<matrice.length; i++){
        for(int j=0; j<matrice[i].length; j++){
          System.out.print(matrice[i][j]+" ");
        }
        System.out.println();
      }
    }

    public static int[] saisirParcours(){
      System.out.println("Saisir le nombre de ville qui compose le parcours : ");
      int nbVille = clavier.nextInt();
      int [] tab = new int[nbVille];
      for(int i=0; i<tab.length; i++){
        System.out.println("Saisir la ville numero" + (i+1) + " : ");
        tab[i] = clavier.nextInt();
      }
      return tab;
    }

    public static void afficherParcours(String t[], int tab[]){
      for(int i=0; i<tab.length; i++){
        System.out.print(t[tab[i]] + "-");
      }
    }

    public static int distanceParcours(int tab[], int matrice[][]){
      int distance = 0;
      for(int i=0; i<tab.length-1; i++){
        distance += matrice[tab[i]][tab[i+1]];
      }
      return distance;
    }

    public static void main(String[] args){
        String t[] = saisirVilles();
        afficherVille(t);
        int[][] matrice = saisirDistances(t);
        afficherDistances(matrice);
        int[] tab = saisirParcours();
        afficherParcours(t, tab);
        int distance = distanceParcours(tab, matrice);
        System.out.println("La distance du parcours est de : " + distance);
    }

}
>>>>>>> TP10 corriger
