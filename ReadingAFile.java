package AccesingFiles;

import java.io.BufferedReader;

/**
 * @author pruthvi
 */

import java.io.File;
import java.io.FileReader;

public class ReadingAFile {
		
		public static void main(String []args){
			
			//creating an object
			
			File file=null;
			
			
			try {
				file = new File("D:/pruth/mail.txt");
				//reading the file
		        BufferedReader br=new BufferedReader(new FileReader(file));
	            String s;
	            //to print the content of file
	            while( (s=br.readLine())!=null)
	           {
	    	   System.out.println(s);	
	          	 br.close();
	           }}
	           
			 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			
			 }
			
		

	}

}
