package by.epam.agency;

import java.io.PrintStream;

public class Greeter implements Messenger {
	
	private PrintStream stream;
	
	public Greeter(PrintStream stream) {
		this.stream = stream;
	}
	
	public void printMessage() {
		stream.println("Hello world!");
	}

}
