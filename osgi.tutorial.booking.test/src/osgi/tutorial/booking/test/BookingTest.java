package osgi.tutorial.booking.test;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import osgi.tutorial.booking.api.Booking;

/**
 * 
 */

public class BookingTest {

    private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    
    /*
     * 
     */
    @Test
    public void testBooking() throws Exception {
    	Assert.assertNotNull(context);
    }

    @Test
    public void testBookingService()  throws Exception {
    	Assert.assertNotNull(getService(Booking.class));    		
    }

    @Test
    public void testBookingServiceGreet() throws Exception {
    	Assert.assertEquals("hello", getService(Booking.class).greet());
    }
    
    <T> T getService(Class<T> clazz) throws InterruptedException {
    	ServiceTracker<T,T> st = new ServiceTracker<>(context, clazz, null);
    	st.open();
    	return st.waitForService(1000);
    }

}
