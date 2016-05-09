import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Handler;

/**
 * @author Saritha
 *
 */
public class HelloWorld {

	//create the Logger instance
	private static Logger theLogger = Logger.getLogger(HelloWorld.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		     
		
		// Create the HelloWorld instance. This calls the constructor.
		 HelloWorld hello = new HelloWorld("Hello world!");
	     hello.sayHello();
	}
	
	// create a String class instance
	private String theMessage;

	//Constructor
	public HelloWorld(String message) {
	    theMessage = message;
	}

	//Method to say hello
	public void sayHello() {	
	    //setting the Logger level to ALL
		theLogger.setLevel(Level.ALL);
		//Log the messages
		theLogger.finest("start Logging!!");// used to give finest details.not very important details
		theLogger.config("All configuration is done");//used to give configuration details if any
		theLogger.info(" the purpose of this method is to print "+theMessage);//used to give some information to the user. 
		theLogger.warning(" No warnings!!");//used to give warnings to the user. 
		theLogger.severe("Nothing Severe");//used to give information on severe errors to the user. 		
		System.out.println(theMessage);
	}

}