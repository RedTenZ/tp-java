import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer;

class Pendu {
    static Scanner clavier = new Scanner(System.in);
    
    public static String normalize(String s) 
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
    
    /*public static boolean estValide(String mot){
        boolean valide = true;
        if(mot.length()<4){
            valide = false;
        }
        
        for(int i=0; i<mot.length(); i++){
            char tmp = mot.charAt(i);
                if((int)tmp>90 || (int)tmp<65){
                    valide=false;
                }
        }
        
        
        return valide;
    }*/
    
    public static boolean estValide(String mot){
        boolean valide = true;
        if(mot.length()<4){
            valide = false;
        }
        
        for(int i=0; i<mot.length(); i++){
            char tmp = mot.charAt(i);
                if((int)tmp>90 || (int)tmp<65){
                    //Prise en charge des espaces et des tirets.
                    if((int)tmp!=32 && (int)tmp!=45)
                    {
                        valide = false;
                    }
                }
        }
        
        
        return valide;
    }
    


    public static char[] convertir(String chaine){
        char[] tab = new char[chaine.length()];
        for(int i=0; i<tab.length; i++){
            tab[i] = chaine.charAt(i);
        }
        return tab;
    }
    
    /*public static char[] initialiserSolution(){
        String mot;
        do{
            System.out.println("Saisir un mot de plus de quatre lettres en majuscule et sans accent");
            mot = clavier.nextLine();
        }while(!estValide(mot));
        char[] tab = convertir(mot);
        return tab;
    }*/
    
    public static char[] initialiserSolution(String nomFichier){
        String mot;
        do{
            mot = lecture(nomFichier);
            //Majuscule
            mot = mot.toUpperCase();
            //Accent
            mot = normalize(mot);
        }while(!estValide(mot));
        char[] tab = convertir(mot);
        return tab;
    }

    
    /*public static char[] creerMasque(int n){
        char[] tab = new char[n];
        for(int i=0; i<tab.length; i++){
            tab[i] = '-';
        }
        return tab;
    }*/
    
    public static char[] creerMasque(int n, char[] solution){
        char[] tab = new char[n];
        for(int i=0; i<tab.length; i++){
            tab[i] = '*';
            if((int)solution[i]==32){
                tab[i] = ' ';
            }
            if((int)solution[i]==45){
                tab[i] = '-';
            }
        }
        return tab;
    }
    
    public static void afficher(char[] tab){
        String mot = "";
        for(int i=0; i<tab.length; i++){
            mot += tab[i];
        }
        System.out.println(mot);
    }
    
    public static boolean jouer(char[] solution, char[] masque, char caract){
        boolean result = false;
        for(int i=0; i<solution.length; i++){
            if(caract == solution[i]){
                result = true;
                masque[i] = caract;
            }
        }
        return result;
    }
    
    public static void afficherEssais(int nbEssais, char[] masque){
        switch(nbEssais) {
        case 5: // La potence en entier et le pendu
            System.out.println(" /---\\\n |   |\n |   O\n |  /|\\\n |  / \\\n-^-");
            break;
        case 4: // La potence en entier
            System.out.println(" /---\\\n |   |\n |\n |\n |\n-^-");
            break;
        case 3: // La potence sans la corde
            System.out.println(" /---\\\n |\n |\n |\n |\n-^-");
            break;
        case 2: // Le corps de la potence
            System.out.println("\n |\n |\n |\n |\n-^-");
            break;
        case 1: // Le pied de la potence
            System.out.println("\n\n\n\n\n-^-");
            break;
        }
        System.out.println(masque);
    }
    
    public static boolean estFini(char[] masque){
        boolean result = true;
        for(int i=0; i<masque.length; i++){
            if(masque[i]=='*'){
                result = false;
            }
        }
        return result;
    }
    
    public static int nbLignes(String nomFichier) {
        int resultat = 0;
        String tmp;
        
        try {
            // Ouverture du fichier
            File f = new File(nomFichier);

            // Lecture de chaque ligne du fichier => compte les mots
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()) {
                tmp = scanner.nextLine();
                resultat++;
            }
            scanner.close();
        } catch(IOException e) {
            System.err.println("Erreur lors de la lecture du fichier.");
            System.err.println(e);
            System.exit(0);
        }
        
        return resultat;
    }
    
    public static String lecture(String nomFichier) {
        String result = "";
        int resultat = 0;
        int nombreAleatoire = 1 + (int)(Math.random() * ((nbLignes(nomFichier) - 0) + 1));
        try{
            File f = new File(nomFichier);
            Scanner scanner = new Scanner(f);
            while(resultat!=nombreAleatoire) {
                result = scanner.nextLine();
                resultat++;
            }
            scanner.close();
            
        } catch(IOException e) {
            System.err.println("Erreur lors de la lecture du fichier.");
            System.err.println(e);
            System.exit(0);
        }
        return result;
    }
    
    public static void afficherTab (char[] t){
        for(int i=0; i<t.length; i++){
             System.out.print(t[i] + "");
        }
    }
    
    public static void main(String[] args){
        //char[] solution = initialiserSolution();
        char[] solution = initialiserSolution("liste_francais.txt");
        char[] masque = creerMasque(solution.length, solution);
        int nbEssais = 0;
        while(!estFini(masque)&&nbEssais<5){
            afficherEssais(nbEssais, masque);
            char caract = clavier.next().charAt(0); 
            if(!jouer(solution, masque, caract)){
                nbEssais += 1;
            }
        }
        if(estFini(masque)){
            System.out.println("Bravo tu as gagne !");
        }else{
            afficherEssais(nbEssais, masque);
            System.out.println("Dommage tu as perdu ! ");
            System.out.print("La solution etait : ");
            afficherTab(solution);
        }
    }
}

// 2/ 3. Les mots avec accents sont refusé.