package cn.qdu.edu.rentcar;

public class Car extends Vehicle {
	private String vehicleModel;

	public Car(String vehicleNumber) {
		super(vehicleNumber);
		// TODO Auto-generated constructor stub
	}

	public double charge(int day) {
		if (vehicleModel.equals("�������")) {
			setDayRate(600);

		} else if (vehicleModel.equals("����550i")) {
			setDayRate(500);
		} else if (vehicleModel.equals("���������")) {
			setDayRate(300);
		}
		return super.charge(day);
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
}
