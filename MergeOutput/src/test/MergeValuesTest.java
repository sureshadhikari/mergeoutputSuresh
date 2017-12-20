package test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;
import main.MergeValues;

/**
 * @author Suresh Adhikari This is a test class which has given input and will
 *         return the output. We have hardcoded input array here
 */
public class MergeValuesTest {

	@Test
	public void testMergeOutput() {

		int[][] inputArray = new int[][] { { 49679, 52015 }, { 49800, 50000 }, { 51500, 53479 }, { 45012, 46937 },
				{ 54012, 59607 }, { 45500, 45590 }, { 45999, 47900 }, { 44000, 45000 }, { 43012, 45950 } };

		System.out.println("<<< Input Values >>>>");
		for (int[] arr : inputArray) {
			System.out.println(Arrays.toString(arr));
		}

		int[][] expectedOutput = new int[][] { { 43012, 47900 }, { 49679, 53479 }, { 54012, 59607 } };

		int[][] resultArray = new int[3][2];

		resultArray = MergeValues.mergeOutput(inputArray);

		System.out.println("=========================================");
		System.out.println("<<< Output Values >>>>");
		for (int[] arr : resultArray) {
			System.out.println(Arrays.toString(arr));
		}

		// Comparing the result with the expected result. It will return true if
		// both matches. If expected result and result is not same, test case
		// will fail.
		assertArrayEquals(expectedOutput, resultArray);
	}

}