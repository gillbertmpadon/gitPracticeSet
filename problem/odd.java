import java.util.*;

public class odd {
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    System.out.print("Enter Weight: ");
    int weight = abc.nextInt();
    System.out.print("Enter Height: ");
    double height = abc.nextDouble();
    double total = weight/ (Math.pow(height, 2)); // 10 / 5*5
    System.out.println("\nBmi is "+total); // introductory

        

    }
   

}
