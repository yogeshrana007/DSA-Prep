package Sorting;

public class Selection {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        for (Object e : arr) {
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,6,3,55,9};
        selectionSort(arr);
    }
}
