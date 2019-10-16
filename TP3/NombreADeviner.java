// Import des différentes classes
import java.util.Scanner;
import java.lang.Math;

class NombreADeviner  {
	
	public static void main(String[] args){
        // Variables :
        Scanner clavier = new Scanner(System.in);
        int a=0;
        int min = 0;
        int max = 2000;
        int borneA;
        int borneB;
        int c;
        int nombreProposition;
        int restant;
        boolean petit = false;
        
        // Choix des bornes
        System.out.println("Choix de l'intervalle : ");
        System.out.println("Borne A :");
        borneA = clavier.nextInt();        
        System.out.println("Borne B :");
        borneB = clavier.nextInt();
        
        // Remise de la borneA plus petite que la borneB
        if(borneA > borneB)
        {
            c = borneA;
            borneA = borneB;
            borneB = c;
        }
        
        //Calcul du nombre aléatoire
        int nbRandom = borneA + (int)(Math.random() * (borneB-borneA)+1);
        
        // Calcul du nombre de proposition
        nombreProposition = (int)(Math.log((borneB-borneA))/Math.log(2));
        
        while(a != nbRandom && nombreProposition > 0)
        {
            //annonce du nb de proposition
            
            System.out.println("Il te reste : " + nombreProposition + " chances.");
            
            //saisie du nombre au clavier 
            System.out.println("Entrez le nombre aléatoire");
            a = clavier.nextInt();
            
            if(a>max)
            {
                // Si le nombre choisis est plus grand qu'un nombre déjà annoncé comme plus grand
                System.out.println("Trop grand je te l'ai déjà dis !");
            }else if(a<min)
            {
                // Si le nombre choisis est plus petit qu'un nombre déjà annoncé comme plus petit
                System.out.println("Trop petit je te l'ai déjà dis !");
            }else if(a>nbRandom)
            {
                // Si le nombre choisis est plus grand que le nombre caché
                System.out.println("Le nombre est plus petit");
                petit = true;
                max = a;
            }else if(a<nbRandom)
            {
                // Si le nombre choisis est plus petit que le nombre caché
                System.out.println("Le nombre est plus grand");
                petit = false;
                min = a;
            }
            
            nombreProposition--;
        }
        
        // Voir si la personne à gagné ou non
        if(a == nbRandom)
        {
            System.out.println("Tu as gagné");
        }else
        {
            System.out.println("Tu as perdu");
        }
        
	}
}

