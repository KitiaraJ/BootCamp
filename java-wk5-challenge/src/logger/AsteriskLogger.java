package logger;

public class AsteriskLogger implements Logger {

	/**
	 * log(String log)
	 * @param log
	 * Takes the string log and prints out
	 * the string: ***log*** 
	 */
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	/**
	 * error(String err)
	 * @param err
	 * Takes the string err and prints out
	 * three strings that run:
	 *       ****************
	 *       ***Error: err***
	 *       ****************
	 * by repeating the * symbol as many 
	 * times as the err string is long.
	 */
	public void error(String err) {
		/* saves to a variable so we can have an 
		 * accurate count of how many stars we want.  */		
		String builtString = "***Error: " + err + "***";
		
		System.out.println("*".repeat(builtString.length()));
		System.out.println(builtString);
		System.out.println("*".repeat(builtString.length()));
	}

}
