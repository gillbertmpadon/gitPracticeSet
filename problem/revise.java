

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

 

 class Revise {

    public static void main(String[] args) throws IOException {
        Scanner scan  = new Scanner(System.in);
        String code;
        boolean userState ;
        do{

     
        System.out.print("Chose Random\t[1]\nSpecific\t[2]\nDecision\t:");
        int nDecision = scan.nextInt();
        if (nDecision==1){
            int a = (int) (Math.random()*14)+10;
            code = "code"+a+".txt";
        }else{
            System.out.print("Type chosen code number: ");
            int user = scan.nextInt();
            code = "code"+user+".txt";
        }

      
        System.out.println();
        var fileName = "C:\\Users\\20208\\OneDrive\\Desktop\\program\\"+code;
       
        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName, StandardCharsets.UTF_8))) {

            var sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {
                
                String finalWords = line;
              
                sb.append(finalWords);
                sb.append(System.lineSeparator());
                
                



            }

            System.out.println(sb);
        }

        
        System.out.print("Chose again? Y or N\nAnswer\t:");
        String again = scan.next();
        if(again.toLowerCase().contains("y")){
            userState=true;
        }else{
            userState=false;
            scan.close();
        }
        System.out.println();
    }while(userState==true);


   
    }
}