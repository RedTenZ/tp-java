import java.util.Scanner;

class Correction  {
	
	public static void main(String[] args){
        float reel1 = 1.5f;
        double reel2 = 2.8;
        System.out.println(reel1 + " " + reel2);
	}
}

// Le code semble incorrecte, il renverra :
// "A" puis "c" puis la code ASCII de "A"
// Le code ASCII de A est renvoyé car la dernière variable est de type int

