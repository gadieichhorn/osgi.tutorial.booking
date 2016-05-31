package osgi.tutorial.booking.provider;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.debug.api.Debug;
import osgi.tutorial.booking.api.Booking;

/**
 * 
 */
@Component(
		name = "osgi.tutorial.booking.impl",
		property = {
				Debug.COMMAND_SCOPE + "=booking",
				Debug.COMMAND_FUNCTION + "=greet"
		})
public class BookingImpl implements Booking {
	
	public BookingImpl() {
		System.out.println("BookingImpl");
	}
	
	@Override
	public String greet() {
		return "hello you";
	}
}
