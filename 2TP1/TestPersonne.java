import java.util.Scanner;
class TestPersonne{
  static Scanner clavier = new Scanner(System.in);
  public static void main(String [] args){
    Personne premier = new Personne();
    Personne second = saisirPersonne();
    premier.afficher();


    System.out.println(second.getNom());
    System.out.println(second.getPrenom());
    System.out.println(second.getCivilite());
    System.out.println(second.getAge());
    System.out.println(second.getTaille());
    System.out.println(second.getPoids());

    second.setTaille(1.8);
    second.setAge(8);
    second.setPoids(90);
    second.setNom("Boule");

    second.afficher();

    second.interIMC();

  }

  public static Personne saisirPersonne(){
    System.out.print("Saisir son nom : ");
    String nom = clavier.nextLine();
    System.out.print("Saisir son prenom : ");
    String prenom = clavier.nextLine();
    System.out.print("Saisir son civilite : ");
    String civilite = clavier.nextLine();
    System.out.print("Saisir son age : ");
    int age = clavier.nextInt();
    System.out.print("Saisir son taille en m : ");
    double taille = clavier.nextDouble();
    System.out.print("Saisir son poids en kg : ");
    double poids = clavier.nextDouble();
    Personne lapersonne = new Personne(nom, prenom, civilite, age, taille, poids);
    return lapersonne;
  }

}
