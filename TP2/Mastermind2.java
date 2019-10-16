import java.util.Scanner;

class Mastermind2 {
	public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        
        int l;
        int n;
        
        int i1 = (int)(Math.random()*10);
        int i2 = (int)(Math.random()*10);
        int i3 = (int)(Math.random()*10);
        int i4 = (int)(Math.random()*10);
        
        boolean joueur = true;
        
        int j1tour = 99;
        int j2tour = 99;
        
        char nb1Place = 'a';
        char nb2Place = 'a';
        char nb3Place = 'a';
        char nb4Place = 'a';
        int limitation = 0;
        
        while(limitation != 1 || limitation != 2)
        {
        System.out.println("1 pour limiter 2 pour ne pas limiter");
        limitation = clavier.nextInt();
        }
        if(limitation == 1)
        {
            l=10;
        }else{
            l=99999;
        }
            
        for(int i=1; i<=l;i++)
        {
            // Tour du joueur 
            if(joueur)
            {
                System.out.println("Joueur 1 :");
            }
            else{
                System.out.println("Joueur 2 :");
            }
            int nb1 = 99;
            int nb2 = 99;
            int nb3 = 99;
            int nb4 = 99;
            // Saisis des chiffres 
            while(nb1>10 || nb1 < 0){
            System.out.println("Saisir le premier chiffre");
            nb1 = clavier.nextInt(); 
            }
            while(nb2>10 || nb2 < 0){
            System.out.println("Saisir le second chiffre");
            nb2 = clavier.nextInt(); 
            }
            while(nb3>10 || nb3 < 0){
            System.out.println("Saisir le troisieme chiffre");
            nb3 = clavier.nextInt();  
            }
            while(nb4>10 || nb4< 0){
            System.out.println("Saisir le quatrieme chiffre");
            nb4 = clavier.nextInt();
            }
            
            //Calcul du nombre de bon chiffres 
            n=0;
            if(nb1==i1)
            {
                n+=1;
                nb1Place = 'B';
            }else if(nb1 == i2 || nb1 == i3 || nb1 == i4){
                nb1Place = 'M';
            }else{
                nb1Place = '-';
            }
            
            if(nb2==i2)
            {
                n+=1;
                nb2Place = 'B';
            }else if(nb2 == i1 || nb2 == i3 || nb2 == i4){
                nb2Place = 'M';
            }else{
                nb2Place = '-';
            }
            
            if(nb3==i3)
            {
                n+=1;
                nb3Place = 'B';
            }else if(nb3 == i1 || nb3 == i2 || nb3 == i4){
                nb3Place = 'M';
            }else{
                nb3Place = '-';
            }
            
            if(nb4==i4)
            {
                n+=1;
                nb4Place = 'B';
            }else if(nb4 == i1 || nb4 == i2 || nb4 == i3){
                nb4Place = 'M';
            }else{
                nb4Place = '-';
            }
            
            //Calcul si un joueur est gagnant et le nombre de tour qu'il a mit
            if(n==4)
            {
                if(joueur)
                {
                    System.out.println("Bravo tu as gagne en : " + i + "tours.");
                    j1tour=i;
                }else{
                    System.out.println("Bravo tu as gagne en : " + i + "tours.");
                    j2tour=i;
                }
            //Sinon affichage du nombre de chiffre bon
            }else{
                System.out.println(nb1 + "," + nb2 + "," + nb3 + "," + nb4);
                System.out.println(nb1Place + "," + nb2Place + "," + nb3Place + "," + nb4Place);
            }
            
            //Changement de tour du joueur 
            joueur = !joueur;
                
            //Fin de boucle si les deux joueurs ont finis
            if(j1tour != 99 && j2tour !=99)
            {
                break;
            }
        }
        
        //Calcul du gagnant 
        if(j1tour>j2tour){
            System.out.println("Le joueur 2 est gagnant");
        }else if(j1tour<j2tour){
            System.out.println("Le joueur 1 est gagnant");
        }else{
            System.out.println("Il y a egalite");
        }
	}
}	