/**
  * Classe qui implemente IPoint
  * @author Delfly Guillaume
  * @version 31/01/2020
  */
public class PointPolaire implements IPoint{
  private double distance;
  private double angle;

  public PointPolaire(){
    this(45,5);
  }

  public PointPolaire(double angle, double distance){
    this.angle = angle;
    this.distance = distance;
  }

  public PointPolaire(PointPolaire a){
    this(a.angle,a.distance);
  }

  /**
    * Permet de définir un nouvel angle
    @param angle l'angle a definir
    */
  public void setAngle(double angle){
    this.angle = angle;
  }

  /**
    * Permet de definir une nouvelle distance
    @param distance la distance a definir
    */

  public void setDistance(double distance){
    this.distance = distance;
  }

  /**
    * Permet de recuperer l'angle
    @return l'angle de l'objet
    */
  public double getAngle(){
    return angle;
  }

  /**
    * Permet de recuperer la distance
    @return distance de l'objet
    */
  public double getDistance(){
    return distance;
  }

  /**
    * Permet de recuperer un string de description de l'objet
    */
  public String toString(){
    return("La distance à l'origine du point est : " + distance + " et l'angle est de " + angle + " degrès.");
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
    return distance;
  }

  /**
    * Effectue une translation sur le point suivant le vecteur (dx,dy)
    * @param dx coordonn&eacute;e x du vecteur
    * @param dy coordonn&eacute;e y du vecteur
    */
  public void translation(double dx, double dy){
    double y = distance*Math.sin(angle*(Math.PI/180));
    double x = distance*Math.sin(angle*(Math.PI/180));
    y += dy;
    x += dx;
    double distance = Math.sqrt((x*x)+(y*y));
    if(x<0){
      angle = (Math.atan(y/x)+Math.PI)*(180/Math.PI);
    }else if((x==0) && (y==0)){
      angle = 0;
    }else if((x==0) && (y<0)){
      angle = ((3*Math.PI)/2)*(180/Math.PI);
    }else if((x==0) && (y>0)){
      angle = ((Math.PI)/2)*(180/Math.PI);
    }else if((x>0) && (y<0)){
      angle = (Math.atan(y/x)+2*Math.PI)*(180/Math.PI);
    }else if((x>0) && (y==0)){
      angle = 0;
    }else if((x>0) && (y>0)){
      angle = (Math.atan(y/x))*(180/Math.PI);
    }
  }

}
