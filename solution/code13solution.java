public class code13solution {
    public static void main(String[] args) {
        String origWord = "the quick brown fox jumps over the lazy dog.";
        System.out.print(Character.toString(origWord.charAt(0)).toUpperCase());
        for (int i = 1; i < origWord.length(); i++) {
            if(origWord.charAt(i)==' '){
                System.out.print(origWord.charAt(i)+Character.toString(origWord.charAt(i+1)).toUpperCase());
                i++;
            }else{
                System.out.print(origWord.charAt(i));
            }
        }
    }
}
