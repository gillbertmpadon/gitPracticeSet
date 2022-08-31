import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        // this will be your fundamentals po in java so pay attention
        // sa coding meron tayong 3 parts, first is declaration ,2nd iniatiation ,last is condition

        int area, length, width; // this is declaration ng mga variables na ating gagamitin sa program
        length = user.nextInt(); // 2nd part na po to, initialize natin kung anong value ng variable at pinili natin ay user input sya
        width = user.nextInt(); // same lang po dito, taken by scanner input ang value nya, this is iniatiation
        area = length*width; // ang value ni area variable ay naka set sa product ng length and width
    
        //last part dapat ang condition but here need lang natin e display ang area ng rectangle, but in anycase na gusto mo mag condition for the last part
        // gagamit ka ng if else, for loop, while, do while, bolean or whatsover ito yung last part ng coding pinaka output na yung printing or results.

        /*
         * if(area>1){
         *  //ano yung gusto mong gawin kung yung area mo is not zero or negative ganun lang po kadali ang last part
         * }
         */
        System.out.println("The area is "+area);// printing lang po ng output
    
        //as a third year students , ang basic fundamentals ko ay ang area of circle,
        //advice lang, DO NOT JUST STUDY PROGRAMMING, have advance study kasi ang school para sakin ay tutorial lang ang real problem natin ay WHAT TO DO AFTER WE GRADUATE
    }

}