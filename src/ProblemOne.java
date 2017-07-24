/*



*/
import java.math.BigInteger;

class Solution {
   public int solution(int A, int B) {

      int oneDigitCount = 0;

      /*
         BigInteger used to account for integer overflow.
         Since max value of input is 100,000,000...
      */
      BigInteger valueOne = BigInteger.valueOf(A);
      BigInteger valueTwo = BigInteger.valueOf(B);
      BigInteger product = valueOne.multiply(valueTwo);

      /*
         For each digit in the binary number, check for 1's digit.
         BigInteger.toString() with radix of 2 used to get binary string.
         CharArray is used to easily iterate over binary string.
      */
      for(char digit : product.toString(2).toCharArray()) {

         // Check if each char is a 1
         if (digit == '1') {
            oneDigitCount++;
         }
      }
      return oneDigitCount;
   }

   /*
      Main function I used for testing in IDE, left in code so that you can
      see what test cases I used.
   */
   public static void main(String[] args) {

      Solution tmp = new Solution();

      System.out.println(tmp.solution(3, 7));
      System.out.println(tmp.solution(5, 6));
      System.out.println(tmp.solution(100000000, 100000000));
      System.out.println(tmp.solution(100000000, 0));
   }
}
