class Date{
  private int annee;
  private int mois;
  private int jour;

  public Date(){
    jour = 3;
    mois = 2;
    annee = 2001;
  }

  public Date( int jour, int mois, int annee){
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
  }

  public int getAnnee(){
    return annee;
  }
  public int getMois(){
    return mois;
  }
  public int getJour(){
    return jour;
  }
  public void setAnnee(int annee){
    this.annee = annee;
  }
  public void setMois(int mois){
    this.mois = mois;
    corrige();
  }
  public void setJour(int jour){
    this.jour = jour;
    corrige();
  }
  public String toString(){
    String str = "Date : "+jour+"/"+mois+"/"+annee;
    return str;
  }
  public void afficher(){
    System.out.println(toString());
  }

  public boolean estBissextile(){
    boolean bissextile = false;
    if(annee%4==0 && annee%100!=0) bissextile = true;
    if(annee%400==0) bissextile = true;
    return bissextile;
  }

  public int nbJours(){
    int nbJour = 0;
    if(mois==1||mois==3||mois==5||mois==7|| mois== 8 ||mois==10||mois==12) nbJour = 31;
    if(mois==4||mois==6||mois==9||mois==11) nbJour = 30;
    if(mois==2 && estBissextile() ){
      nbJour = 29;
    }else if (mois==2){
      nbJour = 28;
    }
    return nbJour;
  }

  public boolean estValide(){
    boolean valide = true;
    if(mois>12 || mois<0) valide = false;
    if(jour>nbJours() || jour<1) valide = false;
    return valide;
  }

  private void corrige(){
    if(mois>12 || mois<0) mois = 1;
    if(jour>nbJours() || jour<1) jour = 1;
    // On va corriger nous même les erreurs inutile de laisser la classe en public
  }



}
