class Personne{
  private String nom;
  private String prenom;
  private String civilite;
  private int age;
  private double taille;
  private double poids;
  private double IM;

  public Personne(){
    nom = "Delfly";
    prenom = "Guillaume";
    civilite = "M";
    age = 18;
    taille =2.66;
    poids=70;
    }

  public Personne(String nom, String prenom, String civilite, int age, double taille, double poids){
    this.nom = nom;
    this.prenom = prenom;
    this.civilite = civilite;
    this.age = age;
    this.taille = taille;
    this.poids = poids;
    }

    public String getNom(){
      return nom;
    }

    public String getPrenom(){
      return prenom;
    }

    public String getCivilite(){
      return civilite;
    }

    public int getAge(){
      return age;
    }

    public double getTaille(){
      return taille;
    }

    public double getPoids(){
      return poids;
    }

    public void setNom(String nom){
      // Permet de changer le nom par exemple si une personne se marie
      this.nom = nom;
    }

    public void setAge(int age){
      if(age>=0) this.age = age;
    }

    public void setTaille(double taille){
      if(taille>=0) this.taille = taille;
    }

    public void setPoids(int poids){
      if(poids>=0) this.poids = poids;
    }

    public String toString(){
      int cm = (int)((taille-(int)taille)*100);
      String str = civilite + " " +prenom+" "+nom+" : "+age+" ans, "+(int)taille+"m"+ cm + ", " + poids + "kg";
      return str;
    }

    public void afficher(){
      System.out.println(toString());
    }

    public void IMC(){
      int tailleCm = (int)(taille*100);
      tailleCm = tailleCm*tailleCm;
      if(tailleCm>0){
        double IM = poids/tailleCm;
      }
    }

    public void interIMC(){
      IMC();
      if(IM<=16.5) System.out.println("denutrition");
      if(IM>16.5 && IM<=18.5) System.out.println("maigreur");
      if(IM>18.5 && IM<=25) System.out.println("normal");
      if(IM>25 && IM<=30) System.out.println("surpoids");
      if(IM>30 && IM<=35) System.out.println("obesite moderee");
      if(IM>35 && IM<=40) System.out.println("obesite severe");
      if(IM>40) System.out.println("obesite morbide");
    }

}
