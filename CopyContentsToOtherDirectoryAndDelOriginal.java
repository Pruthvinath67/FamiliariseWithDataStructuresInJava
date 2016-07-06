package AccesingFiles;

import java.io.File;

import java.io.IOException;

//import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
public class CopyContentsToOtherDirectoryAndDelOriginal {
	
	public static void main(String args[]) 
	
	{
		
		File f1 =new File("D:/my directory");
		File f2 =new File("D:/New directory");
		try {
			FileUtils.copyDirectory(f1,f2);
			FileUtils.deleteDirectory(f1);
			System.out.println("deleted successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}
