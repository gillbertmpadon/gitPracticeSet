public class code15solution {
    public static void main(String[] args) {
        int arrayOrig []= {20,30,40};
        System.out.print("Orignal Array: ");
        for (int i : arrayOrig) {
            System.out.print(i+" ");
        }
        System.out.print("\n");

        int firstEle =arrayOrig[0], lastEle =arrayOrig[arrayOrig.length-1];
        String question = "Larger value between first and last element: ";
        if(firstEle>=lastEle){
            System.out.println(question+firstEle);
        }else{
            System.out.println(question+lastEle);
        }
        
    }
}
