package homework;

public class Day_Homework {

	public static void main(String[] args) {
		int i = 10;
		int j = --i - i++;
		int k = i-- - --i + i++ - --j;
		int l = i++ + j++ + --j - --k - --i;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
/*
 * int i = 10;: Initializes a variable i with the value 10.
 * 
 * int j = --i - i++;: Here, the --i decrements the value of i to 9 and returns
 * the new value, which is then subtracted from the original value of i (9)
 * before the increment i++ takes place. So, j will be 9 - 9 = 0.
 * 
 * int k = i-- - --i + i++ - --j; evaluate this expression step by step below:
 * 
 * i--: Evaluates to the current value of i (9) and then decrements i to 8. --i:
 * Decrements i to 7 and returns the new value. i++: Evaluates to the current
 * value of i (7) and then increments i to 8. --j: Decrements j to -1 and
 * returns the new value. Now, putting it all together: k = 9 - 7 + 7 - (-1) = 9
 * - 7 + 7 + 1 = 10. int l = i++ + j++ + --j - --k - --i;: Let's evaluate this
 * expression step by step:
 * 
 * i++: Evaluates to the current value of i (8) and then increments i to 9. j++:
 * Evaluates to the current value of j (0) and then increments j to 1. --j:
 * Decrements j to 0 and returns the new value. --k: Decrements k to 9 and
 * returns the new value. --i: Decrements i to 8 and returns the new value. Now,
 * putting it all together: l = 8 + 0 + 0 - 9 - 8 = -9.
 */
