import java.util.*;
class TestDistributeur{
  static Scanner clavier = new Scanner(System.in);
  public static void main(String[] args){
    Senseo sen1 = new Senseo();
    sen1.afficher();
    sen1.boireCafeLong(5);
    sen1.ajouterDosettes(1);
    sen1.remplirReservoir(20);
    sen1.afficher();

    double monnaie;
    Distributeur d1 = new Distributeur();

    System.out.println("(1) Afficher le distributeur");
    System.out.println("(2) Boire un café court");
    System.out.println("(3) Boire un café long");
    System.out.println("(4) Ajouter des dosettes");
    System.out.println("(5) Remplir le réservoir");
    System.out.println("(6) Modifier ou augmenter les prix");

    int choix = clavier.nextInt();
    int choix2 = 0;
    switch(choix){
      case(1):
        d1.afficher();
        break;
      case(2):
      try{
        System.out.println("Inserer la monnaie : ");
        monnaie = clavier.nextDouble();
        System.out.println("La monnaie rendu est : " + d1.boireCafeCourt(monnaie));
      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
      }
        break;
      case(3):
        try{
          System.out.println("Inserer la monnaie : ");
          monnaie = clavier.nextDouble();
          System.out.println("La monnaie rendu est : " + d1.boireCafeLong(monnaie));
        }catch(IllegalArgumentException e){
          System.out.println(e.getMessage());
        }

        break;
      case(4):
        try{
          System.out.println("Inserer le nombre de dosettes : ");
          int dosettes = clavier.nextInt();
          d1.ajouterDosettes(dosettes);
        }catch(IllegalArgumentException e){
          System.out.println(e.getMessage());
        }
        break;
      case(5):
        try{
          System.out.println("Inserer le nombre de cl (un entier): ");
          int reservoir = clavier.nextInt();
          d1.ajouterDosettes(reservoir);
        }catch(IllegalArgumentException e){
          System.out.println(e.getMessage());
        }

        break;
      case(6):
        System.out.println("(1) Recuperez le prix des cafés");
        System.out.println("(2) Modifier le prix des cafés");
        System.out.println("(3) Augmenter les prix des cafés");
        choix2 = clavier.nextInt();
        break;
      default:
    }

      switch(choix2){
        case(1):
          System.out.println(d1.getPrixCourt());
          System.out.println(d1.getPrixLong());
          break;
        case(2):
          System.out.println("nouveau prix cafe long : ");
          double newPrixLong = clavier.nextDouble();

          System.out.println("nouveau prix cafe court : ");
          double newPrixCourt = clavier.nextDouble();

          try{
            d1.setPrixCourt(newPrixCourt);
          }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
          }

          try{
            d1.setPrixLong(newPrixLong);
          }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
          }

          break;
        case(3):
          System.out.println("Un pourcentage d'augmentation ! (en entier): ");
          double augmentation = clavier.nextInt();
          d1.augmenter(augmentation);
          break;
      }

  }
}
