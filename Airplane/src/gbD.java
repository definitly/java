
public class gbD {
	
	
	static public void getD (double lat1, double lon1 ,double lat2 , double lon2 ) {
		
		int dist , azim;
		
	dist= (int) GetDistance.getDist( lat1, lon1 , lat2 ,lon2 );
	System.out.println(dist);
	azim= (int) GetDistance.getAzimut(lat1, lon1 , lat2 ,lon2);
	System.out.println(azim);
		
    brakeDistance.brake(lat1, lon1, dist, azim);
		
		
	}

}