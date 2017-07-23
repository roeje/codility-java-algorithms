/*

Write a function:

class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

*/

import java.util.*;

class Solution {

   public int solution(int[] A) {

      HashSet<Integer> countSet = new HashSet<Integer>();
      int maxValue = 0;

      for(int i = 0; i < A.length; i++) {
         if (A[i] > 0) {
            countSet.add(A[i]);
         }
         if (A[i] > maxValue) {
            maxValue = A[i];
         }
      }

      for (int i = 1; i < maxValue + 1; i++) {

         // HashSet.contains() is O(1) time complexity
         if (!countSet.contains(i)) {
            return i;
         }

      }
      return maxValue + 1;

   }

   public static void main(String[] args) {

      Solution tmp = new Solution();

      int[] test1 = new int[]{1,3,6,4,1,2};
      int[] test2 = new int[]{1,2,3,4,5};

      System.out.println(tmp.solution(test1));
      System.out.println(tmp.solution(test2));
   }
}
