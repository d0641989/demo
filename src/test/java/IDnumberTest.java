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
		assertEquals("�X�k",a.testID("R124755927"));
		assertEquals("�X�k",a.testID("A243307083"));
	}
	@Test
	public void testID2() {
		IDnumber a = new IDnumber();
		assertEquals("���פ��X�k",a.testID("R1247559271"));
	}
	@Test
	public void testID3() {
		IDnumber a = new IDnumber();
		assertEquals("���X�k",a.testID("R124755926"));
	}
	@Test
	public void testID4() {
		IDnumber a = new IDnumber();
		assertEquals("�榡���X�k",a.testID("R524755926"));
		assertEquals("�榡���X�k",a.testID("1124755926"));
	}
}