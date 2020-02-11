class Distributeur implements IDistributeur {
  private int capacite;
  private int nbDosettes;
  private int capaciteReservoir;
  private int reservoir;
  private double cagnotte;
  private static double prixCourt = 0.50;
  private static double prixLong = 1;

  public Distributeur(int reservoir){
    this.capacite = 10;
    this.nbDosettes = 10;
    this.reservoir = reservoir;
    this.capaciteReservoir = reservoir;
    this.cagnotte = 0;
  }

  public Distributeur(){
    this(200);
  }

  public  Distributeur(Distributeur d){
    capacite = d.capacite;
    nbDosettes = capacite;
    reservoir = d.reservoir;
    cagnotte = 0;
  }

  public int getCapacite(){
    return capacite;
  }

  public int getNbDosettes(){
    return nbDosettes;
  }

  public int getReservoir(){
    return reservoir;
  }

  public double getCagnottes(){
    return cagnotte;
  }

  public double getPrixCourt(){
    return prixCourt;
  }

  public double getPrixLong(){
    return prixLong;
  }

  public void setPrixCourt(double prix){
    if(prix>0){
      prixCourt = prix;
    }else{
      throw new IllegalArgumentException("Prix du café négatif ou nul !");
    }
  }

  public void setPrixLong(double prix){
    if(prix>0){
      prixLong = prix;
    }else{
      throw new IllegalArgumentException("Prix du café négatif ou nul !");
    }
  }

  public void augmenter(double pourcentage){
    prixCourt = prixCourt * (pourcentage/100);
    prixLong = prixLong * (pourcentage/100);
  }

  public void afficher(){
    System.out.println(toString());
  }


  public String toString(){
    return("capacite : "+capacite+", nbDosettes : "+nbDosettes+", reservoir : "+reservoir+", cagnotte : "+cagnotte);
  }

  public double boireCafeCourt(double montant){
    double monnaie = montant;
    if((reservoir >= 10) && (montant>=prixCourt)){
      reservoir -= 10;
      nbDosettes -= 1;
      monnaie = montant - prixCourt;
    }else{
      throw new IllegalArgumentException("Tu ne paies pas ton café !");
    }
    return monnaie;
  }

  public double boireCafeLong(double montant){
    double monnaie = montant;
    if((reservoir >= 25) && (montant>=prixLong)){
      reservoir -= 25;
      nbDosettes -= 1;
      monnaie = montant - prixLong;
    }else{
      throw new IllegalArgumentException("Tu ne paies pas ton café !");
    }
    return monnaie;
  }

  public void ajouterDosettes(int nbDosettes){
    if(nbDosettes>=0){
      if((this.nbDosettes + nbDosettes) <= capacite){
        this.nbDosettes += nbDosettes;
      }else{
        throw new IllegalArgumentException("Le nombre de dosettes est trop important");
      }
    }else{
      throw new IllegalArgumentException("Le nombre de dosettes ne peut pas être négatif");
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
}
