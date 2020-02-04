class TestDate{
  public static void main(String []args){
    Date am =new Date(29,1,2000);
    Date am2 = new Date();

    System.out.print(am.getJour() + "/");
    System.out.print(am.getMois() + "/");
    System.out.println(am.getAnnee());

    am2.afficher();

    am.setJour(30);
    am.setMois(2);
    am.setAnnee(400);

    am.afficher();
    System.out.println(am.nbJours());


  }
}
