import java.util.Scanner;

public class triSelect {
	static Scanner clavier = new Scanner(System.in);

	public static double[] creerTab(int n) {
		double tab[] = new double[n];
		return tab;
		//Le programme renvoie une erreur si negatif ou nulle
	}

	public static double aleatoire(double borneMax, double borneMin) {
		final double cst = 100;
		// il faudrait multiplier 10 par 10 pour chaque décimal !
		double aleatoire = (double)((int)((Math.random()*(borneMax -borneMin)+borneMin) * cst)) / cst;
		return aleatoire;
	}

	public static void remplirAleatoire(double borneMax, double borneMin, double[] tab) {
		for(int i=0; i<tab.length; i++) {
			tab[i] = aleatoire(borneMax, borneMin);
		}
	}

    public static void afficherTab(double[] tab) {
    	for(int i=0; i<tab.length; i++) {
    		System.out.print(tab[i] + " ");
    	}
    }

		public static int indiceMinimum(double[] tab){
			double min = tab[0];
			int indice = 0;
			for(int i=0; i<tab.length; i++){
				if(tab[i]<min){
					min=tab[i];
					indice = i;
				}
			}
			return indice;
		}

		public static double maximum(double[] tab){
				double max = tab[0];
				for(int i=0; i<tab.length; i++){
					if(tab[i]>max){
						max=tab[i];
					}
				}
				return max;
		}
		public static void triSel(double[] t1){
			double t2[] = new double[t1.length];
			double max = maximum(t1);
			for(int i=0; i<t1.length; i++){
				int minInd = indiceMinimum(t1);
				t2[i] = t1[minInd];
				t1[minInd] = max;
			}
			for(int i=0; i<t1.length; i++){
				t1[i] = t2[i];
			}
		}
		public static void main(String[] args) {
			System.out.println("Entrez la taille du tableau : ");
			int n = clavier.nextInt();
			System.out.println("Entrez la borne inférieur de l'intervalle : ");
			int a = clavier.nextInt();
			System.out.println("Entrez la borne supérieur de l'intervalle : ");
			int b = clavier.nextInt();

			double tab[] = creerTab(n);

			remplirAleatoire(a,b,tab);

			System.out.println("Le tableau initialisé est le suivant : ");
			afficherTab(tab);

			triSel(tab);

			System.out.println();
			System.out.println("Le tableau trier est : ");
			afficherTab(tab);
			
		}
}
