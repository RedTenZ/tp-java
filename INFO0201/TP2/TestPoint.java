import java.util.*;
class TestPoint{
  public static void main (String[]args){
    PointCartesien a = new PointCartesien(8,5);
    PointCartesien b = new PointCartesien();

    a.afficher();
    a.distanceALOrigine();
    a.translation(5,5);
    System.out.println(a.getOrdonne());
    System.out.println(a.getAbscisse());

    PointCartesien c = new PointCartesien(a);
    c.setOrdonne(2);
    c.afficher();
    c.setAbscisse(5);
    System.out.println(c.getAbscisse());

    System.out.println("Point polaire : ");

    PointPolaire d = new PointPolaire(50,5);
    PointPolaire e = new PointPolaire();
    PointPolaire f = new PointPolaire(d);

    d.afficher();
    d.setAngle(20);
    d.setDistance(10);
    d.afficher();
    System.out.println(e.getAngle());
    System.out.println(e.getDistance());
    f.afficher();
    System.out.println(f.distanceALOrigine());

    IPoint[] tableau = new IPoint[5];
    double abs = 0;
    double ord = 0;
    double angle = 0;
    double dist = 0;

    for(int i=0; i<5; i++){

      System.out.println("Taper 1 pour un point cartesien ou 2 pour un point polaire");
      Scanner clavier = new Scanner(System.in);
      int typePoint = clavier.nextInt();

      if(typePoint==1){
        System.out.print("Entrer l'abscisse:");
        abs = clavier.nextDouble();
        System.out.print("Entrer l'ordonne:");
        ord = clavier.nextDouble();
        tableau[i] = new PointCartesien(abs, ord);

      }else if(typePoint==2){
        System.out.print("Entrer la distance:");
        dist = clavier.nextDouble();
        System.out.print("Entrer l'angle:");
        angle = clavier.nextDouble();
        System.out.print("Entrer le nom du point : ");
        tableau[i] = new PointPolaire(angle, dist);

      }
    }


      for(int i=0; i<tableau.length; i++){
        tableau[i].afficher();
        tableau[i].distanceALOrigine();
      }


  }
}
