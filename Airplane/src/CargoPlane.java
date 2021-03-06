
public class CargoPlane extends Aircraft {
	
	private double maxpayload; // максимальная загрузка
	private double payload;    // загрузка самолета
	private double percentload; //загрузка самолета в процентах
	public double fuelrate; //расход топлива в час 
	
	public double getPercent() {
		
		percentload=(getPayload()/getMaxpayload())*100;
		
		return percentload;
	
	}

	public double getPayload() {
		return payload;
	}

	public void setPayload(double payload) {
		this.payload = payload;
	}

	public double getMaxpayload() {
		return maxpayload;
	}

	public void setMaxpayload(double maxpayload) {
		this.maxpayload = maxpayload;
	}
	

}
