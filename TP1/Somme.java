import java.util.Scanner;

class Somme  {
	
	public static void main(String[] args){
		
		System.out.println("Saisir la premiere la valeur");
		Scanner clavier = new Scanner (System.in);
		int a = clavier.nextInt();
		System.out.println("Saisir la deuxieme la valeur");
		int b = clavier.nextInt();
		int Somme;
		Somme = a+b;
		System.out.println("La somme de " + a + " et " + b + " est : " + Somme);
			
	}
}
