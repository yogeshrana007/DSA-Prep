import java.util.Scanner;

public class Reverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int last = 0;
        int reverse = 0;
        int Onum=num;
        while (Onum >0) {
            last = Onum % 10;
           // System.out.print(last);
            Onum = Onum / 10;
            reverse = (reverse * 10 + last);
        }
        
            if (num == reverse) {
                System.out.printf("Yes %d is a palin    drom", num);
            } 
            else {
                System.out.printf("%d Not a palindrom",num);
            }

    }
}
