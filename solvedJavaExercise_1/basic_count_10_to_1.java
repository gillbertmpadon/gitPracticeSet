
class Main{
    public static void main(String[] args) {
        //basic lang po ito gagamitl ang tayo for loop
        //I'll show different type of execution here

        System.out.println("Printing reverse of 10 using a variable and normal iteration of for loop");
        int number =10; //varible int with value of 10
        for (int i = 0; i < number; i++) {//basic iteration but we can surely use this para mag print ng reverse
            //gagamit tayo ng variables here.
            System.out.print(number-i+" "); //10 minus the iteration of i, this will print reverse
        }

        System.out.println();
        System.out.println("Printing reverse of 10 using for loop only itself");
        for (int i = 10; i >0; i--) { //the starting value is 10, the condition is 10>0 kapag ang i daw is greater than 0, run loop and decrement by 1 every loop.
            System.out.print(i+" ");
            
        }
    }
}