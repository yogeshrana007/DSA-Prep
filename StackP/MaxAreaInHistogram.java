package StackP;

import java.util.Stack;

public class MaxAreaInHistogram {

    public static int maxRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        int[] nextSmallerLeft = new int[n];
        int[] nextSmallerRight = new int[n];

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            nextSmallerLeft[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        s.clear();  // for reusing stack

        for (int j = n - 1; j >= 0; j--) {
            while (!s.isEmpty() && heights[j] <= heights[s.peek()]) {
                s.pop();
            }
            nextSmallerRight[j] = s.isEmpty() ? n : s.peek();
            s.push(j);
        }

        for (int i = 0; i < n; i++) {
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;   // width = (j-i-1);
            int area = heights[i] * width;

            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String args[]) {

        int[] ha = {2, 1, 5, 6, 2, 3};
        System.out.println(maxRectangleArea(ha));

    }
}
