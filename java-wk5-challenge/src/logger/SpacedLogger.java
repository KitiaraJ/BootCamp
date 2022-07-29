package logger;

public class SpacedLogger implements Logger {

	/**
	 * log(String log)
	 * @param log
	 * Takes the string log and prints out
	 * the string: l o g by passing the log String 
	 * through the buildString function
	 */
	public void log(String log) {
		System.out.println(buildString(log));
	}

	/**
	 * error(String err)
	 * @param err
	 * Takes the string err and prints out
	 * three strings that run:
	 *       Error: e r r
	 * by passing the string err 
	 * through the buildString function
	 */
	public void error(String err) {
		System.out.println("Error: " + buildString(err));
	}
	/**
	 * 
	 * @param msg
	 * @return
	 */
	public String buildString(String msg) {
		String str = "";
		for (int i = 0; i < msg.length(); i++) {
			str = str + msg.charAt(i) + " "; 
		}
		String formatString = str.trim();
		return formatString;
	}

}
