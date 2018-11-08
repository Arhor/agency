package by.epam.agency;

import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.epam.agency.model.Hotel;
import by.epam.agency.model.Hotel.Feature;

@Configuration
public class ApplicationConfig {

	@Bean
	public Messenger greeter() {
		return new Greeter(System.out);
	}
	
	@Bean
	public Hotel hotel() {
		Hotel hotel = new Hotel();
		hotel.setId(1);
		hotel.setName("Hillton");
		hotel.setStars((byte) 7);
		hotel.setWebsite("www.hilton.com");
		hotel.setLatitude(47.123456);
		hotel.setLongitude(89.987654);
		hotel.setFeatures(new TreeSet<Hotel.Feature>() {
			{
				add(Feature.BAR);
				add(Feature.SWIMMINGPOOL);
			}
		});
		return hotel;
	}
	
}
