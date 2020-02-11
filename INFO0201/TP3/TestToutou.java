class TestToutou{
  public static void main(String[] args){
    Toutou a = new Toutou("Milou", 4);
    a.getNom();
    a.getNbPuce();
    try{
      a.setNbPuce(-5);
    }catch(IllegalArgumentException e){
      System.out.println(e);
      a.setNbPuce(0);
    }
    try{
      Toutou b = new Toutou("Medor", -11);
    }catch(IllegalArgumentException e){
      System.out.println(e);
      Toutou b = new Toutou();
      System.out.println(b.toString());
      System.out.println(a.egalA(b));
    }
  }
}
