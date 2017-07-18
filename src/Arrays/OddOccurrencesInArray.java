/*

A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

*/
import java.util.*;

// Solution is both O(N) time complexity and O(1) space
class Solution {

   public int solution(int[] A){

      // Create hashmap to store count for each value found, map reduces mem footprint
      HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

      // For each value in input array increment its corresponding value in count array or create new key,value
      for(int i = 0; i < A.length; i++) {
         if(countMap.containsKey(A[i])) {
            int tmp = countMap.get(A[i]);
            countMap.put(A[i], (tmp + 1));
         } else {
            countMap.put(A[i], 1);
         }
      }

      // Loop over key value pairs
      // max number of iterations is 1000000 (as the max number of elements in the input array is 1000000), so time complexity is still O(1)
      for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
          int key = entry.getKey();
          int value = entry.getValue();
          if ((value % 2) != 0) {
             return key;
          }
      }
      return 0;
   }

   public static void main(String[] args) {

      Solution tmp = new Solution();

      int[] test1 = new int[]{5, 6, 6, 6, 5, 5, 5, 10, 10};
      int[] test2 = new int[]{1000000000, 1, 1000000, 1, 1000000000};

      System.out.println(tmp.solution(test1));
      System.out.println(tmp.solution(test2));
   }

}
