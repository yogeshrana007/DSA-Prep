public class KthLargestOdd{
    public static void main(String[] args){
        int L = -5;
        int R = 5;
        int k = 8;
        int num = 0;

        if(R % 2 != 0){
            num = R - 2*(k-1);
        } else{
            R--;
            num = R - 2*(k-1);
        }

        if(num < L){
            System.out.println("0");
        } else{
            System.out.println(num);
        }
    }
}