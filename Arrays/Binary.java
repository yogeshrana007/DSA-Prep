package Arrays;
import java.util.Scanner;

public class Binary {

    static void BinarySearch(int array[],int key){
        int start=0; 
        int end=array.length;
        int flag=0;
        while(start<=end){
        int mid=(start+end)/2;
        if(array[mid]==key){
            System.out.println("Your element is present at index :"+mid);
             flag++;
            break;
        }
        else if(array[mid]>key){
            end=mid-1;
        }
        else if(array[mid]<key){
            start=mid+1;
        }
    }
    if(flag==0){
        System.out.println("Element not found !");
    }

}
    
    public static void main(String[] args) {

        int array[]={1,5,10,54,60,65,80,100};


        System.out.println("ENter which element you want to search :");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        
        BinarySearch(array,key);
    }
}
