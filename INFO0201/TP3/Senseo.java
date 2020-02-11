class Senseo implements IDistributeur{
  private int capacite;
  private int nbDosettes;
  private int capaciteReservoir;
  private int reservoir;

  public Senseo(){
    this.capacite = 1;
    this.nbDosettes = 1;
    this.reservoir = 100;
    this.capaciteReservoir = 100;
  }

  public double boireCafeCourt(double montant){
    if(nbDosettes>0){
      reservoir -= 10;
      nbDosettes -= 1;
    }
    return montant;
  }

  public double boireCafeLong(double montant){
    if(nbDosettes>0){
      reservoir -= 25;
      nbDosettes -= 1;
    }
    return montant;
  }

  public void ajouterDosettes(int nbDosettes){
    if(nbDosettes>0){
      if((this.nbDosettes + nbDosettes) == 1){
        this.nbDosettes += nbDosettes;
      }else{
        throw new IllegalArgumentException("La capacité maximum est de 1 dosettes");
      }
    }else{
      throw new IllegalArgumentException("Impossible d'ajouter un nombre de dosettes negatif ou nul");
    }
  }

  public void remplirReservoir(double quantite){
    if(quantite>=0){
      if((reservoir+quantite)<= capaciteReservoir){
        this.reservoir += quantite;
      }else{
        throw new IllegalArgumentException("Le reservoir va déborder !");
      }
    }else{
      throw new IllegalArgumentException("La quantité ne peut pas être négatif !");
    }
  }

  public void afficher(){
    System.out.println(toString());
  }


  public String toString(){
    return("capacite : "+capacite+", nbDosettes : "+nbDosettes+", reservoir : "+reservoir);
  }

}
