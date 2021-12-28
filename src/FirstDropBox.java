import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author NguyenVu
 * @version 1.0
 * 
 */
public class FirstDropBox {
	/** List of Vehicle ID from data file*/
	private String []vehID;
	/**
	 * Method to get the vehicle ID from the data file
	 * @throws IOException  The exceptions produced by failed or interrupted I/O operations.
	 * @throws FileNotFoundException  Signals that an attempt to open the file
	 *                                denoted by a specified pathname has failed
	 * 						          on input error
	 */
	public FirstDropBox() throws IOException, FileNotFoundException{
		// Construct the array
		vehID = new String[6]; 

		String filePath = new String("vehicleone.txt");
		BufferedReader br = new BufferedReader(new FileReader(filePath)) ;
		String line;
		int i = 0;
		// Split the input by new line and add it to the temporary array
		while((line = br.readLine()) != null) {
			String[] array = line.trim().split("\\s+");
			// add vehicleID to the list if the length of vehicleID is 5
			if(array[0].length() == 5) {
				vehID[i] = array[0];
				i++;
			}
		}
		// Initialize the first output of the combo box is "Find Car"
		String initialName = "Find Car";
		for(int j = vehID.length-1; j > 0; --j) {
			vehID[j] = vehID[j-1];
		}
		vehID[0] = initialName;
		br.close();
	}
	/**
	 * 
	 * @return The array which contains the vehicle ID in vehicleone.txt
	 */
	public String [] getDropBox1 () {
		return vehID;
	}
}