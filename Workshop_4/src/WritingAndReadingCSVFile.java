import java.io.*;

public class WritingAndReadingCSVFile {

	public static void main(String[] args) {
	String fileName = "numbers.csv";
	
	writeToCSVFile(fileName);	

	}
		private static void writeToCSVFile(String fileName) {
			
			try (PrintWriter pw = new PrintWriter(fileName)) {
				
			//To Print numbers in particular file
				pw.write(12 + ",");
				pw.write(19 + ",");
				pw.write(34 + ",");
				pw.write(88 + ",");
				
				//To Print output as successful
				System.out.println("finished writing");
			}
			    catch (FileNotFoundException e) {
			    	
				System.out.println("error writing");
				e.printStackTrace();
			}
		} 
		private static void readCSVFile(String filename) {
    }
  }