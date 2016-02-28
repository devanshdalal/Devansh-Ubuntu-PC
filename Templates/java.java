import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class java {
	public static void main(String arg[]) throws IOException{
		BufferedReader br = null;
		String Line,content="";
		br = new BufferedReader(new FileReader("combined.tsv"));  //yagoWordnetDomains
		
		File file = new File("yagoWordnetIds.sql");   ///yagoMultilingualClassLabels   ////yagoWordnetIds
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(content);
		bw.flush();
		bw.close();
	}
}
