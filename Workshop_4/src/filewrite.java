
import java.io.*;

public class filewrite {

	public static void main(String[] args) {
		try {
			
		BufferedWriter bw = new BufferedWriter(
		new FileWriter("C:\\Users\\hp\\Desktop\\New folder\\output.txt"));

		bw.write("Firstname-Vamshi");
		bw.write("Lastname-krishna");
		bw.write("pincode-584123");
		bw.write("city-bangalore");
		bw.write("state-karnataka");
		bw.write("Mob-8766779988");
		bw.write("Gender-Male"); 
		bw.close();
	}
		
		catch(Exception ex) {
			return;
		}
	}
}

