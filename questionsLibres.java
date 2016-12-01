import java.util.Scanner;
import java.util.logging.*;
import java.io.*;

public class questionsLibres
{
	private     ConsoleHandler ch;
    private     XMLFormatter formatter;
    private     FileHandler handler = null;
    
	public static void main(String[] args)
	{
		questionsLibres logging = new questionsLibres();
        logging.logMessage();
		String nom = getNom();
		System.out.println(nom);

	}
	
	public questionsLibres() {
        ch = new ConsoleHandler();
        formatter = new XMLFormatter();
    }
	
	
	 public void logMessage()
	    {
	        //creating a LogRecord object with level and message
	        LogRecord record = new LogRecord(Level.INFO, "XML message..");

	        try
	        {
	            //creating a StreamHandler object to file output the xml message
	            handler = new FileHandler("ia.xml");
	            handler.setFormatter(formatter);

	            //publishing the log message to the file and flushing the buffer
	            handler.publish(record);
	            handler.flush();
	        }catch(Exception e) {
	            //creating a log record object with the WARNING level
	            //and exception message
	            LogRecord rec = new LogRecord(Level.WARNING, e.toString());

	            //setting the formatter for the consolehandler as
	            //XMLFormatter and publishing the message
	            ch.setFormatter(formatter);
	            ch.publish(rec);
	        }
	    }
	public static String getNom() {
		System.out.println("Quel est ton nom ?");
		Scanner scan= new Scanner(System.in);

	    //For string

	    String text= scan.nextLine();
	    return text;
	}
	
	public static String[] Search(String SearchTextToSplit) {
		 String[] parts = SearchTextToSplit.split(" ");
		    for (String s: parts)
		    {           
		        //Do your stuff here
		        System.out.println(s); 
		    }
			return parts;
	
	}
	
	
	

}
