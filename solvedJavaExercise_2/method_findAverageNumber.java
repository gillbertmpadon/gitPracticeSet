import java.util.*;
class Main{
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    //To find average of 3 integer variables, just get the sum and divided it by the number of element
    //I'll show 2 different things you could consider here.
    //first get the average of 3 variables using method and as a showoff I supposed, getting average using array that has user define length.
    System.out.print("Chose \nAverage of 3 variables \t[1]\nAverage N variable \t[2]\nDecision: ");
    int nDecision = abc.nextInt();

    if(nDecision==1){
    System.out.println("Finding average with only 3 variables");
    System.out.print("Num 1: ");
    int first = abc.nextInt();
    System.out.print("Num 2: ");
    int second = abc.nextInt();
    System.out.print("Num 3: ");
    int third = abc.nextInt();

    //void method no return type meaning to say, calling a method to do a job without expecting in RETURN
    findAverage(first,second,third);
    
    }//close of firstcondition

    else{

    System.out.println("Using array so that number of variables be user defined");
    System.out.print("Numbers to be used: ");
    int ArrayInt[] = new int [abc.nextInt()];
    for (int i = 0; i < ArrayInt.length; i++) {
        ArrayInt[i]= abc.nextInt();
    }
    int arrayAvg = passArray_returnAverage(ArrayInt);
    System.out.println("Average of array is: "+arrayAvg);
    }//close of secondcondition

    abc.close(); //close scanner

}

    static void findAverage(int numA, int numB, int numC){
        int average = (numA+numB+numC)/3;
        System.out.println("The average is "+average);
        
    }

    public static int passArray_returnAverage(int arrayInt[]){ // passing array into method which has return type int
       //Creating new Scanner for this method
       Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scan.nextInt(); // storing inputs to array index of i, where i is the iteration of the for loop
            sum+= arrayInt[i]; // storing the values of array into single int variable
       } 
       int average = sum/arrayInt.length; //getting the sum of all inputs and divide by the lenght of array as element
       return average;
    }
}