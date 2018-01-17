package test.java.com.pactera.utils;

import org.junit.Test;

import main.java.com.pactera.utils.StringUtils;

import static org.junit.Assert.assertTrue;



public class StringUtilsTest {

	@Test
	public void testIsEmpty() {
		String emptyStr = "";
		String nullStr = null;
		assertTrue(StringUtils.isEmpty(emptyStr));
		assertTrue(StringUtils.isEmpty(nullStr));
	}
	
}
