package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class UnitTests {

	public class TestCases {

		Assignment as = new Assignment();
		ArrayList<String> arlsIn = new ArrayList<>();
		ArrayList<String> arlsOut = new ArrayList<>();
		{
			arlsOut.add("ABC");
			arlsOut.add("ACB");
			arlsOut.add("BAC");
			arlsOut.add("BCA");
			arlsOut.add("CBA");
			arlsOut.add("CAB");
		}

		@Test
		public void recursiveCall1() {

			arlsIn.removeAll(arlsIn);

			arlsIn = as.recursiveCall("ABC", 0, 3);

			Assert.assertEquals(arlsOut.toArray(), arlsIn.toArray());

		}

		@Test
		public void recursiveCall2() {

			arlsIn.removeAll(arlsIn);
			arlsIn = as.recursiveCall("ABCDE", 0, 5);
			Assert.assertEquals(120, arlsIn.size());

		}

		@Test
		public void recursiveCall3Negative() {

			arlsIn.removeAll(arlsIn);
			arlsIn = as.recursiveCall("ABCDE", 0, 5);
			Assert.assertEquals(121, arlsIn.size());

		}

		@Test
		public void SwapPositive() {

			String out = as.Swap("ROGER", 0, 3);
			Assert.assertEquals("EOGRR", out);

		}

		@Test
		public void SwapNegative() {

			String out = as.Swap("ROGER", 0, 1);
			Assert.assertEquals("EOGRR", out);

		}

	}
}
