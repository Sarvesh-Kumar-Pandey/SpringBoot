package com.nit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// case 1
/*import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {

	@Test
	@Order(4)
	public void testSave() {
		System.out.println(" Save-Hello");
	}

	@Test
	@Order(2)
	public void testUpdate() {
		System.out.println("Update-Hello");
	}
	
	@Test
	@Order(3)
	public void testDelete() {
		System.out.println("HELLO-DELETE");
	}
}
*/
// case-2

public class TestEmployee {
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("FROM ONETIME SETUP");
	}

	@BeforeEach
	public void setup() {
		//setup, init data
		System.out.println("FROM SETUP");
	}
	
	@Test
	@DisplayName("TESTING SAVE METHOD")
	public void testSave() {
		System.out.println("HELLO-SAVE");
	}

	@DisplayName("TESTING UPDATE METHOD")
	@Test
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}
	
	@AfterEach
	public void clear() {
		System.out.println("CLEAR DATA");
	}
	
	@AfterAll
	public static void closeAll() {
		System.out.println("ONCE AT END");
	}
	
}




