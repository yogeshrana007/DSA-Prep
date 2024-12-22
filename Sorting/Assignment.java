package Sorting;

public class Assignment {

    static void bubbleSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printAr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i;j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }

    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=arr.length-1;i>=0;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1,8,8, 8, 7, 4, 5, 3, 1};
        insertionSort(arr);
        printAr(arr);
    }
}
