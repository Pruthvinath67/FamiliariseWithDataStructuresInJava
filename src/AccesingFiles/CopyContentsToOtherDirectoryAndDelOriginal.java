package AccesingFiles;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class CopyContentsToOtherDirectoryAndDelOriginal {
	
	public static void main(String args[]) 
	
	{
		File f1 =new File("D:/my directory");
		File f2 =new File("D:/New directory");
		copyFile(f1,f2);
		
		
		
	    
	}

	private static void copyFile(File f1, File f2) {
		// TODO Auto-generated method stub
		
	}
}

	
