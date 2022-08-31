import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //check if string contains vovels a e i o u
        // this is is pretty easy form the past activities we have used integer in comparison and also for method
        // but now we are using char variable where as we know that contains a single character or letter
        // we must do this in method 

        System.out.print("Input a String: ");
        String input = abc.nextLine();
        //we can pass this string in methods where method has no return type meaning void
        checkVowels(input);
    }

    public static void checkVowels(String userInput){
        userInput = userInput.toLowerCase(); //making the strings lowercase
        int countnotVowels =0, countVowels=0; //count if there is occurence in conditions
        for (int i = 0; i < userInput.length(); i++) {
             char a = userInput.charAt(i); // storing the value of each char in string, so that it would be easy in if else condition
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){ // if the value of a is  equal to any vowels then the condition is met
                    countVowels++; // here the condition is triggered, the elements of the string is surely vowels
            }else{
                    countnotVowels++; //count those elements that is not vowels
            }
        }

        if(countnotVowels==0){
            System.out.println("The strings contains only vowels");
            System.out.println("Status: Passed");
        }else{
            System.out.println("Vowels "+countVowels+ "\tNot Vowels "+countnotVowels);
            System.out.println("Status: Not Passed");
        }

    }

}