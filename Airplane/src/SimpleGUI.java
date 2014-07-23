import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
	private JButton button = new JButton("Press");
	private JTextField input = new JTextField("", 5);
	private JLabel label = new JLabel("Input:");
	private JTextField input2 = new JTextField("", 5);
	private JLabel label2 = new JLabel("Input:");
	private JTextField input3 = new JTextField("", 5);
	private JLabel label3 = new JLabel("Input:");
	private JTextField input4 = new JTextField("", 5);
	private JLabel label4 = new JLabel("Input:");
	
	private JCheckBox check = new JCheckBox("Check", false);

	public SimpleGUI() {
		super("Simple Example");
	    this.setBounds(100,100,250,100);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(5,2,2,2));
	    container.add(label);
	    container.add(input);
	    container.add(label2);
	    container.add(input2);
	    container.add(label3);
	    container.add(input3);
	    container.add(label4);
	    container.add(input4);
	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}

	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double str = Double.parseDouble( input.getText());
	    	double str2 =Double.parseDouble( input2.getText());
	    	double str3 = Double.parseDouble(input3.getText());
	    	double str4= Double.parseDouble(input4.getText());
	    	
	    	GetDistance.getDist(str, str2, str3, str4);
	    	System.out.println(GetDistance.getDist(str, str2, str3, str4));
	    	
		}
	}
}
