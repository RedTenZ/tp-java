import java.util.Scanner;

public class triSelect {
	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		int n = clavier.nextInt();
		creerTab(n);
	}

	public static double[] creerTab(int n) {
		double tab[] = new double[n];
		return tab;
	}

	public static double aleatoire(int borneMax, int borneMin) {
		final double cst = 100;
		// il faudrait multiplier 10 par 10 pour chaque décimal !
		double aleatoire = (double)((int)((Math.random() * ((borneMax - borneMin))) + borneMin)*cst) / cst;;
		return aleatoire;
	}

	public static void remplirAleatoie(int borneMax, int borneMin, double[] tab) {
		for(int i=0; i<tab.length; i++) {
			tab[i] = aleatoire(borneMax, borneMin);
		}
	}

    public static void afficherTab(double[] tab) {
    	for(int i=0; i<tab.length; i++) {
    		System.out.print(tab[i] + " ");
    	}
    }

}
