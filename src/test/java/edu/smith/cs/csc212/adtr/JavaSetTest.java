package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	
	@Test
	public void testInsertOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertEquals(one.size(),1);
	}
	
	@Test
	public void testInsertRepetition() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		one.insert("A");
		assertEquals(one.size(),1);
	}
	
	@Test
	public void testInsertTwoUniqueItems() {
		SetADT<String> two = new JavaSet<>();
		two.insert("A");
		two.insert("B");
		assertEquals(two.size(),2);
	}
	
	@Test
	public void repeatedInsert() {
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("B");
		ab.insert("B");
		assertEquals(ab.size(),2);
	}
	
	@Test
	public void testContains() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertTrue(one.contains("A"));
	}
	
	@Test
	public void testDoesntContain() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertFalse(one.contains("B"));
	}
	
	@Test
	public void testRemove() {
		SetADT<String> empty = new JavaSet<>();
		empty.insert("A");
		empty.remove("A");
		assertEquals(empty.size(),0);
	}
	
	@Test
	public void testRemoveNothing() {
		SetADT<String> empty = new JavaSet<>();
		empty.insert("A");
		empty.remove("B");
		assertEquals(empty.size(),1);
	}
	
}
