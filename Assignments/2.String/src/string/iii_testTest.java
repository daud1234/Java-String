package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class iii_testTest {

	@Test
	public void iii_test() {
		iii_test iii_testobj=new iii_test();
		int t=iii_testobj.testerfunction(6, 7);
        assertEquals(13, t);
	}

}
