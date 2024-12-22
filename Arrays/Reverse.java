package Arrays;

public class Reverse {
    static void reverse(int array[]){
        int temp=0;
        for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8};
        reverse(array);
    }
}
