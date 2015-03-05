package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ut_withdraw(){
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 0.045;
		double x = 0;
		double NewAccR = 0;
	
	NewAccR = 0;
	
	Account a = new Account();
	
	NewAccR = a.withdraw(balance, 2500);
	
	assertEquals("The balance is 17500", 17500, 17500);
	}
	
	@Test
	public void ut_deposit(){
		double balance = 20000;
		double NewAccR1 = 0;
		
	Account b = new Account();
	
	NewAccR1 = b.deposit(balance, 3000);
	
	assertEquals("The balance is 23000", 23000, 23000);
		
		
		
	}
	
	
	
	
}
