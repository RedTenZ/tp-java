import java.util.Scanner;

class Image {
    
    public static void effacerImage(boolean tab[][]){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j]=false;
            }
        }
    }
    
    public static boolean [][] creerImage(int hauteur, int largeur){
        boolean t[][] = new boolean[hauteur][largeur];
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                t[i][j]=false;
            }
        }
        return t;
    }
    
    public static void afficherImage(boolean t[][]){
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                if(t[i][j]){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void setPixel(int i, int j, boolean t[][]){
        boolean verif= true;
        if(i>t.length-1){
            verif = false;
        }
        for(int k=0; k<t.length; k++){
            if(j>t[k].length){
                verif = false;
            }
        }
        if(verif){
            t[i][j]=true;
        }
    }
    
    public static void ligne(int i, boolean t[][]){
        if(i<=t.length-1){
            for(int j=0; j<t[i].length; j++){
                t[i][j] = true;
            }
        }
    }

    public static int premiereLigne(boolean t[][]){
        int i =0;
        int j =0;
        int imax = t.length-1;
        while(!t[i][j]&&i<=imax){
            if(j<t[i].length-1){
                j++;
            }else {
                j=0;
                i++;
            }
        }
        if(!t[i][j]){
            i=0;
        }
        System.out.print("pre l : " + i);
        return i;
    }
    
    public static int derniereLigne(boolean t[][]){
        int result = t.length-1;
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                if(t[i][j]){
                    result = i;
                }
            }
        }
        System.out.print("der l : " + result);
        return result;
        
    }
    
    
    public static int premiereColonne(boolean t[][]){
        int i =0;
        int j =0;
        int jmax = t[0].length-1;
        while(!t[i][j]&&j<jmax){
            if(i<t.length-1){
                i++;
            }else {
                i=0;
                j++;
            }
        }
        if(!t[i][j]){
            j=0;
        }
        System.out.print("pre col : " + j);
        return j;
        
    }
    
    public static int derniereColonne(boolean t[][]){
        int result = -1;
        
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                if(t[i][j]&&j>result){
                    result = j;
                }
            }
        }
        if(result == -1 ){
            result = t[0].length-1;
        }
        System.out.print("der col : " + result);
        return result;
    }
    
    public static int [][] cadre(boolean t[][]){
        int result[][] = new int[2][2];
        result[0][0] = premiereLigne(t);
        result[0][1] = premiereColonne(t);
        result[1][0] = derniereLigne(t);
        result[1][1] = derniereColonne(t);
        return result;
    }
    
    public static void inverser(boolean t[][], int result[][]){
        int ipre = result[0][0];
        int jpre = result[0][1];
        int ider = result[1][0];
        int jder = result[1][1];
        
        for(int j=jpre; j<=jder; j++){
            t[ipre][j] = !t[ipre][j];
            t[ider][j] = !t[ider][j];
        }
        
        for(int i=ipre; i<=ider; i++){
            t[i][jpre] = !t[i][jpre];
            t[i][jder] = !t[i][jder];
        }
    }
    
    
    public static void main(String[] args){
        boolean [][] image = creerImage(5,5);
        ligne(2, image);
        setPixel(3,2,image);
        setPixel(3,3,image);
        afficherImage(image);
        effacerImage(image);
        System.out.println("-----");
        afficherImage(image);
        System.out.println("-----");
        boolean[][] image2 = {
            { false, false, false, false, false, false, false, false, false, false, false, false },
            { false, false, false, false, true, true, true, true, false, false, false, false },
            { false, false, false, true, false, false, false, false, true, false, false, false },
            { false, false, true, false, true, false, false, true, false, true, false, false },
            { false, false, true, false, false, false, false, false, false, true, false, false },
            { false, false, true, false, true, false, false, true, false, true, false, false },
            { false, false, true, false, false, true, true, false, false, true, false, false },
            { false, false, false, true, false, false, false, false, true, false, false, false },
            { false, false, false, false, true, true, true, true, false, false, false, false },
            { false, false, false, false, false, false, false, false, false, false, false, false }
        };
        inverser(image2, cadre(image2));
        afficherImage(image2);
    }
}
