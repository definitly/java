
public class PassengerPlane extends Aircraft {
	
	private int  passcapacity; // количество пассажиров в самолете
	private int seats; // количество мест в самолете
	private double payload; // загрузка самолета кг
	private double percentload; // загрузка самолета в процентах
	
	
	
	public double  getPercent () {
		   
		   percentload=(float)(getPasscapacity()/getSeats()*100);
				  
				return    percentload;
				
	}
 
	// вычеслим загрузку самолета в кг исходя 90 кг на пассажира вместе с вещами
	//
	//
    public double  getPayload() {
    	 payload=getPasscapacity()*900;
    	return payload;
    }
	
	
	
	public double getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getPasscapacity() {
		return passcapacity;
	}
	public void setPasscapacity(int passcapacity) {
		this.passcapacity = passcapacity;
	}
    





}

