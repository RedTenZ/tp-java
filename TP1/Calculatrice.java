import java.util.Scanner;

class Calculatrice {
	public static void main(String[] args){
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
		double resultat = 0;
		if(operation==1){
			resultat = a+b;
		}else { if(operation==2){
				resultat = a-b;
			}else { if(operation==3){
				resultat = a*b;
				}else if(operation==4){
					resultat = (double)a/b;
				}else { 
				operation = 0;
				System.out.println("Erreur de symbole pour operation veuillez saisir de 1 a 4");
			}
			
		}
		if(operation!=0){
		System.out.println("Le resultat est : " + resultat);
			}
		}
	
	}
}	