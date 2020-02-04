import java.util.Scanner;
// Pour "a" à la puissance "b" on utilise la méthode pow(a,b)
// la méthode permettant de calculer le cos est "cos()"
// la méthode permettant de générer un nombre aléatoire est "random()"

class Maths1  {
	
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez n");
		int n = clavier.nextInt();
        
		double max = -5;
		double min = 15;
		
		for(int i=0; i<n; i++){
            double r = Math.random();
			System.out.println(r);
			if (max<r){
				max = r;
			}
			if (min>r){
				min = r;
			}
			
		}
		System.out.println("min = "+ min + " max = "+ max);
	}
}

