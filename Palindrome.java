class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rnum=0;
        while(x>0){
            rnum=rnum*10+x%10;
            x=x/10;
        }
        
        if(num==rnum){
            return true;
        }
        return false;
    }
}

public class Palindrome{
    public static void main(String args[]){
      int num=121;

        Solution sol=new Solution();
        System.out.println(sol.isPalindrome(num));
    }
}
