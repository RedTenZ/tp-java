import java.util.Scanner;

class Correction0  {
	
	public static void main(String[] args){
        byte entier1 = 1;
        int entier2 = 255;
        long entier3 = 2;
        byte byte2 = (byte)(entier2/127);
        //entier1 = (byte)(entier2 + entier1);
        entier1 = (byte)entier2 + entier1
        entier3 = entier2 + entier1;
        System.out.println(entier1 + " " + entier2 + " " + entier3);
       
	}
}

// Le code semble incorrecte, il semble contenir des conversions implicites qui ne sont pas "autoriser"

// On obtient une erreur de compilation 