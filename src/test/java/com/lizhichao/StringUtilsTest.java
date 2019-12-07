package com.lizhichao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilsTest {
	static StringUtils stringUtils;
	
	@Before
	public void init() {
		stringUtils  = new StringUtils();
		System.out.println("init beore ------");
	}
	
	@BeforeClass
	public static void init1() {
		stringUtils  = new StringUtils();
		System.out.println("init beoreClass ------");
	}
	
	@Test
	public void testIsBlank1() {
		boolean blank = stringUtils.isBlank("11");
		System.out.println("blank is"+blank);
		Assert.assertTrue(blank==false);
		
		blank = stringUtils.isBlank("  ");
		System.out.println("blank is"+blank);
		Assert.assertTrue(blank==true);
	}
	
	@Test
	public void testIsBlank2() {
		
		
		boolean blank = stringUtils.isBlank("  ");
		System.out.println("blank is"+blank);
		Assert.assertTrue(blank==true);
	}
}
