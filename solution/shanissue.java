import java.util.Scanner;

class shan {
    public static void main(String[] args) {
        Scanner shan = new Scanner(System.in);
        System.out.println("Check Shan Condition: ");
        String word = shan.nextLine();
        if(word.contains(".")){
            for (int i = 0; i < word.length()-1; i++) {
                System.out.print(word.charAt(i));
               
            }
            System.out.println("/nDrama mo Shan haha");
        }else{
            System.out.println("Shan is okay");
        }
    }
}
