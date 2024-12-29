package Patterns;

public class NumPattern{
        public static void printPattern(int n) {
            int center = n / 2; // Calculate center index (0-based)
    
            for (int i = 0; i < n; i++) { // Loop through rows
                for (int j = 0; j < n; j++) { // Loop through columns
                    // Calculate value based on maximum distance from the center
                    int value = 1 + Math.max(Math.abs(i - center), Math.abs(j - center));
                    System.out.print(value + " "); // Print value
                }
                System.out.println(); // Move to the next row
            }
        }
    
        public static void main(String[] args) {
            int n = 17; // Example size (odd number)
            printPattern(n);
        }
    }
    