import java.util.Scanner;

class Maximum {
	
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
        
        double nbA, nbB;
        
        System.out.println("Nombre A :");
        nbA = clavier.nextDouble();        
        System.out.println("Nombre B :");
        nbB = clavier.nextDouble();
        
        System.out.println(maxi(nbA, nbB));
	}
    
}