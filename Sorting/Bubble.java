package Sorting;

public class Bubble {
    static void bubbleSort(int arr[]){
        int temp=0;
        for (int i = 0; i <arr.length-1; i++) {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,11,56,333,555,900};
        bubbleSort(arr);
        
    }
    
}
