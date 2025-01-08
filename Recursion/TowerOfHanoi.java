package Recursion;

public class TowerOfHanoi {

    public static void TOH(int disk, char source, char helper, char destination) {
        if (disk == 1) {
            System.out.println("Transfer disk " + disk + " from " + source + " to " + destination);
            return;
        }

        TOH(disk - 1, source, destination, helper);
        System.out.println("Transfer disk " + disk + " from " + source + " to " + destination);
        TOH(disk - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        TOH(3, 'S', 'H', 'D');
    }
}
