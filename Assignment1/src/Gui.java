import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//gui class for creating the gui, functionality not fully implemented
public class Gui  extends JFrame implements ActionListener{
	
	
	JTextArea  userInputTB = new JTextArea("user input here");//textArea takes in user input
	//buttons
	JButton encodeButton = new JButton("Encode");
	JButton decodeButton = new JButton("Decode");
	
	
	JTextArea displayOutputTB = new JTextArea("output message here");//output text area
	
	public Gui() {
		//panels for layout
		JPanel inputPanel = new JPanel();
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		JPanel outputPanel = new JPanel();
		
		JPanel panelHolder = new JPanel();
		
		panelHolder.setLayout(new GridLayout(3, 1));
		
		encodeButton.setBackground(Color.blue);
		decodeButton.setBackground(Color.blue);
		encodeButton.setForeground(Color.white);
		decodeButton.setForeground(Color.white);
		
		outputPanel.setBackground(Color.gray);
		encodeButton.addActionListener(this);
		decodeButton.addActionListener(this);
		
		inputPanel.add(userInputTB);
		outputPanel.add(displayOutputTB);
		//add items to panel and add panel to contentPane
		buttonPanel.add(encodeButton);
		buttonPanel.add(decodeButton);
		
		setContentPane(panelHolder);
		
		panelHolder.add(inputPanel);
		panelHolder.add(buttonPanel);
		panelHolder.add(outputPanel);
		
		//set properties for JFrame
		setLocation(100, 50);
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == encodeButton) {
			//should parse strng and make sure only valid input here
			 String charUserMessage = userInputTB.getText();
			// s = Main.encoding(charUserMessage);
			 
			   // displayOutputTB.setText(s); //display message to text box for user
		}
		
		/*
		 * 
		 * */
		
		else if(e.getSource() == decodeButton) {
			//should parse strng and make sure only valid input here
			 String binUserMessage = userInputTB.getText();
			 
			 //String s = Main.decoding(binUserMessage);
			 
			    //displayOutputTB.setText(s);//display message to text box for user
		}
	}
}
