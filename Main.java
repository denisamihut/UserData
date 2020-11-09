/*Tema nr 3:
Scrieti un program care construieste un formular similar cu cel din prima imagine, iar la apasarea 
butonului salveaza, goleste fereastra si afiseaza datele ca si in a doua imagine. 
Conditii: Formularul trebuie sa continia minim 1 text field, 1 radio button, 1 checkbox, 1 text box .*/
package nov04;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
	public static void main(String[] args) {    

		JFrame frame = new JFrame("Insert data:");
		frame.setSize(350, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();    
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);

		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setBounds(10,20,80,25);
		panel.add(lastNameLabel);

		JTextField lastNameText = new JTextField(20);
		lastNameText.setBounds(100,20,165,25);
		panel.add(lastNameText);

		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setBounds(10,50,80,25);
		panel.add(firstNameLabel);

		JTextField firstNameText = new JTextField(20);
		firstNameText.setBounds(100,50,165,25);
		panel.add(firstNameText);


		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(10,80,80,25);
		panel.add(ageLabel);

		JTextField ageText = new JTextField(20);
		ageText.setBounds(100,80,165,25);
		panel.add(ageText);


		JLabel genderLabel = new JLabel("Gender");
		genderLabel.setBounds(10,110,80,25);
		panel.add(genderLabel);

		JRadioButton radioButton1 = new JRadioButton("Male");
		radioButton1.setBounds(70,110,80,25);
		radioButton1.setSelected(true);
		panel.add(radioButton1);

		JRadioButton radioButton2 = new JRadioButton("Female");
		radioButton2.setBounds(150,110,80,25);
		radioButton2.setSelected(false);
		panel.add(radioButton2);

		
		JCheckBox checkBox = new JCheckBox("Married?");  
		checkBox.setBounds(10,130, 80,50); 
		panel.add(checkBox);


		JLabel addressLabel = new JLabel("Address");
		addressLabel.setBounds(10,180,80,25);
		panel.add(addressLabel);

		JTextField addressText = new JTextField(20);
		addressText.setBounds(80,180,185,130);
		addressText.setBorder(null);
		panel.add(addressText);


		JButton saveButton = new JButton("Save");
		saveButton.setBounds(150, 325, 80, 25);
		panel.add(saveButton);

		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame1 = new JFrame("Insert data:");
				frame1.setSize(350, 600);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);

				JPanel panel1 = new JPanel();    
				panel1.setLayout(null);
				frame1.add(panel1);

				JLabel lastNameLabel = new JLabel("Last name: "+lastNameText.getText());
				lastNameLabel.setBounds(10,20,130,25);
				panel1.add(lastNameLabel);
				lastNameText.setText("");

				JLabel firstNameLabel = new JLabel("First name: "+firstNameText.getText());
				firstNameLabel.setBounds(10,40,130,25);
				panel1.add(firstNameLabel);
				firstNameText.setText("");

				JLabel ageLabel = new JLabel("Age: "+ageText.getText());
				ageLabel.setBounds(10,60,130,25);
				panel1.add(ageLabel);
				ageText.setText("");

				String choice1;
				if (radioButton1.isSelected())
					choice1 = "Male\n";
							
				else
					choice1 = "Female\n";
					
				JLabel choice1Label = new JLabel("Gender "+choice1);
				choice1Label.setBounds(10,80,130,25);
				panel1.add(choice1Label);
				
				
				String choice2;
				if (checkBox.isSelected())
					choice2 = " Yes\n";
				else
					choice2 = " No\n";
				JLabel choice2Label = new JLabel("Married: "+choice2);
				choice2Label.setBounds(10,100,130,25);
				panel1.add(choice2Label);


				JLabel addressLabel = new JLabel("Address: "+addressText.getText());
				addressLabel.setBounds(10,120,130,25);
				panel1.add(addressLabel);
				addressText.setText("");
			}
		});

	}}        


	        
	    

	