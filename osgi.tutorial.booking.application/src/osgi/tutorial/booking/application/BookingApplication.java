package osgi.tutorial.booking.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;
import osgi.tutorial.booking.api.Booking;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="osgi.tutorial.booking")
public class BookingApplication implements REST {

	private Booking booking;
	
	public String getUpper(String string) {
		return string.toUpperCase();
	}

	public String getGreeting() {
		return booking.greet();
	}

	@Reference
	public void setBpooking(Booking booking){
		this.booking = booking;
		System.out.println("Application: "+booking);
	}
}
