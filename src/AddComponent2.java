import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author NguyenVu
 * @version 1.0
 *
 */
public class AddComponent2 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel picture;
	private JLabel carLabel;
	private JComboBox vehList2;
	/**
	 * Method to create the components for Second Sector
	 * @throws FileNotFoundException  Signals that an attempt to open the file
	 *                                denoted by a specified pathname has failed
	 * 						          on input error
	 * @throws IOException The exceptions produced by failed or interrupted I/O operations.
	 */
	public AddComponent2() throws FileNotFoundException, IOException {

		// Create the object of second drop box
		SecondDropBox obj2 = new SecondDropBox();
		// add the list vehicletwo to the combo box
		vehList2 = new JComboBox(obj2.getDropBox2());
		// set the default of choice at veh01
		vehList2.setSelectedIndex(0);
		// add the action to change images everytime the users click the box to choose the vehicle
		vehList2.addActionListener(this);


		// Create the image icon 
		ImageIcon icon2 = new ImageIcon("image/" +obj2.getDropBox2()[vehList2.getSelectedIndex()]+ ".jpg");
		
		// Set the image icon using JLabel
		picture =  new JLabel(icon2);
		// Add the size of picture
		picture.setPreferredSize(new Dimension(450, 350));
		// Make the black frame for picture
		picture.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));

		// Set the label "Choose the second car:"
		carLabel = new JLabel("Choose the second car:");
		carLabel.setFont(new Font("Verdana", Font.BOLD, 18));

	}
	/**
	 * Method is automatically called when an event occurs
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String vehID = (String)cb.getSelectedItem();
		picture.setIcon(new ImageIcon( new ImageIcon("image/" + vehID+ ".jpg").getImage().getScaledInstance(450, 350, Image.SCALE_SMOOTH)));
		
	}
	/**
	 * 
	 * @return The images in the Second Sector
	 */
	public JLabel getPicture2() {
		return picture;
	}
	/**
	 * 
	 * @return The car label for Second Sector
	 */
	public JLabel getCarLabel2() {
		return carLabel;
	}
	/**
	 * 
	 * @return The list of vehicle ID in the combo box 2
	 */
	public JComboBox getComboBox2() {
		return vehList2;
	}
}

