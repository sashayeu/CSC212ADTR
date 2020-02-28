package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testPutItem() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		assertEquals(fruits.size(),1);
	}
	
	@Test
	public void testPutSameValue() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		fruits.put("orange" , "fruit");
		assertEquals(fruits.size(),2);
	}
	
	@Test
	public void testPutDifferentValue() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		fruits.put("apple" , "vegetable");
		assertEquals(fruits.size(),1);
	}
	
	
	@Test
	public void testGet() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		assertEquals(fruits.get("apple"),"fruit");
	}
	
	@Test
	public void testGetEmpty() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		assertEquals(fruits.get("onion"),null);
	}
	
	@Test
	public void testRemove() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		fruits.remove("apple");
		assertEquals(fruits.size(),0);
	}
	
	@Test
	public void testRemoveNothing() {
		MapADT<String, String> fruits = new JavaMap<>();
		fruits.put("apple" , "fruit");
		fruits.remove("onion");
		assertEquals(fruits.size(),1);
	}
	
}
