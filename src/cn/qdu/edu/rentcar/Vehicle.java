package cn.qdu.edu.rentcar;

public class Vehicle {
	private String vehicleNumber;// ���ƺ�
	private int dayRate;// �����

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getDayRate() {
		return dayRate;
	}

	public void setDayRate(int dayRate) {
		this.dayRate = dayRate;
	}
//���캯�������Ƴ��ƺ�
	public Vehicle(String vehicleNumber){
		this.vehicleNumber = vehicleNumber;
	}
//�ܼƷ���
	public double charge(int day) {
		return day * dayRate;
	}
}
