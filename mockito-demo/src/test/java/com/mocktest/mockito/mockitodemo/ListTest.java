package com.mocktest.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
public class ListTest {

	@Test
	public void test() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn(10).thenReturn(20);
		assertEquals(10,listMock.get(0));
		assertEquals(20,listMock.get(0));
		assertEquals(20,listMock.get(0));
	}
	
	@Test
	public void testGenericParameter() {
		List listMock=mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("some string value");
		assertEquals("some string value",listMock.get(0));
	
	}

}
