package tdd_by_example_kent_beck_praxis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TDD_praxis {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		
		class Dollar {
			
		int amount;
			
		Dollar(int amount){
			this.amount= amount;
		}
		
		
		void times(int multiplier) {
			amount *= multiplier;
		}
		
		
		public void testMultiplication() {
			Dollar five= new Dollar(5);
			five.times(2);
			assertEquals(10, five.amount);
			
			}
		
		}

	}
}
