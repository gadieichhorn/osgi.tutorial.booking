package osgi.tutorial.booking.adapter;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import osgi.tutorial.booking.api.Booking;

/**
 * 
 */
@Component(name = "osgi.tutorial.booking.adapter")
public class BookingImpl {

	private Booking booking;
		
	public BookingImpl() {
		System.out.println("BookingAdapter");
	}

	@Reference
	public void setBooking(Booking booking){
		this.booking = booking;
		System.out.println("Adapter: "+booking);
	}
	
	@Activate
	public void activate() {
		System.out.println("Activate");				
		System.out.println(booking.greet());		
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("Deactivate");						
		System.out.println(booking);		
		System.out.println(booking.greet());		
	}
}
