import java.util.*;

class RechercheTab {   
    static Scanner clavier = new Scanner(System.in);
    
    public static int aleatoire (int a, int b){
        int nbAleatoire = a + (int)(Math.random() *((b - a)+1));
        return nbAleatoire;
    }
    
    public static int[] genererTableau (int n, int a, int b){
        int t[] = new int[n];
        for(int i=0; i<t.length; i++){
            t[i] = aleatoire(a,b);
        }
        return t;
    }
    
    public static void afficher (int[] t){
        for(int i=0; i<t.length; i++){
             System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public static int rechercheSequentielle (int[] t, int a){
        int indice = -1;
        int i=0;
        
        while(t[i]!=a || i!=t.length-1){
            
            if(t[i]==a){
                indice=i;
            }
            i++;
        }
        return indice;
    }
    
    
    
    public static int rechercheSequentielleTriee (int[] t, int a){
        int indice = -1;
        int i = 0;
        
        while(t[i]<a || i<t.length-3){
            i++;
        }
        
        if(t[i]==a){
            indice = i;
        }
        
        return indice;
    }
    
    public static int rechercheDichotomique (int[] t, int x){
        boolean trouve = false;
        int a = 0;
        int b = t.length-1;
        int i = -99;
        int indice;
        
        while(a <= b && !trouve){
            i = (a+b)/2;
            
            if(t[i]==x){
                trouve = true;
            }else if(t[i]<x){
                a = i+1;
            }else{
                b = i-1;
            }
        }
        
        if(trouve){
            indice = i;
        }else{
            indice = -1;
        }
        
        return indice;
    }
    
    public static long getTemps() {
        Date d = new Date();
        return d.getTime();
    }

    
    public static void main (String[] args){
        
        // Saisie des valeurs
        System.out.println("Saisir la taille du tableau");
        int taille = clavier.nextInt();
        System.out.println("Saisir la borne basse");
        int a = clavier.nextInt();
        System.out.println("Saisir la borne haute");
        int b = clavier.nextInt();
        
        // Inversion des bornes si erreur ! 
        int c;
        if(a>b){
            c = a;
            a = b;
            b = c;
        }
        int[] tab = genererTableau(taille, a, b);
        Arrays.sort(tab);
        //afficher(tab);
        
        System.out.println("Saisir le nombre de recherche a effectuer");
        int nbRech = clavier.nextInt();
        int[] tab2 = genererTableau(nbRech, a, b);
        //afficher(tab2);
        int indice;
        long temp = getTemps();
        for(int i=0; i<tab2.length; i++){
            indice = rechercheSequentielle(tab, tab2[i]);
            //System.out.print(indice + " ");
        }
        temp = getTemps() - temp;
        System.out.println("Le temps d'execution est de : " + temp + " millisecondes");
        
        long temp2 = getTemps();
        for(int i=0; i<tab2.length; i++){
            indice = rechercheSequentielleTriee(tab, tab2[i]);
            //System.out.print(indice + " ");
        }
        temp2 = getTemps() - temp2;
        System.out.println("Le temps d'execution est de : " + temp2 + " millisecondes");
        
        long temp3 = getTemps();
        for(int i=0; i<tab2.length; i++){
            indice = rechercheDichotomique(tab, tab2[i]);
            //System.out.print(indice + " ");
        }
        temp3 = getTemps() - temp3;
        System.out.println("Le temps d'execution est de : " + temp3 + " millisecondes");
        
        //Pour 500 000 valeurs et recherche, le temps execution du premier est de 21395 millisecondes, celui du second est de 10 milliseconde et celui du troisieme est de 58 millisecondes
        
    }
}
