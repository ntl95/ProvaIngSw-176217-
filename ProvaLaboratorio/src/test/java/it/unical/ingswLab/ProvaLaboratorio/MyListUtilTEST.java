package it.unical.ingswLab.ProvaLaboratorio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.joda.time.*;

public class MyListUtilTEST {

	private static MyListUtil myList;
	private static DateTime dateTime;
	@BeforeClass
	public static void Initialize() {
		System.out.println("Inizializzazione tests");
		myList = new MyListUtil();
		dateTime = new DateTime();
	}
	
	@Before
	public void startTime() {
		System.out.println("Inizio Test  " + dateTime.now().toString("dd/mm/yyyy hh:mm:ss"));
	}
	
	@Test
	public void sortListWorks(){
		assertEquals(Arrays.asList(1,2,3,4), myList.sortList(Arrays.asList(4,1,3,2), "crescente"));
		assertEquals(Arrays.asList(1,2,4,3), myList.sortList(Arrays.asList(2,4,1,3), "crescente"));
	}
	@Test
	public void reverseSortWorks() {
		assertEquals(Arrays.asList(4,3,2,1 ), myList.sortList(Arrays.asList(2,4,1,3), "decrescente"));
		assertEquals(Arrays.asList(4,2,3,1 ), myList.sortList(Arrays.asList(2,4,1,3), "decrescente"));
	}
	
	@After
	public void endTime() {
		System.out.println("Fine Test  " + dateTime.now().toString("dd/mm/yyyy hh:mm:ss"));
	}
	@AfterClass
	public static void Terminate() {
		System.out.println("Terminati tutti i tests");
	}
}
