/*

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

*/

import java.math.BigInteger;

class Solution {

   public int solution(int[] A) {


      /* Calculate actual sum of ints from 1 - N */
      BigInteger N = BigInteger.valueOf(A.length + 1);
      int correctSum = N.multiply(N.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2)).intValue();

      /* Calculate sum of values in array */
      int arraySum = 0;
      for (int i = 0; i < A.length; i++) {
         arraySum += A[i];
      }

      return correctSum - arraySum;
   }

   public static void main(String[] args) {

      Solution tmp = new Solution();

      int[] test1 = new int[]{1, 2, 4, 5, 6};
      int[] test2 = new int[100000];

      System.out.println(tmp.solution(test1));
      System.out.println(tmp.solution(test2));

   }

}
