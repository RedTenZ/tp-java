import java.util.Scanner;

class BoucleFactorielle
{
    public static void main(String[ ] args)
   {
       Scanner clavier = new Scanner(System.in);
       System.out.print("Saisir un nombre : ");
       int a= clavier.nextInt();
       int resultat=1;
       for(int i=1;i<=a;i++){
           resultat= resultat*i;
       }
       System.out.println("factorielle "+a+" = "+resultat);
    }
}