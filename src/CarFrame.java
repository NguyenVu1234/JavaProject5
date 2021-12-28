import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * @author NguyenVu
 * @version 1.0
 * 
 */
public class CarFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel pic1;
	private JLabel pic2;
	private JButton SwapButton;
	private GridBagConstraints layoutConst;
	/**
	 * Method to create the car's frame and add all the components to the frame
	 * @throws FileNotFoundException  Signals that an attempt to open the file
	 *                                denoted by a specified pathname has failed
	 * 						          on input error
	 * @throws IOException  The exceptions produced by failed or interrupted I/O operations.
	 */
	public CarFrame() throws FileNotFoundException, IOException {
		//Set title for the frame
		setTitle("Project5");
		// Use a GridBagLayout
		setLayout(new GridBagLayout());
		// Create GridBagConstraints
		layoutConst = new GridBagConstraints();

		// Create the object to get the needing components for the frame
		AddComponent1 Component1 = new AddComponent1();
		AddComponent2 Component2 = new AddComponent2();

		// Specify component's grid location
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		// 10 pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(Component1.getCarLabel1(), layoutConst); 

		// Specify component's grid location
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		// 10 pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(Component1.getComboBox1(),layoutConst);

		// Specify component's grid location
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		//pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		pic1 = Component1.getPicture1();
		add(pic1,layoutConst);

		// Specify component's grid location
		layoutConst.gridx = 2;
		layoutConst.gridy = 0;
		// 10 pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(Component2.getCarLabel2(),layoutConst);

		// Specify component's grid location
		layoutConst.gridx = 2;
		layoutConst.gridy = 1;
		// 10 pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(Component2.getComboBox2(),layoutConst);

		// Specify component's grid location
		layoutConst.gridx = 2;
		layoutConst.gridy = 2;
		//pixels of padding around component
		layoutConst.insets = new Insets(10, 10, 10, 10);
		pic2 = Component2.getPicture2();
		add(pic2,layoutConst);

		//Create the swap button
		SwapButton = new JButton("SWAP");
		SwapButton.addActionListener(this);
		// Set the color of the Swap button
		SwapButton.setBackground(Color.green);
		// Set font of the word "SWAP"
		SwapButton.setFont(new Font("Verdana", Font.BOLD, 25));

		// Specify component's grid location
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		//pixels of padding around Swap button
		layoutConst.insets = new Insets(10, 10, 10, 10);
		// Add Swap button to the frame
		add(SwapButton, layoutConst);
		
	}
	/**
	 * Method is automatically called when an event occurs
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == SwapButton) {
			JLabel temp = pic1;
			pic1 = pic2;
			pic2 = temp;

			// Specify component's grid location to swap
			layoutConst.gridx = 0;
			layoutConst.gridy = 2;
			// 10 pixels of padding around component
			layoutConst.insets = new Insets(10, 10, 10, 10);
			add(pic1,layoutConst);

			// Specify component's grid location to swap
			layoutConst.gridx = 2;
			layoutConst.gridy = 2;
			// 10 pixels of padding around component
			layoutConst.insets = new Insets(10, 10, 10, 10);
			add(pic2,layoutConst);

			// This line of code to update the frame
			validate();

		}
	}
}
