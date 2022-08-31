import java.util.Scanner;

public class code10solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input an integer: ");
        int n = scan.nextInt();
        String nsize = n+""; //12
        
        System.out.println("sum is" +c);
        String arraySum [] = new String [nsize.length()];
        for (int i = 0; i < nsize.length(); i++) {
             arraySum[i] = Character.toString(nsize.charAt(i)); 
        }

        int sum = 0;

        for (int i = 0; i < arraySum.length; i++) {
            sum += Integer.parseInt(arraySum[i]);
    
        }

        System.out.println("Sum is "+sum);
        }
    }

