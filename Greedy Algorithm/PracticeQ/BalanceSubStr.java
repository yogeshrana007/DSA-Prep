public class BalanceSubStr{

    public static int maxBalanceSubStr(String str){
        int count = 0;
        int c = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'L'){
                c++;
            } else {
                c--;
            }

            if(c == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str = "LRRRRLLRLLRL";

        System.out.println(maxBalanceSubStr(str));
    }
}