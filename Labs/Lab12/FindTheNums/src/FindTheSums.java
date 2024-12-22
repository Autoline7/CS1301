/*
 * FindTheSums.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/16/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that I am supposed to create 3 methods, one to print out a
 double array neatly, and 2 to solve that word search one horizontally and one vertically
 Since I was doing a little bit of leet code, I used a variation of sliding window to
 find the array is "sum to find" and then copy those values to the b array.

 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the
 * School of Computing at the University of Georgia.
 */
public class FindTheSums{
    public static void main(String[] args) {
        int[][] x = new int[][]{{1,2,3,4,5},{6,8,9,10}};
        int[][] array2 = {
                {3, 2, 1, 1},
                {2, 5, 6, 2},
                {1, 2, 9, 8}
        };
        int[][] array3 = {
                {7, 3, 8, 5, 6, 7, 4, 1, 9, 5},
                {8, 1, 6, 1, 8, 4, 6, 9, 9, 6},
                {9, 2, 4, 8, 6, 1, 1, 3, 6, 2},
                {3, 6, 8, 3, 1, 9, 2, 7, 9, 6},
                {5, 7, 7, 6, 3, 5, 6, 4, 2, 1},
                {6, 4, 5, 5, 7, 6, 8, 1, 9, 7},
                {8, 4, 5, 4, 3, 7, 1, 2, 1, 8},
                {6, 8, 6, 7, 8, 6, 2, 4, 6, 2},
                {7, 8, 6, 8, 3, 8, 2, 2, 8, 5},
                {8, 7, 7, 6, 6, 2, 9, 9, 5, 8}
        };
        System.out.println(arrayToString(array2) + "\n");
        System.out.println(arrayToString(verticalSums(array2,5)));

    }
    public static String arrayToString(int[][] a){
        String str = "";
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[i].length; j++){
                if(j != a[i].length-1){
                    str += a[i][j] + " ";
                } else {
                    str += a[i][j];
                }
            }
            if(i != a.length-1){
                str += "\n";
            }
        }
        return str;
    }

    public static int[][] horizontalSums(int[][] a, int sumToFind){
        int[][] b = new int[a.length][];
        int currentSum = 0;
        int left = 0;
        for(int i = 0; i < a.length; i ++){
            b[i] = new int[a[i].length];
            for (int right = 0; right < a[i].length && left <= right ; right ++){
                currentSum  += a[i][right];
                while(currentSum > sumToFind){
                    currentSum -= a[i][left];
                    left++;
                }
                if(currentSum == sumToFind){
                    for(int k = left; k <= right; k++){
                        b[i][k] = a[i][k];
                    }
                }
            }
            left = 0;
            currentSum = 0;
        }
        return b;
    }

    public static int[][] verticalSums(int[][] a, int sumToFind){
        int[][] b = new int[a.length][a[0].length];
        int currentSum = 0;
        int u = 0;
        for(int c = 0; c < a[u].length; c ++){
            for (int l = 0; l < a.length && u <= l; l++){
                currentSum += a[l][c];
                while(currentSum > sumToFind){
                    currentSum -= a[u][c];
                    u++;
                }
                if(currentSum == sumToFind){
                    for(int k = u; k <= l; k ++){
                        b[k][c] = a[k][c];
                    }
                }
            }
            currentSum = 0;
            u = 0;
        }
        return b;
    }

}