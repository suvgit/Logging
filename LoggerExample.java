import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Handler;

public class LoggerExample {

    //create the Logger instance
    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
    
    //main function
    public static void main(String[] args) throws SecurityException, IOException{     
        
        //setting the Logger level to INFO
		LOGGER.setLevel(Level.INFO);
		
		// log the info     
        LOGGER.info("I am here...");
        
        //log the warnings if any
        LOGGER.warning("can cause array index out of bounds exception!!");
        
        //create an integer array of 3 elements
        int a[] = {1, 4, 5};
        
        //create an int value as index and set it to 3
        int index = 3;      
        
        //log the config messages
        LOGGER.config("Index is set to "+index);
        
        //try-catch block for exception handling
        try{
            //print out the value in the array at the set index
            System.out.println(a[index]);           
        }catch(Exception e){
            LOGGER.log(Level.SEVERE, "Exception Occured", e);             
        }
       
    }

}