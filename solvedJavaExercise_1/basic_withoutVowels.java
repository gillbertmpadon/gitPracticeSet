import java.net.SocketTimeoutException;

class Main {

public static void main (String args[]){

String withVowel  = "I like gold but A is silent";
withVowel = withVowel.toLowerCase(); // importante ito, tulad mo para sakin hahahaha. Use this string method para maging lower case lahat
// para walang problem sa pag compare since ang nasa condition natin ay small case lang.
for (int i = 0; i < withVowel.length(); i++) {
   
    if(withVowel.charAt(i)=='a'||withVowel.charAt(i)=='e'||withVowel.charAt(i)=='i'||withVowel.charAt(i)=='o'||withVowel.charAt(i)=='u'){
        //yung function na charAt pagkuha yan ng single character ng string, yung i ay index starts from 0
        // equal operator yung ginamit ko para kpag yung character ng string ay vowels hindi sya maga print. Ang e print nya lang ay space to indicate na merong vowels
        System.out.print(" "); //add space kpag may vowels
        

    }else{
        System.out.print(withVowel.charAt(i));// if yung index ng i sa string ay hindi vowels print it. pedi mo e store sa isang variable para mas madaling tawagin
        // char a =withVowel.charAt(i) ; pedi mo sya e store para mas madaling tawagin next time. 
        // halimbawa sa condition natin na withVowel.charAt(i)!='a' vs sa condition na a=='a', ito ay dahil contain ni char a ang value ni withVowel.charAt(i)
        // ang withVowel.charAt(i) at yung char type na a ay pareho lang. Nag store ka lang pero mas madaling tawagin sana.
    }
}

}
}




