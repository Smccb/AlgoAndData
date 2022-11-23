import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Gui  extends JFrame implements ActionListener{
	
	
	JTextArea  userInputTB = new JTextArea("user input here");
	JButton encodeButton = new JButton("Encode");
	JButton decodeButton = new JButton("Decode");
	JTextArea displayOutputTB = new JTextArea("output message here");
	
	public Gui() {
		JPanel inputPanel = new JPanel();
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		JPanel outputPanel = new JPanel();
		
		JPanel panelHolder = new JPanel();
		
		panelHolder.setLayout(new GridLayout(3, 1));
		
		
		
		encodeButton.addActionListener(this);
		decodeButton.addActionListener(this);
		
		
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
			
		}
		else if(e.getSource() == decodeButton) {
			
		}
	}
}
