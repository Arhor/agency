package by.epam.agency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Messenger messenger = (Greeter) context.getBean("greeter");
        messenger.printMessage();
        context.close();
    }
}
