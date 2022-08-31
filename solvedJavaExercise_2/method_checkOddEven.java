import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this one here is really exciting and challenging for me, hence we need to identify if all digits in number is either odd or even
        //there is a lot of way to execute this code the following were methods
        /*
         * using charAt to extract each digit - you need to convert to string, get char then return it to int for checking
         * using array to extract digits - you need for loop to extract each digit either using modulo or divide operator
         * using modolo % to get remainder or last digits -using modolo and for loop
         * using divide to extract first digits - using divide and for loop
         */
        // we need to do the function in method so that repeating the function wont be a problem because that is what method built for

        System.out.print("Input numbers: ");
        int inputInt = scan.nextInt();
        checkOddEven(inputInt);
        
    }

    static void checkOddEven(int numbers){
        String numberstoString = numbers+""; //converting int to string by adding empty strings on it (double quotes with no String value);
        int countEven=0, countOdd=0;
        for (int i = 0; i < numberstoString.length(); i++) {
            int a = Integer.parseInt(Character.toString(numberstoString.charAt(i))); 
            // integer a = Integer.parseInt means you convert string to integer, Character.toString says we convert charater to string and last
            // charAt means we get a single character from the string numberstoString with index of the iteration of i
            if(a%2==0){ //even numbers
                countEven++;
            }else{
                countOdd++;
            }
        }
        boolean results;
        if(countOdd==0){
            results = true;
            System.out.println("Check if all digits in a number is even :"+results);
        }else{
            results = false;
            System.out.println("Check if all digits in a number is even :"+results);
            System.out.println("Even numbers: "+countEven+"\tOdd numbers: "+countOdd);
        }

    }
}