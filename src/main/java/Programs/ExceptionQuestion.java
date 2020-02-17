package Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionQuestion {
		 //will this code compile????
	
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
	
	
		public static void main(String[] args) {
		 
		try {
		FileReader f = new FileReader(new File("D:\\myfile"));
		}catch(IOException e) {
		 
		}catch(FileNotFoundException e) {
		 
		}
		}
		 
		}