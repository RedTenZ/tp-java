import java.util.Scanner;

class Maximum2 {
    
    public static double maxi(double valA, double valB){
        double result;
        if(valA > valB){
            result = valA;
        }else{
            result = valB;
        }
        return result; 
    }
	
	public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        
        int nbReel;
        double nbA, max;
        max = 0;
        
        System.out.println("Entrez le nombre de reel:");
        nbReel = clavier.nextInt();
        
        System.out.println("Un nombre :");
        max = clavier.nextInt();
        
        for(int i=0; i<nbReel-1; i++)
        {
            System.out.println("Un nombre :");
            nbA = clavier.nextInt();
            max = maxi(nbA, max);
        }
        
        System.out.println(max);
	}
    
}