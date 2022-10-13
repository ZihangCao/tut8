package testingTutorial;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import static java.util.IdentityHashMap.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class testing{
	//Q1
	@Test
	public void lecturerEqualHash() {
		Lecturer one = new Lecturer(0,null,"");
		Lecturer two = new Lecturer(0,null,"");
		assertEquals(one,two);
		assertEquals(one.hashCode(),two.hashCode());
	}
	
	@Test
	public void studentEqualHash() {
		Student one = new Student(0,null,"");
		Student two = new Student(0,null,"");
		assertTrue(one.equals(two)&& one.hashCode()!=two.hashCode());
	}
	
	//Q2
	
	
	//Q3
	//check is list an unmodifiable list
	@Test 
	public void isListImmutable() throws Exception{
		List<Integer> toCheck = new ArrayList<Integer>();
		toCheck.add(10);
		toCheck.add(20);
		List<Integer> immutableList = Collections.unmodifiableList(toCheck);
		Assertions.assertThrows(UnsupportedOperationException.class,()->{immutableList.add(null);});
	}
	
	@Test
	public void stillIterable() {
		List<Integer> toCheck = new ArrayList<Integer>();
		toCheck.add(10);
		toCheck.add(20);
		List<Integer> immutableList = Collections.unmodifiableList(toCheck);
		Iterator<Integer> iteratorList = immutableList.iterator();
		assertTrue(while(iteratorList.hasNext()));
	}
}