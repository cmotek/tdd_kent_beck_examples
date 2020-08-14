package tdd_by_example_kent_beck_praxis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDD_praxis {
	
		class Money {
			protected int amount;
			
			public boolean equals(Object object) {
				Money money= (Money) object;
				return amount == money.amount;
			}
			
		}
		
		class Dollar extends Money {
			
		
			
		Dollar(int amount){
			this.amount= amount;
		}
		
		
		Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);

		}
		

		}
		
		class Franc extends Money {
				
		Franc(int amount){
			this.amount= amount;
			}
			
			
		Franc times(int multiplier) {
			return new Franc(amount * multiplier);

			}
			
		public boolean equals(Object object) {
			Money money= (Money) object;
			return amount == money.amount;
			}
			
			}
		
		@Test
		public void testMultiplication() {
			Dollar five= new Dollar(5);
			assertEquals(new Dollar(10), five.times(2));
			assertEquals(new Dollar(15), five.times(3));			
			}
		
		@Test
		public void testEquality() {
			assertTrue(new Dollar(5).equals(new Dollar(5)));
			assertFalse(new Dollar(5).equals(new Dollar(6)));
			assertTrue(new Franc(5).equals(new Franc(5)));
			assertFalse(new Franc(5).equals(new Franc(6)));
		}
		
		@Test
		public void testFrancMultiplication() {
			Franc five= new Franc(5);
			assertEquals(new Franc(10), five.times(2));
			assertEquals(new Franc(15), five.times(3));
			
			}
		
		
}
