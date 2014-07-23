import java.awt.EventQueue;




public class Airplane {

	public static void main(String[] args) {
	
		
	
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				TestFrame.createGUI();
				
			}
		});
	}
}

   

	 
