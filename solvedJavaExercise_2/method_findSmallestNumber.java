import java.util.*;
class Main{
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    //it is really easy to compare 3 integer variables, using if else statement however we are keeping ourselves to learn methods
    //I'll show 2 different things you could consider here.
    //First, stick lang sa 3 variables and do the task. The second way on the other hand gumamit ng array to get unlimited numbers to compared
    System.out.print("Chose \nCompare 3 variables \t[1]\nCompare N variable \t[2]\nDecision: ");
    int nDecision = abc.nextInt();

    if(nDecision==1){
    System.out.println("Finding smallest with only 3 variables");
    System.out.print("Num 1: ");
    int first = abc.nextInt();
    System.out.print("Num 2: ");
    int second = abc.nextInt();
    System.out.print("Num 3: ");
    int third = abc.nextInt();

    //void method no return type meaning to say, calling a method to do a job without expecting in RETURN
    findSmallest(first,second,third);
    
    }//close of firstcondition

    else{

    System.out.println("Using array so that number of variables be user defined");
    System.out.print("Numbers to be compared: ");
    int ArrayInt[] = new int [abc.nextInt()];
    for (int i = 0; i < ArrayInt.length; i++) {
        ArrayInt[i]= abc.nextInt();
    }
    int arraySmall = passArray_returnSmallest(ArrayInt);
    System.out.println("Smallest in array is: "+arraySmall);
    }//close of secondcondition

    abc.close(); //close scanner

}

    static void findSmallest(int numA, int numB, int numC){
        String smallestNum = "The smallest num is ";
        if(numA<numB){ //if first num is less than B got to 2 options
            if(numA<numC){//if first num is less than C this means the smallest is A
                System.out.println(smallestNum +numA);
            }else{
                System.out.println(smallestNum +numC); // given that first num is small than second,
                // but first is greater than third, this verified that c is the smallest
            }
        }else {
            if(numA>numC){ //let say 4 3 2 this must be the condition to say that third is the smallest
                System.out.println(smallestNum +numC);
            }else{ // let say 4 3 5, second is the lowest 
                System.out.println(smallestNum +numB);
            }
        }
    }

    public static int passArray_returnSmallest(int arrayInt[]){ // passing array into method which has return type int
        int swap;  
        for (int i = 0; i < arrayInt.length; i++)   
                {  
                    for (int j = i + 1; j < arrayInt.length; j++)   
                    {  
                        if (arrayInt[i] > arrayInt[j])   
                        {  
                            swap = arrayInt[i];  
                            arrayInt[i] = arrayInt[j];  
                            arrayInt[j] = swap;  
                        }  
                    }  
                }  
               return arrayInt[0];  

    }
}