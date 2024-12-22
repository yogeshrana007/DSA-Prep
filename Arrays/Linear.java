package Arrays;
import java.util.Scanner;

class LinearSearch{
    String[] MenuList={"Poha","Samosa","Jalebi","Vada pav","Kachori","Fafda","chai"};
    Scanner sc=new Scanner(System.in);
    public void Meth(){
    System.out.println("Enter your dish :");
    String name=sc.nextLine();
    int flag=1;
    System.out.println(name);
    for(int i=0;i<MenuList.length;i++){
        if(name.equalsIgnoreCase(MenuList[i])){
            flag++;
            System.out.println("Yes your dish is available at counter number :"+(i+1));
            break;
        }
    }
    if(flag==1){
        System.out.println("Sorry the item you want not in our list !");
        
    }
}

}
public class Linear {
    public static void main(String[] args) {
        LinearSearch l=new LinearSearch();
        l.Meth();
    }
}
