import java.util.Scanner;

class Calculatrice {
	public static void main(String[] args){
        while(true)
        {
		double resultat = 0;
		System.out.println("Saisir la premiere valeur : ");
		Scanner clavier = new Scanner(System.in);
		int a = clavier.nextInt();
		System.out.println("Saisir la deuxieme valeur : ");
		int b = clavier.nextInt();
		System.out.println("Saisir 1 pour additionner");
		System.out.println("Saisir 2 pour soustraire");
		System.out.println("Saisir 3 pour multiplier");
		System.out.println("Saisir 4 pour diviser");
		int operation = clavier.nextInt();
		 
		switch(operation){
			case 1: 
				resultat = a+b;
				break;
			case 2:
				resultat = a-b;
				break;
			case 3:
				resultat = a*b;
				break;
			case 4:
				resultat = (double)a/b;
				break;
			default:
				System.out.println("Erreur de saisie de l'operateur");
				break;
		}
		
		if(operation == 1 || operation == 2 || operation == 3 || operation == 4){
		System.out.println("Le resultat est de : " + resultat);
		}	
        }
	
	}
}	