package nl.jssl.autounit.testclasses;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BooleanArgumentsTests {
	@Test
	public void getText1(){
		assertEquals(new BooleanArguments().getText(false,false), "falsefalse");
	}
}
