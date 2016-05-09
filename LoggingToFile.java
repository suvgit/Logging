import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LoggingToFile {

	public static void main(String[] args) {
		
		// Create and instantiate the Logger instance		
		Logger theLogger = Logger.getLogger(LoggingToFile.class.getName());
		
		//create file handler instance
		FileHandler fh;
		
		//create data String
		String data;
		
		//try-catch block for exception handling in java		
		try{
			fh = new FileHandler("LogFile.%u.%g.txt");			
			theLogger.addHandler(fh);			
			
		    //setting the Logger level to ALL
			theLogger.setLevel(Level.ALL);
			
			theLogger.config("All configuration is done ");
			
			//Create the SimpleFormatter instance
		    SimpleFormatter formatter = new SimpleFormatter();
		    
		    //add the formatter instance to the file handler
		    fh.setFormatter(formatter);
		    theLogger.info("Formatting is done ");
		    
		    
		    //Instantiate the String variable
		    data = new String("");
		    
		    // the following statement is used to log any messages   
		    theLogger.log(Level.WARNING,"Exception might occur");
		    Integer.parseInt(data);		    
			
		}catch(Exception e){
			//the exception caught is been logged
			theLogger.log(Level.SEVERE,"Exception caught", e);
		}
		
	}

}