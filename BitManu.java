public class BitManu {

    public static int clearRange(int n, int i, int j) {
        int bitMask = ~(((-1) << i) & ~((-1) << j));
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(clearRange(10,2,4));
        char ch='A';
        System.out.println((char)(ch | ' '));
    }
}
