package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countLettersTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countLetters("vinodram");
		assertEquals(8, output);
	}

}
