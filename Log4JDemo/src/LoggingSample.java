import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.log4j.Logger;


//yoooman
//mybranchcommit
//secondLocalCommit
public class LoggingSample {
	
	private static Logger logger=Logger.getLogger("LoggingSample");
	 
	public static void main(String[] args){
	   try{
	      Scanner sc=new Scanner(System.in);
	      logger.info("Created Scanner Object");
	      System.out.println("Enter First No. : ");
	      int no1=sc.nextInt();
	      logger.info("Entered first no");
	      System.out.println("Enter Second No");
	      int no2=sc.nextInt();
	      logger.info("Entered Second No");
	      int result=no1/no2;
	      logger.info("Calculated Response");
	      System.out.println("Result : "+result);
	   }catch (ArithmeticException fe){
		  
	     logger.warn("zero entered in no2");
	     System.out.println("Undefined");
	   
	   }
	   catch(Exception e){
		   logger.fatal("Program Terminated"+e);
		
	   }
	
	 }

}
