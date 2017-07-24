/*



*/
import java.util.*;

class Solution {
   public int solution(int N) {

      int largestPermutation = 0;

      // Convert integer to string so that iteration over digits is easier
      String number = Integer.toString(N);

      // Create list to store digits of number string
      ArrayList<Integer> digitList = new ArrayList<Integer>();

      /*
         Add each character in number string to ArrayList as integer.
      */
      for (char digit : number.toCharArray()) {
         digitList.add(Character.getNumericValue(digit));
      }

      /*
         Sort array list in decending order so as to get largest value permutation
         of integer digits.
         Since each value in array is a single digit, simply sorting the array in
         decending order will result in largest integer result.
         No direct comparison of digits is needed.
      */
      Collections.sort(digitList, Collections.reverseOrder());

      /*
         Create integer from each digit in ArrayList.
      */
      for (Integer i : digitList) {

         /*
            Increase the current total by a factor of 10 (add a zero to end),
            then add the next digit to get the new total.
         */
         largestPermutation = 10 * largestPermutation + i;
      }

      return largestPermutation;
   }

   /*
      Main function I used for testing in IDE, left in code so that you can
      see what test cases I used.
   */
   public static void main(String[] args) {

      Solution tmp = new Solution();

      System.out.println(tmp.solution(100));
      System.out.println(tmp.solution(10000));
      System.out.println(tmp.solution(12345));
      System.out.println(tmp.solution(12655));
      System.out.println(tmp.solution(9999));
      System.out.println(tmp.solution(213));
      System.out.println(tmp.solution(553));
      System.out.println(tmp.solution(555));
      System.out.println(tmp.solution(0));
      System.out.println(tmp.solution(0001));
   }
}
