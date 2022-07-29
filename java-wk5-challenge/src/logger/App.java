package logger;

public class App {

	public static void main(String[] args) {
		Logger risk = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
		System.out.println("These are the asterisk challenges.\n");
		risk.log("I'm running with Asterisks.");
		System.out.println();
		risk.error("You have errored out.");

	
		System.out.println("\n\nThese are the spaced challenges.\n");
		space.log("Triskadekaphobia");
		System.out.println();
		space.error("MVEMJSUNP");

	}

}
