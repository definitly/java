

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public  class TestFrame    {
     
static   private JTextField textField,textField2,textField3,textField4;
	
public static void createGUI() {
	 JFrame jf = new JFrame(); 
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     jf.setSize(400, 300); 
     jf.setVisible(true); 

     // создаем  панель. 
     JPanel p = new JPanel(); 
     jf.add(p); 
     Container content = jf.getContentPane();
     // к панели добавляем менеджер FlowLayout. 
    //p.setLayout(new FlowLayout()); 
    // p.setLayout(new GridLayout(3,3)); 
    // p.setLayout(new BorderLayout()); 
     // к панели добавляем кнопки. 
     JButton button =new JButton("start 2"); 
     p.add(button);
     JLabel label = new JLabel("Input:");
     p.add(label,BorderLayout.WEST);
     textField =   new JTextField(20);
     p.add(textField,BorderLayout.CENTER);
     content.add(label);
	 content.add(textField );
     
     
     JLabel label2 = new JLabel("Input2:");
     p.add(label2,BorderLayout.WEST);
     textField2 =   new JTextField(20);
     p.add(textField2);
     JLabel label3 = new JLabel("Input3:");
     p.add(label3,BorderLayout.WEST);
     textField3=   new JTextField(20);
     p.add(textField3);
     JLabel label4 = new JLabel("Input4:");
     p.add(label4,BorderLayout.WEST);
     textField4 =   new JTextField(20);
     p.add(textField4);
    
    	 
    	 
    
 
button.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent arg0) {
    	double str = Double.parseDouble( textField.getText());
    	double str2 =Double.parseDouble( textField2.getText());
    	double str3 = Double.parseDouble(textField3.getText());
    	double str4= Double.parseDouble(textField4.getText());
    	
    	GetDistance.getDist(str, str2, str3, str4);
    	System.out.println(GetDistance.getDist(str, str2, str3, str4));
    	
       
    }
});
}

}





