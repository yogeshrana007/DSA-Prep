package Arrays;

public class Subarrays {

    static void printSubarray(int arr[]){        
        int t=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                t++;
                System.out.println("----------------->Sum is :"+sum);
            }
        }
        System.out.println("Total subarrays are :"+t);
        System.out.println("Maximum sum of an subarray is :"+max);
        System.out.println("Minimum sum of an subarray is :"+min);
    }
public static void main(String[] args) {
    int arr[]={45,7,15,9,100};
    printSubarray(arr);
}
}
