import java.util.Scanner;

class Ville {
    static Scanner clavier = new Scanner(System.in);
    
    public static String[] saisirVilles(){
        System.out.println("Entrez le nombre de ville :");
        int nbVille = clavier.nextInt();
        String[] t = new String[nbVille];
        clavier.nextLine();
        for(int i = 0; i<t.length; i++){
            System.out.println("Entrez le nom de la ville : ");
            t[i] = clavier.nextLine();
        }
        return t;
    }
    
    public static void afficherVille(String t[]){
        for(int i=0; i<t.length; i++){
            System.out.println(i + " : " + t[i]);
        }
    }
    
    public static void main(String[] args){
        String t[] = saisirVilles();
        afficherVille(t);
    }

}
