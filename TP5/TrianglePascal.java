import java.util.Scanner;
class TrianglePascal {
    
	public static int ligneMax(int a){
		int i=-1;
		int coef = 0;
		while(coef<=a){
			i++;
			coef = coefMaximum(i);
		}
		
		return i+1;
    }
	
	public static int sommeCoefficients(int a){
		int res = 0;
		for(int i=0; i<a; i++){
			res += puissance2(i);
		}
		return res;
    }
	
	public static int puissance2(int n){
		int res = 1;
		for(int i=0; i<n; i++){
			res = res*2;
		}
		
		return res;
    }
	
    public static int factorielle(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f*=i;
        }
        return f;
    }

    private static int binomial(int n, int p)
    {
        int numera = factorielle(n);
        int denomi = factorielle(p)*factorielle(n-p);
        return (numera/denomi);
    }

    public static void afficherLigne(int n, int nbDigits){
        int ligne[] = new int[n+1];
        for(int i=0; i<=n; i++){
            ligne[i] = binomial(n,i);
            afficherValeur(ligne[i], nbDigits);
        }
        System.out.println();
    }
    
    public static void afficherTriangle(int n){
        int digits = nbDigits(coefMaximum(n-1));
        for(int i=0; i<n; i++){
            afficherEspaces((n-i-1)*digits);
            afficherLigne(i, 2*digits);
        }
        
    }
    
    public static int nbDigits(int nb){
        int digits = 0;
        while(nb>=1){
            nb = nb/10;
            digits++;
        }
        return digits;
    }
    
    public static int coefMaximum(int n){
        int max = 0;
        for(int i=0; i<=n; i++){
            if(binomial(n,i)>max){
                max = binomial(n,i);
            }
        }
        return max;
    }
    public static void afficherEspaces(int n){
        for(int i=0; i<n; i++){
            System.out.print(" ");
        }
    }
    
    public static void afficherValeur(int nb, int digits){
        int nbEspace = digits - nbDigits(nb);
        afficherEspaces(nbEspace);
        System.out.print(nb);
    }
	
	public static void nbLapins(int mois){
		int a=0,b=1,c=0,i;
		if(mois==1){
			c=1;
		}
		for(i=2;i<=mois;++i){
			c=a+b; 
			a=b;
			b=c;
		}
		System.out.print(c);
    }
	
	public static void fibonacci(int n){
		int a=0,b=1,c=0,i;
		System.out.print(a+" "+b);
		for(i=2;i<n;++i){
			c=a+b; 
			System.out.print(" "+c); 
			a=b;
			b=c;
		}
    }
	
    
    public static void main (String[] args){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien de ligne souhaitez vous ?");
        int n = clavier.nextInt();
		fibonacci(n);
    }
}
