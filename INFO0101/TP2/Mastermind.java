import java.util.Scanner;

class Mastermind {
	public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        int n;
        int i1 = (int)(Math.random()*10);
        int i2 = (int)(Math.random()*10);
        int i3 = (int)(Math.random()*10);
        int i4 = (int)(Math.random()*10);
        
        while(true)
        {
            n=0;
            System.out.println("Saisir le premier chiffre");
            int nb1 = clavier.nextInt();            
            System.out.println("Saisir le second chiffre");
            int nb2 = clavier.nextInt();            
            System.out.println("Saisir le troisieme chiffre");
            int nb3 = clavier.nextInt();            
            System.out.println("Saisir le quatrieme chiffre");
            int nb4 = clavier.nextInt();
            
            if(nb1==i1)
            {
                n+=1;
            }
            
            if(nb2==i2)
            {
                n+=1;
            }
            
            if(nb3==i3)
            {
                n+=1;
            }
            
            if(nb4==i4)
            {
                n+=1;
            }
            
            if(n==4)
            {
                System.out.println("Bravo tu as gagne !");
                break;
            }else{
                System.out.println("Le nombre chiffre bon est : " + n);
            }
        }
	}
}	