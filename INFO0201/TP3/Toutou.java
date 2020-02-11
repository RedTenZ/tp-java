class Toutou{
  private String nom;
  private int nbPuce;

  public Toutou(String nom, int nbPuce){

    if((nom.length()>0) || (nom != null)){
      this.nom = nom;
    }else{
      throw new IllegalArgumentException("Le nom ne doit pas être nul");
    }

    if(nbPuce >= 0){
      this.nbPuce = nbPuce;
    }else{
      throw new IllegalArgumentException("Le nombre de puce doit être positif");
    }

  }

  public Toutou(){
    this("petit", 5);
  }

  public String getNom(){
    return nom;
  }

  public int getNbPuce(){
    return nbPuce;
  }

  public void setNbPuce(int nbPuce){
    if(nbPuce >= 0){
      this.nbPuce = nbPuce ;
    }else{
      throw new IllegalArgumentException("Le nombre de puce doit être positif");
    }

  }

  public String toString(){
    return("Le toutou "+nom+" a "+nbPuce+" puces.");
  }

  public boolean egalA(Toutou c){
    boolean egal = false;
    if(c.nom.equals(nom) && c.nbPuce == nbPuce){
      egal = true;
    }
    return egal;
  }
}
