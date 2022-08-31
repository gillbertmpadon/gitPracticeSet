import java.util.Scanner;

public class code21solution {
    public static void main(String[] args) {
        
      
        int arrayOrig [] = {0,3,4,0,1,2,5,0};
        int count =0, countzero=0;
        for (int i = 0; i < arrayOrig.length; i++) {
            if(arrayOrig[i]==0){
                countzero++;
            }else{
                count++;
            }
        }
        int nozero[] = new int[count]; 
        int zero[] = new int[countzero];
        countzero=0;
        count=0;
        for (int i = 0; i < arrayOrig.length; i++) {
            if(arrayOrig[i]==0){
                zero[countzero]=arrayOrig[i];
                countzero++;
            }else{
                nozero[count]=arrayOrig[i];
                count++;
            }
        }

        int newarray[] = new int [arrayOrig.length]; //8


        for (int i = 0; i < nozero.length; i++) { //5
            newarray[i] = nozero[i];
        }

        //5  - 5+3
        for (int i = 0; i <zero.length; i++) { //3
            newarray[i+nozero.length] = zero[i];
        }

        for (int i : newarray) {
            System.out.print(i+" ");
        }
        

     
    }
}
