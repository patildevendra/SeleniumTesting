package sample;

import org.testng.annotations.Test;


public class TestNgParallalTest {
	
	@Test(groups="reg")
	void A() {
		System.out.println("A-1..."+Thread.currentThread().getId());
		
	}
	@Test(groups="smoke")
	void B() {
		System.out.println("B-1..."+Thread.currentThread().getId());
		
	}
	@Test(groups="san")
	void c() {
		
		System.out.println("C-1..."+Thread.currentThread().getId());
	}
}
