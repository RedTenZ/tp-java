import java.util.Scanner;


class Cercle{
	
	public static void main(String[] args){

		System.out.println("Entrez le rayon : ");
		Scanner clavier = new Scanner(System.in);
		int r = clavier.nextInt();
        
        while(r<0)
        {
            System.out.println("La valeur doit etre positif")
            int r = clavier.nextInt();
        }
	
		double p = (Math.PI*r*2); 
		
		System.out.println("Le perimetre du cercle est : "+p);
	}
}

