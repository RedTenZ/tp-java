import java.util.Scanner;
class Multiples
{
    public static void main(String[ ] args)
   {
       int a;
       int b;
       int n;
       
       Scanner clavier = new Scanner(System.in);
       System.out.println("borne inf =");
       a = clavier.nextInt();
       System.out.println("borne sup =");
       b = clavier.nextInt();
       System.out.println("le nombre =");
       n = clavier.nextInt();
       
       for(int i=a;i<=b;i++){
           if(i>n)
           {
               if(i%n==0){
               System.out.print(i+", ");
           }
           }else{
                if(n%i==0){
                System.out.print(i+", ");
           }}
       }
       
       
    }
}