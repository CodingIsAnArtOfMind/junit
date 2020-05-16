package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testtruncateAInFirst2Positions() {

		String Expected="CD";
			assertEquals(Expected,helper.truncateAInFirst2Positions("AACD"));
	
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
