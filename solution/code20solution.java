import java.util.Scanner;

public class code20solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input a positive integer: ");
        int numInt = scan.nextInt();
        String origInt = numInt+"";
        String newInt = "";
        for (int i = 0; i < origInt.length(); i++) {
            newInt += origInt.charAt((origInt.length()-1)-i);
        }
        if(newInt==origInt){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
