package sample;

import org.testng.annotations.Test;

public class TestNg2 {
	@Test(groups="smoke")
	void A() {
		System.out.println("A-2..."+Thread.currentThread().getId());
		
	}
	@Test(groups="san")
	void B() {
		System.out.println("B-2..."+Thread.currentThread().getId());
		
	}
	@Test(groups="reg")
	void c() {
		
		System.out.println("C-2..."+Thread.currentThread().getId());
	}
}
