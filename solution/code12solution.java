import java.util.*;
class code12Sol{
    public static void main(String[] args) {
        
      int countbobo = 0;
      for (int i = 100; i < 1000; i++) {
      String num = i+"";
       String a = Character.toString(num.charAt(0));
       String b = Character.toString(num.charAt(1));
       String c = Character.toString(num.charAt(2));
       int x = Integer.parseInt(a);
       int y = Integer.parseInt(b);
       int z = Integer.parseInt(c);
       if(x<5&&x>0&&y>0&&y<5&&z>0&&z<5){
        if(z != x && z != y && y != x){
          System.out.println(x+""+y+""+z);
          countbobo++;
       }}
   
    }
    System.out.println("Number of unique numbers are "+countbobo);
}}