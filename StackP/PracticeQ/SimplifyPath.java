import java.util.Scanner;
import java.util.Stack;

class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder("");

        res.append("/");

        for(int i = 0; i < path.length(); i++){

            while(i < path.length() && path.charAt(i) == '/'){
                i++;
            }
            StringBuilder dir = new StringBuilder("");
            while(i < path.length() && path.charAt(i) != '/'){
                dir.append(path.charAt(i));
                i++;
            }

            if(dir.toString().equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            } 
            else if(dir.toString().equals(".")){
                continue;
            }
            else if(dir.length() != 0){
                s.push(dir.toString());
            } 
        }
        
        Stack<String> s2 = new Stack<>();
        while(!s.isEmpty()){
            s2.push(s.pop());
        }

        while(!s2.isEmpty()){
            res.append(s2.pop()+"/");
        }

        if(res.toString().length() > 1) res.deleteCharAt(res.toString().length()-1);
        return res.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path : ");
        String path = sc.nextLine();
        
        System.out.println(simplifyPath(path));
    }
}