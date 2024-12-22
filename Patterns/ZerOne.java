package Patterns;

public class ZerOne {
    static void zerOnepat(int lastrow){
    for (int row = 0; row < lastrow; row++) {
        for (int col = 0; col <= row; col++) {
            if ((row + col) % 2 == 0) {
                System.out.print(1+" ");
            } else {
                System.out.print(0+ " ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        zerOnepat(5);
        
    }
    
}
