import java.util.*;

class Trie {   
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

    public static long getTemps() {
        Date d = new Date();
        return d.getTime();
    }
    
    public static int[] clone (int[] t){
        int t2[] = new int[t.length];
        for(int i=0; i<t.length; i++){
            t2[i] = t[i];
        }
        return t2;
    }
    
    public static int indiceMinimum(int[] tab){
			int min = tab[0];
			int indice = 0;
			for(int i=0; i<tab.length; i++){
				if(tab[i]<min){
					min=tab[i];
					indice = i;
				}
			}
			return indice;
    }

		public static int maximum(int[] tab){
				int max = tab[0];
				for(int i=0; i<tab.length; i++){
					if(tab[i]>max){
						max=tab[i];
					}
				}
				return max;
		}
    
    public static void triSelection(int[] t1){
			int t2[] = new int[t1.length];
			int max = maximum(t1);
			for(int i=0; i<t1.length; i++){
				int minInd = indiceMinimum(t1);
				t2[i] = t1[minInd];
				t1[minInd] = max;
			}
        
			for(int i=0; i<t1.length; i++){
				t1[i] = t2[i];
			}
    }
    
    public static int indiceMinimum2(int[] tab, int n){
			int min = tab[n];
			int indice = 0;
			for(int i=n; i<tab.length; i++){
				if(tab[i]<min){
					min=tab[i];
					indice = i;
				}
			}
			return indice;
    }
    
    public static void triSelectionEchange(int[] t){
        int temp;
        for(int i=0; i<t.length; i++){
            int minInd = indiceMinimum2(t, i);
            temp = t[i];
            t[i] = t[minInd];
            t[minInd] = temp;
        }
    }
    
    public static void main (String[] args){
        
        //Saisie clavier de l'utilisateur
        System.out.println("Saisir la taille du tableau");
        int taille = clavier.nextInt();
        System.out.println("Saisir la borne basse");
        int a = clavier.nextInt();
        System.out.println("Saisir la borne haute");
        int b = clavier.nextInt();
        
        int[] tab = genererTableau(taille, a, b);
        int[] tab2 = clone(tab);
        int[] tab3 = clone(tab);
        
        long temp = getTemps();
        triSelection(tab2);
        temp = getTemps() - temp;
        System.out.println("Le temps d'execution est de : " + temp + " millisecondes");
        
        long temp2 = getTemps();
        triSelectionEchange(tab3);
        temp2 = getTemps() - temp2;
        System.out.println("Le temps d'execution est de : " + temp2 + " millisecondes");
        
        //1000 valeurs :
        // Tri par selection : 0 ms
        // Tri par selection echange : 0ms         
        //2000 valeurs :
        // Tri par selection : 0 ms
        // Tri par selection echange : 0ms         
        //1000 valeurs :
        // Tri par selection : 15 ms
        // Tri par selection echange : 0ms         
        //10000 valeurs :
        // Tri par selection : 31 ms
        // Tri par selection echange : 15ms 
        
    }
}
