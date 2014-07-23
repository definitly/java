import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class ButtonActionListener implements ActionListener  {
	JTextField textField;
	@Override
	public void actionPerformed(ActionEvent e) {
	
		System.out.println("fsd");
		String str = textField.getText();
    	System.out.println(str);
	}
	

}
