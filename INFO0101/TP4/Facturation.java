import java.util.Scanner;

class Facturation {
	
    static Scanner clavier = new Scanner(System.in);
    
    public static int saisirNbSiropErable(String choix){
        
        System.out.println("Saisir le nombre de sirop d'érable "+choix+" : ");
        int nbCruchons = clavier.nextInt();
        while(nbCruchons%3!=0 || nbCruchons<0){
            System.out.println("Le nombre de cruchon doit etre un multiple positif de trois:");
            nbCruchons = clavier.nextInt();
		}
        return nbCruchons;
    }
	
    
    public static int saisirNbSiropBleuets(){
        System.out.println("Saisir le nombre de bouteille :");
        int nbBouteille = clavier.nextInt();
        
        while(nbBouteille<0){
             System.out.println("Le nombre de bouteille doit etre positif : ");
            nbBouteille = clavier.nextInt();
        }
        
        return nbBouteille;
    }
    
    public static double calculerFraisTransport(int nbCruchon, int nbBouteille){
        double prixTransport=0;
        if(nbCruchon>=3 && nbCruchon<=11){
            prixTransport= nbCruchon*1.5;
        }
        if(nbCruchon>=12 && nbCruchon<=24){
            prixTransport= nbCruchon*1;
        }
        
        prixTransport +=  nbBouteille*0.5;
        return prixTransport;
    }
    
    public static double calculerPrixTotal(String choix, int nbCruchon, int nbBouteille, double prixTransport){
        double prixTotal = 0;
        double prixCruchon = 0;
        
        if(choix == "extra"){
            prixCruchon = 28;
        }        
        if(choix=="medium"){
            prixCruchon = 21.4;
        }        
        if(choix=="clair"){
            prixCruchon = 23.5;
        }
        
        prixTotal = prixTransport + nbCruchon*prixCruchon + nbBouteille*12;
        return prixTotal;
    }
        
    public static void afficherFacture(int nbCruchon, int nbBouteille, double prixTransport, double prixTotal)
    {
        System.out.println("------------------------------------------");
        System.out.print("Le nombre de cruchons commande est de : ");
        System.out.println(nbCruchon);
        System.out.print("Le nombre de bouteilles commande est de : ");
        System.out.println(nbBouteille);
        System.out.print("Le prix de transport est de : ");
        System.out.println(prixTransport);
        System.out.print("Le prix total est de : ");
        System.out.println(prixTotal);
        System.out.println("------------------------------------------");
        
    }
    
    
    public static void main(String[]args){
        int nbCruchon, nbBouteille;
        double prixTransport, prixTotal;
        
        System.out.println("Choix du sirop d'érable : ");
        System.out.println("Tapez extra pour le sirop extra-clair.");
        System.out.println("Tapez medium pour le sirop medium.");
        System.out.println("Tapez clair pour le sirop clair.");
        String choix = clavier.nextLine();
        
        nbCruchon = saisirNbSiropErable(choix);
        
        nbBouteille = saisirNbSiropBleuets();
        prixTransport = calculerFraisTransport(nbCruchon, nbBouteille);
        prixTotal = calculerPrixTotal(choix, nbCruchon, nbBouteille, prixTransport);
        afficherFacture(nbCruchon, nbBouteille, prixTransport, prixTotal);
    }
}
    