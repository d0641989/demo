package hw0620;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IDnumberTest{
	@Test
	public void testID1() {
		IDnumber a = new IDnumber();
		assertEquals("合法",a.testID("R124755927"));
		assertEquals("合法",a.testID("A243307083"));
	}
	@Test
	public void testID2() {
		IDnumber a = new IDnumber();
		assertEquals("長度不合法",a.testID("R1247559271"));
	}
	@Test
	public void testID3() {
		IDnumber a = new IDnumber();
		assertEquals("不合法",a.testID("R124755926"));
	}
	@Test
	public void testID4() {
		IDnumber a = new IDnumber();
		assertEquals("格式不合法",a.testID("R524755926"));
		assertEquals("格式不合法",a.testID("1124755926"));
	}
}