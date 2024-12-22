package String;
import java.util.Scanner;

public class Assignment {

    // Question 1
    public static int numberOfVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        return count;
    }

    public static boolean isAnagram(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            int count=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        // System.err.println(numberOfVowels(str));

        System.out.println("Enter another string");
        String str2=sc.nextLine();

        System.out.println(isAnagram(str1, str2));

    }
}
