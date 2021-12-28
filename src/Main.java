import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 * Date: 2021.11.23
 * @author NguyenVu
 * @version 1.0 
 * Main class of Project 5
 */
public class Main {
	/**
	 * The main method to create the CarFrame and makes it visible
	 * @param args String array as a command-line argument
	 * @throws FileNotFoundException  Signals that an attempt to open the file
	 *                                denoted by a specified pathname has failed
	 * 						          on input error
	 * @throws IOException The exceptions produced by failed or interrupted I/O operations.
	 */
	public static void main (String [] args) throws FileNotFoundException, IOException {
		// Create car frame and its components
		CarFrame frame = new CarFrame();
		frame.setSize(1400, 700);
		// Terminate program when window closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Resize window to fit components
		//frame.pack();
		// Center the frame
		frame.setLocationRelativeTo(null);
		// Display window
		frame.setVisible(true);
	}
}

