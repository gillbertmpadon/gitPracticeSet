import java.net.http.HttpRequest.BodyPublisher;
import java.util.*;
class Main{
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    //To find if 3 variables were consecutives or not
    //I'll show 2 different things you could consider here.
    //first get the average of 3 variables using method and as a showoff I supposed, getting average using array that has user define length.
    System.out.print("Chose \nCheck 3 variables \t[1]\nCheck N variable \t[2]\nDecision: ");
    int nDecision = abc.nextInt();

    if(nDecision==1){
    System.out.println("Check if 3 variables were consecutive of not");
    System.out.print("Num 1: ");
    int first = abc.nextInt();
    System.out.print("Num 2: ");
    int second = abc.nextInt();
    System.out.print("Num 3: ");
    int third = abc.nextInt();

    //void method no return type meaning to say, calling a method to do a job without expecting in RETURN
    checkConsecutive(first,second,third);
    
    }//close of firstcondition

    else{

    System.out.println("Using array so that number of variables be user defined");
    System.out.print("Numbers to be used: ");
    int ArrayInt[] = new int [abc.nextInt()];
    Boolean arrayBool = checkArray_checkconsecutive(ArrayInt);
    System.out.println("Check if array is consecutive: "+arrayBool);
    }//close of secondcondition

    abc.close(); //close scanner

}

    static void checkConsecutive(int numA, int numB, int numC){
        boolean consecutive;
        if(numA==numB-1&&numA==numC-2){ //since consecutive numbers was just an increment of a number
            //by subtracting one to the second number if they are equal meaning they are consecutive using AND && operator to check if the
            //frst number is equal to the third by subtracting 2.
            consecutive =true;
        }else{
            consecutive =false;
        }
        System.out.println("The numbers "+numA +", "+numB+", "+numC+" is "+consecutive+ " consecutive");
    }

    public static boolean checkArray_checkconsecutive(int arrayInt[]){ // passing array into method which has return type int
       //Creating new Scanner for this method
       Scanner scan = new Scanner(System.in);
       int firstIndex = 0, count =0;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scan.nextInt(); // storing inputs to array index of i, where i is the iteration of the for loop
            arrayInt[i] = arrayInt[i] -i; //subtract every index by the iteration of i, for example if inputs are 5, 6, 7, 8, the answer would just be 5, 5, 5, 5
            // given the arrays to be just 5, 5, 5, 5, this means that they are consecutives because we subtract the iteration of for loop which we know is consecutive
            firstIndex = arrayInt[0]; //getting the first index to compare if all the element of array is same for the first index
            //if the inputs are not consecutive for example, 5 ,10, 15, 20 even if we subtract the iteration of the for loop it will be detected when we check if the first
            // if the first index is not same for all the element if then and only if we say that elements were not consecutives 
        } 
        Boolean consecutive; //make a bool statement true or false
        for (int i = 0; i < arrayInt.length; i++) {
            if(firstIndex!=arrayInt[i]){ // condition is set not equal
                count++; // if there is occurrence of not equal then iterate count
            }
        }
        if(count==0){ // meaning all the array where equal
            consecutive = true;
        }else{
            consecutive =false; //if count is not 0 then all of the elements is not consecutive
        }
     

       return consecutive;
    }
}