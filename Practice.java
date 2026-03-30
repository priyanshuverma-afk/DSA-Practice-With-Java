// ===========================================
// 1. Print all elements of a 2D array row-wise.
// ===========================================

// public class Practice {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         int n = arr.length;
//         int m = arr[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(arr[i][j]+",");
//             }
//             System.out.println();
//         }
//     }
// }

// ===========================================
// 2. Print all elements column-wise.
// ===========================================

// public class Practice{
//     public static void main(String[]args){
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         int n = arr.length;
//         int m = arr[0].length;

//         for(int j=0; j<m; j++){
//             for(int i=0; i<n; i++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// ===========================================
// 3. Find the sum of each row in a matrix.
// ===========================================

// public class Practice{
//     public static void main(String[]args){
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;

//         for(int i=0; i<n; i++){
//             int sum = 0;
//             for(int j=0; j<m; j++){
//                 sum += arr[i][j];
//             }
//             System.out.println("Sum of row " + i + ": " + sum);
//         }
//     }
// }

// ===============================================
// 4. Find the sum of each column in a matrix.
// ===============================================

// public class Practice{
//     public static void main(String[]args){
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;
//         for(int j=0; j<m; j++){
//             int sum = 0;
//             for(int i=0; i<n; i++){
//                 sum += arr[i][j];
//             }
//             System.out.println("Sum of column " + j + ": " + sum);
//         }
//     }
// }

// ===============================================
// 5. Find the maximum element in a 2D array.
// ===============================================

// public class Practice{
//     public static void main(String[]args){
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;
//         int max = arr[0][0];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(arr[i][j] > max){
//                     max = arr[i][j];
//                 }
//             }
//         }
//         System.out.println("Maximum element in the 2D array is: " + max);
//     }
// }

// ==============================================
// 6. Find the maximum element in a 2D array.
// ==============================================

// public class Practice{
//     public static void main(String[]args){
//         int[][] arr = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//     int n = arr.length;
//     int min = arr[0][0];
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             if(arr[i][j]<min){
//                 min = arr[i][j];
//             }
//         }
//     }
//     System.out.println(min);
//     }
// }

// ================================================
// 7. Count total even numbers in a matrix.
// ================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 2, 3 },
//                 { 4, 5, 6 },
//                 { 7, 8, 9 }
//         };
//         int n = arr.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] % 2 == 0)
//                     count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// =================================================
// 8. Count total odd numbers in a matrix.
// =================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 2, 3 },
//                 { 4, 5, 6 },
//                 { 7, 8, 9 }
//         };
//         int n = arr.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] % 2 != 0)
//                     count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// =====================================================
// 9. Print the diagonal elements of a square matrix.
// =====================================================

// public class Practice{
//     public static void main(String[]args){
//     int [][] arr ={
//         {1,2,3},
//         {4,5,6},
//         {7,8,9}
//     };
//     int n = arr.length;
//     for(int i=0;i<n;i++){
//     System.out.print(arr[i][i]+" ");
// }
//     }
// }

// ================================================
// 10. Find the sum of all elements in the matrix
// ================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 2, 3 },
//                 { 4, 5, 6 },
//                 { 7, 8, 9 }
//         };
//         int n = arr.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println(sum);
//     }
// }

// ================================================
// 11. Find the sum of the primary diagonal.
// ================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1,2,3},
//                 {4,5,6},
//                 {7,8,9}
//         };
//         int n = arr.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i][i];
//         }
//         System.out.println(sum);
//     }
// }

// ================================================
// 12. Find the sum of the secondary diagonal.
// ================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1,2,3},
//                 {4,5,6},
//                 {7,8,9}
//         };
//         int n = arr.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i][n - 1 - i];
//         }
//         System.out.println(sum);
//     }
// }

// ================================================
// 13. Transpose of a matrix.
// ================================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;
//         int[][] transpose = new int[m][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 transpose[j][i] = arr[i][j];
//             }
//         }
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ===============================================
//  14. Reverse each row of a matrix.
// ===============================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;
//         for (int i = 0; i < n; i++) {
//             for (int j = m - 1; j >= 0; j--) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ===============================================
// 15. Reverse each column of a matrix.
// ===============================================

// public class Practice {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };
//         int n = arr.length;
//         int m = arr[0].length;
//         for (int j = 0; j < m; j++) {
//             for (int i = n - 1; i >= 0; i--) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// =====================================================================
// 16. Search for a given element in a matrix and return its position.
// =====================================================================

// public class Practice {
//     public static void main(String[] args) {

//         int arr[][] = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int n = arr.length;
//         int target =5;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(arr[i][j] == target){
//                     System.out.println(i + " " + j);
//                 }
//             }
//         }
//     }
// }

// =====================================================
// 17. Check if a matrix is symmetric.
// =====================================================

public class Practice {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int n = arr.length;
        boolean flag = true;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i][j] != arr[j][i]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }

        System.out.println(flag);
    }
}