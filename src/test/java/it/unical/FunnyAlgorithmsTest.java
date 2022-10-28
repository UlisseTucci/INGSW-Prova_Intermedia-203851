package it.unical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FunnyAlgorithmsTest {
	
	private static FunnyAlgorithms funny;
	
	@BeforeClass
	public static void beforClass() {
		funny = new FunnyAlgorithms();
		System.out.println("before class!"); 
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class!");
	}
	
	@Before
	public void before() {
		System.out.println("before!");
	}
	
	@After
	public void after() {
		System.out.println("after!");
	}
	
	@Test
	public void binarySearchShouldFail(){
	    DateTime start = new DateTime();
	    System.out.println(start);
	    
	    int[] numBinarySearch = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
	    Integer result = funny.binarySearch(numBinarySearch, 75);
	    assertTrue(result.equals(-1));
	    
	    DateTime fine = new DateTime();
	    System.out.println(fine);
	}
	
	
	@Test(timeout=500)
	public void BinarySearchIsFastEnough(){
	    DateTime start = new DateTime();
	    System.out.println(start);
	    
	    int arrBinarySearch [] = {1, 2, 3, 4, 5, 6, 7, 8};
	    funny.binarySearch(arrBinarySearch, 8);
	    System.out.println("Velocità buona");
	    
	    DateTime fine = new DateTime();
	    System.out.println(fine);
	}
	
	
    @Test
    public void stringToIntConverterTest() {
    	// Caso di prova n°1:
    	String str1 = "10";
    	assertEquals(10, funny.stringToIntConverter(str1));
    	// Caso di prova n°2:
    	String str2 = "15";
    	assertEquals(15, funny.stringToIntConverter(str2));
    	// Caso di prova n°2:
    	String str3 = "20";
    	assertEquals(20, funny.stringToIntConverter(str3));   
    }
	   
}
