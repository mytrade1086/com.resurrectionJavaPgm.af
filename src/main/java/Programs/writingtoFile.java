package Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingtoFile {

	
	public static void main(String[] args) throws IOException {
		
		
		
		FileWriter fw=new FileWriter("H:\\eclipseWin10\\com.resurrectionJavaPgm.af\\Files\\demowrite.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("line1");
		bw.newLine();
		bw.write("line2");
		bw.newLine();
		bw.write("line3");
		bw.newLine();
	
	
		
		bw.close();
		fw.close();
		
		
		
	}
}
