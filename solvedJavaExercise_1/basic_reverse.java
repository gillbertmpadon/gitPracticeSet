class reverse{
    public static void main(String[] args) {
    // this is how you reverse a string, there are a lot of execution but
    //  the best way is to either store it in array so that you can call the string anytime
    //or simply print it backward - padon

    String nickName = "My feelings were real";

    System.out.println("Printing using charAt and for loop");
    int length =nickName.length();
    for (int i = 0; i <length ; i++) {  
        //iteration from first index of string until to last index , bakit less than kasi ang index ng string start sa zero at ang zero ay count as variable
        // halimbawa 5 ang lenght ng string meron kang index of 0 1 2 3 4, kung bibilangin mo kasama si 0, ikaw ay may merong lenght of 5.
        // ang iteration start from 0 and less than sa length ng 5. Ang illustration neto ay 0<5 which is tama naman, hanggang 0 to 4 lang ang loop.
        //charAt gagamitin natin dito, this is to print individually yung char value ng string
        // what we do here ay bawat index ng string start from 0 ay nilalapag natin as char "character" and direct print nalang.

        char a = nickName.charAt((length-1)-i); // yung loob ng charAt signifies intger kung saan naka locate yung index na gusto mo kunin.
        // length minus 1 para kung halimbawa ang length ng array ay 10, kukunin mo yung 9 at e susubtract mo sa iteration
        // let say 9 ang lenght - 0 which is yung value ng i, ang mapiprint mo ay last index ng array.

        
        System.out.print(a); //print value of a lang, dito nag store lang ako sa char variable pero pedi na yung direct printing
        //System.out.println(nickName.charAt(a));
        
       
    }

    System.out.println(); //normal line print hahah
    System.out.println("\n"); //mas double print ng newline since may forward slash and letter n
    System.out.print("\n"); // mas useful ito pero same concept sa una

    String mhalNickname = nickName; //used lang me ibang variable name pero same value hahaha 
    char stringTocharArray [] = mhalNickname.toCharArray(); // this is to convert string to character array for ex. String of "Intimate" becomes 'i','n','t','i', etc hahaha
    //same concept nalang ng printing sa for loop , okay?

    

    System.out.println("Printing with array");
    for (int i = stringTocharArray.length-1; i >=0 ; i--) { //dito naka set yung condition sa length na mismo ng character array but pedi mo rin gawin ay mhalnickame.lenght();
        //maraming tricks para sa pag print ng reverse sa for loop
        // peding e set mo si integer "i" sa max length at ANG condition mo ay "i > 0"
        // or gawin mo, gawa ka ng equation kung saan ang value ni "i" ay minus sa length.

       
        System.out.print(stringTocharArray[i]);


        
    }

    System.out.println("\n");
    System.out.println("Printing using reverse number ng iteration"); //this one I used para mag show off haaha char para iba yung solution..

    int lastIndex = stringTocharArray.length;
    for (int i = 0; i < lastIndex; i++) { //normal iteration pero may thrill sa printing
        //pls notice na nilagay ko lang yung length ng array sa isang variable para easy sa pagtawag
        //yung value ni lastindex which is length ng array ay subtract mo lang sa value ni "i"
        // halimbawa ang value ni "i" ay 0, lastindex - 0 ay yung mismong huling number na kung saan maga reverse.
        // kapag 1 value ni "i", lastindex - 1 ay maging second to the last index.
        // make sure na magiging positive yung value, higher number and iteration yung pag subtract.
        
        System.out.print(stringTocharArray[(lastIndex-1)-i]); 
        
        //bakit may minus 1 yung lastindex variable, ito ay dahil counted ang zero as counting number
        //and naga start yung index ng array sa 0, at naga end sa length-1 .
    }


}
}