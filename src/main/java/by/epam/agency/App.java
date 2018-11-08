package by.epam.agency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.epam.agency.model.Hotel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Hotel hotel = (Hotel) context.getBean("hotel");
        System.out.println(hotel);
        context.close();
    }
}
