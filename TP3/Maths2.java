import java.util.Scanner;

class Maths2  {
	
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez n");
		int n = clavier.nextInt();
        
		double max = -5;
		double min = 15;
		
		for(int i=0; i<n; i++){
            // double r = Math.random() * 10;
			double r = -5 + Math.random() * 10;
            
			System.out.println(r);
            
			if (max<r){
				max = r;
			}
			if (min>r){
				min = r;
			}
			
		}
		System.out.println("Le minimum est : "+ min + ", Le maximum est : "+ max);
	}
}

