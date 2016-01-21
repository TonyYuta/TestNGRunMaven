package core;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MainPageTest {
	@Test
	public void sumInt() {
		assertEquals(MainPage.in1 + MainPage.in2,224);
	}
	
	@Test
	public void sumFloat() {
		assertEquals(MainPage.fl1 + MainPage.fl2,4.0F);
	}
	
	@Test
	public void stringConcatenate() {
		assertEquals(MainPage.st1 + " & " + MainPage.st2, "Site Title 1 & Site Title 2");
	}

}