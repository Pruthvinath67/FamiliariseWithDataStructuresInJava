package AccesingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author pruthvi
 */

public class WritingAFileWithInputs {
		
		public static void main(String []args){
			
			//creating the object
			File file=null;
			
			
			try {
				//providing the location to be stored
				file = new File("D:/pruth/mytext.txt");
	
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			//content to be printed,i.e.,input to print something
			bw.write("Hello pruthviM,");
	        bw.write(" here is some text.");
	        bw.newLine();
	        bw.write("I'm writing");
	        bw.write(" the text to the file.");

	        // Always close files.
	        bw.close();
			}
			 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			
			 }
			
		

	}}


