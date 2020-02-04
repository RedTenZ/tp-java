import java.util.Scanner;

class Calculs {
    
    public static int factorielle(int a){
        int b = a;
        for(int i=1; i<a; i++){
            b=b*i;
        }
        return b;
    }
    
    public static int puissance(int nbA, int nbB){
        int result = 1;
        for(int i=1; i<=nbB; i++){
            result = result*nbA;
        }
        return result;
    }
    
    public static int pgcd(int nbA, int nbB){
         int reste=1;
         int temp;
         
         if(nbB>nbA){
             temp = nbB;
             nbB = nbA;
             nbA = temp;
         }
         
         while(reste!=0)
         {
             reste = nbA%nbB;
             nbA = nbB;
             if(reste!=0){
                 nbB = reste;
             }

             
         }
        
        //Si les valeurs saisies sont négatives ça ne fonctionne pas.
         
         return nbB;
    }
    
    public static boolean estValide(int nbA, int nbB){
        boolean result = true ;
        
        if( nbA<0 || nbB<0){
            result= false;
        }
        
        return result;
        
    }
    
    public static void main(String[]args){
        Scanner clavier =new Scanner(System.in);
        int choix;
        
        System.out.println("Tapez 1 pour calculer la factorielle.");
        System.out.println("Tapez 2 pour calculer la puissance.");
        System.out.println("Tapez 3 pour calculer le PGCD");
        choix = clavier.nextInt();
        
        if(choix==1){
            System.out.println("Entrez un nombre :");
            int nb = clavier.nextInt();
            System.out.println("La factorielle de "+nb+" est : "+factorielle(nb)+".");
        }
        
        if(choix==2){
            System.out.println("Entrez un nombre :");
            int nb = clavier.nextInt();
            System.out.println("Entrez la puissance :");
            int nb2 = clavier.nextInt();
            System.out.println("Le nombre "+ nb + " a la puissance "+ nb2 +" est egale a "+ puissance(nb, nb2));
        }
        
        if(choix==3){
            boolean valide = false;
            int nb = 0;
            int nb2 = 0;
            
            while(!valide){
                System.out.println("Pour calculer le PGCD entrez 2 nombres positifs.");
                System.out.println("Entrez le premier nombre :");
                nb = clavier.nextInt();            
                System.out.println("Entrez un second nombre :");
                nb2 = clavier.nextInt();
                valide = estValide(nb, nb2);
                
            }
            System.out.println("Le PGCD de "+nb+" et de "+nb2+" est "+ pgcd(nb,nb2));
        }
        
        
    }
    

}