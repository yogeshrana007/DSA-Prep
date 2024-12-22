package Sorting;

public class Insertion {
    static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]<key){        // chnge < to > for ascending order 
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,6,3,55,9};
        insertionSort(arr);
    }
    
}
