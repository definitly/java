import java.awt.EventQueue;




public class Airplane {

	public static void main(String[] args) {
	
//	System.out.println( GetDistance.getDist(53.393055555556, 58.755555555556,55.3,61.5));
//        System.out.println( GetDistance.getAzimut(53.393055555556, 58.755555555556,55.3,61.5));
//        GetDistance.DesPoint(53.393055555556, 58.755555555556,276, 38.88387285670111);
   	
	
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				TestFrame.createGUI();
				
			}
		});
	}
}

   

	 
