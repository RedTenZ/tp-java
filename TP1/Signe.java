import java.util.Scanner;

class Signe {
	public static void main(String[] args){
		System.out.println("Entrez un nombre :");
		Scanner clavier = new Scanner(System.in);
		int a = clavier.nextInt();
		if (a>0){
			System.out.println("Le nombre est positif");
		}else{
				if (a==0){
					System.out.println("Vous avez saisi 0");
				
				}else{
						System.out.println("Le nombre est negatif");



				}				
		}

	}	
	
}