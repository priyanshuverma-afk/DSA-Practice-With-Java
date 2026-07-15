// ===================================================
// 1. Print all elements of a 2D array row-wise.
// ===================================================

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

// public class Practice {
//     public static void main(String[] args) {

//         int arr[][] = {
//             {1, 2, 3},
//             {2, 4, 5},
//             {3, 5, 6}
//         };

//         int n = arr.length;
//         boolean flag = true;

//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 if(arr[i][j] != arr[j][i]){
//                     flag = false;
//                     break;
//                 }
//             }
//             if(!flag) break;
//         }

//         System.out.println(flag);
//     }
// }


// public class Practice{
//     public static void printNumbers(int n) {
//         if (n == 0) {
//             return;
//         }

//         printNumbers(n - 1);
//         System.out.println(n);
//     }

//     public static void main(String[] args) {
//         printNumbers(10);
//     }
// }

// --------------------------------------------------
// Array Questions
// --------------------------------------------------

// ===============================================
// Find the Largest Element
// ===============================================

// public class Practice {
//     public static void main(String[] args) {

//         int[] arr = {2,4,6,8,10,12,14};

//         int largest = arr[0];

//         for(int i=1;i<arr.length;i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }

//         System.out.println(largest);
//     }
// }

// ==============================================
// Find the Smallest Element
// ==============================================

// public class Practice {
//     public static void main(String[] args) {

//         int[] arr = {2,4,6,8,10,12,14};

//         int smallest = arr[0];

//         for(int i=1;i<arr.length;i++){
//             if(arr[i] < smallest){
//                 smallest = arr[i];
//             }
//         }

//         System.out.println(smallest);
//     }
// }


// ===============================================
// Find the Second Largest Element
// ===============================================

// public class Practice {

//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10, 12, 14};

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }

//         System.out.println("Second Largest = " + secondLargest);
//     }
// }

// ===============================================
// Find the Second Smallest Element
// ===============================================

// public class Practice {
//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10, 12, 14};

//         int smallest = Integer.MAX_VALUE;
//         int secondSmallest = Integer.MAX_VALUE;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] < smallest) {
//                 secondSmallest = smallest;
//                 smallest = arr[i];
//             } else if (arr[i] < secondSmallest && arr[i] != smallest) {
//                 secondSmallest = arr[i];
//             }
//         }

//         System.out.println("Second Smallest = " + secondSmallest);
//     }
// }

// ===============================================
// Find the Sum of All Elements
// ===============================================  

// public class Practice {
//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10, 12, 14};

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// ===============================================
// Find the Average of All Elements
// ===============================================

// public class Practice {
//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10, 12, 14};

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         double average = (double) sum / arr.length;
//         System.out.println("Average = " + average);
//     }
// }

// ===============================================
// linear Search
// ===============================================

// public class Practice {

//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10};

//         int target = 8;

//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] == target) {
//                 System.out.println("Found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Element Not Found");
//         }
//     }
// }

// ===============================================
// reverse an array
// ===============================================

// public class Practice {

//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10};

//         int start = 0;
//         int end = arr.length - 1;

//         while (start < end) {

//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// ===============================================
// Check if an array is sorted
// ===============================================

// public class Practice {

//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10};

//         boolean isSorted = true;

//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 isSorted = false;
//                 break;
//             }
//         }

//         if (isSorted) {
//             System.out.println("Array is sorted");
//         } else {
//             System.out.println("Array is not sorted");
//         }
//     }
// }

// ===============================================
// count the number of even and odd elements in an array
// ===============================================

// public class Practice {

//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10};

//         int evenCount = 0;
//         int oddCount = 0;

//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 evenCount++;
//             } else {
//                 oddCount++;
//             }
//         }

//         System.out.println("Even elements: " + evenCount);
//         System.out.println("Odd elements: " + oddCount);
//     }
// }
