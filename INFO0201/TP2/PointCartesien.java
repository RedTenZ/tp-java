/**
  * Classe qui implemente IPoint
  * @author Delfly Guillaume
  * @version 31/01/2020
  */
public class PointCartesien implements IPoint{
  private double abscisse;
  private double ordonne;

  public PointCartesien(){
    this(0,0);
  }

  public PointCartesien(double abscisse, double ordonne){
    this.abscisse = abscisse;
    this.ordonne = ordonne;
  }

  public PointCartesien(PointCartesien p){
    this(p.abscisse,p.ordonne);
  }

  /**
    * Permet de recuperer l'abscisse de l'objet
    @return abcisse de l'objet
    */
  public double getAbscisse(){
    return abscisse;
  }

  /**
    * Permet de recuperer l'ordonné de l'objet
    @return ordonnee de l'objet
    */
  public double getOrdonne(){
    return ordonne;
  }

  /**
    * Permet de definir une nouvelle abscisse
    @param abcisse l'abscisse a definir
    */
  public void setAbscisse( double abscisse){
    this.abscisse = abscisse;
  }

  /**
    * Permet de definir un nouvel ordonnee
    @param ordonne l'ordonne a definir
    */
  public  void setOrdonne(double ordonne){
    this.ordonne = ordonne;
  }

  /**
    * Permet de recuperer un string de description de l'objet
    */
  public String toString(){
    return("point de coordonnees("+abscisse+";"+ordonne+")");
  }

  /**
    * Afficher l'objet courant
    */

  public void afficher(){
    System.out.println(toString());
  }

  /**
    * permet de recuperer la distance a l'origine de l'objet
    @return distance a l'origine de l'objet
    */
  public double distanceALOrigine(){
    double distance = Math.sqrt((abscisse*abscisse)+(ordonne*ordonne));
    return distance;
  }

  /**
    * Effectue une translation sur le point suivant le vecteur (dx,dy)
    * @param dx coordonn&eacute;e x du vecteur
    * @param dy coordonn&eacute;e y du vecteur
    */
  public void translation(double dx, double dy){
    abscisse += dx;
    ordonne += dy;
  }


}
