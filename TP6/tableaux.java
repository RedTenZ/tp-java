import java.util.Scanner;
public class tableaux {
	static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {

    	System.out.println("Saisissez un nombre de note :");
    	int n = clavier.nextInt();
    	System.out.println("Saisissez la note maximal : ");
    	int noteMax = clavier.nextInt();
    	//int t [] = {1,2,3}
    	//int t[] = new int[n];
    	double t[] = new double[n];
    	/*for(int i=0; i<n; i++){
        	t[i] = clavier.nextInt();
        }
      	for(int i=0; i<n; i++){
        	System.out.println(t[i]);
	        //System.out.println(t);
	        //La référence du tableau est affiché
	      }
	      int max = t[0];
	      int min = t[0];
	      for(int i=1; i<n; i++){
	        if(t[i]>max){
	          max = t[i];
	        }//System.out.println(t);
	        //La référence du tableau est affiché
	      }
	      int max = t[0];
	      int min = t[0];
	      for(int i=1; i<n; i++){
	        if(t[i]>max){
	          max = t[i];
	        }
	        if(t[i]<min){
	          min = t[i];
	        }
	      }
	      System.out.println("Max : " + max + ", " + "Min : " + min);*/
	      noteEleve(t, noteMax);
	      afficherTab(t);
	      System.out.println();
	      System.out.println("La moyenne est : " + moyenneTab(t));
    }
    public static void noteEleve(double[] tab, int noteMax) {
    	for(int i=0; i<tab.length; i++) {
    		System.out.println("Saisissez la note numéro : " + (i+1));
    		double t = clavier.nextDouble();
    		while(t>noteMax || t<0) {
    			System.out.println("LA note est entre 0 et " + noteMax + " ! Réinserez la note :");
    			t = clavier.nextDouble();
    		}
    		tab[i] = t;
    	}

    }

    public static void afficherTab(double[] tab) {
    	for(int i=0; i<tab.length; i++) {
    		System.out.print(tab[i] + " ");
    	}
    }

    public static double moyenneTab(double[] tab) {
    	double moyenne = 0;
    	for(int i=0; i<tab.length; i++) {
    		moyenne += tab[i];
    	}
    	moyenne = (moyenne/tab.length);
    	return moyenne;
    }
}
