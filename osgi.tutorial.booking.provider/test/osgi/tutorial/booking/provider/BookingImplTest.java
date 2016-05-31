package osgi.tutorial.booking.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class BookingImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	public void testGreet() {
		assertEquals("hello", new BookingImpl().greet());
	}
}
