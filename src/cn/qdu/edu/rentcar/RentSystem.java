package cn.qdu.edu.rentcar;

import java.util.Scanner;

public class RentSystem {
	public void rent() {
		Scanner input = new Scanner(System.in);

		System.out.println("*******��ӭ�����⳵ϵͳ*******");

		System.out.println("��ѡ����賵����Ŀ");
		
		double totalFee=0;//�ܷ���
		int vehicleCount=0;//������
		int key = 0;
		vehicleCount = input.nextInt();
		String[] models = new String[vehicleCount];//����
		int[] rates = new int[vehicleCount];//����
		double[] fees = new double[vehicleCount];//�����
		int[] days = new int[vehicleCount];//����
		int i=0;
		do{

			System.out.println("��ѡ�������ͣ�1���γ�2���ͳ�");
			key=input.nextInt();
			switch (key) {
			case 1:
				System.out.println("��ѡ��γ�Ʒ�ƣ�1��������� 2������ 550i 3�����������");
				String carModels[]={"�������","����550i","���������"};
				int sexl1=input.nextInt();
				System.out.println("�������������");
				int day = input.nextInt();
				int n = (int) ((Math.random() * 9 + 1) * 10000);
				Car choseModel = new Car("³A" + n);
				choseModel.setVehicleModel(carModels[sexl1-1]);
				double cTotalFee = choseModel.charge(day);

				System.out.println("������ˣ�" + choseModel.getVehicleModel()+"  " + "���ƺ��ǣ�" + choseModel.getVehicleNumber());
				System.out.println("������ǣ�" + choseModel.getDayRate());
				System.out.println("���������" + day);
				System.out.println("���ã�" + cTotalFee);
				models[i] = choseModel.getVehicleModel() +"  "+ "���ƺ��ǣ�" + choseModel.getVehicleNumber();
				rates[i] = choseModel.getDayRate();
				fees[i] = cTotalFee;
				days[i] = day;
				i++;
				break;
			case 2:
				System.out.println("��ѡ�������Ŀͳ���λ��1��<=16�� 2��>16��");
				int seatNumber[]= {10,18};
				int sexl=input.nextInt();
				System.out.println("�������������");
				int day1 = input.nextInt();
				int m = (int) ((Math.random() * 9 + 1) * 10000);
				PassgerCar choseSeat = new PassgerCar("³B" + m);
				choseSeat.setSeatNumber(seatNumber[sexl-1]);
				double pTotalFee = choseSeat.charge(day1);

				System.out.println("������˿ͳ�  " + "���ƺ��ǣ�" + choseSeat.getVehicleNumber());
				System.out.println("������ǣ�" + choseSeat.getDayRate());
				System.out.println("���������" + day1);
				System.out.println("���ã�" + pTotalFee);
				models[i] = "�ͳ�  ���ƺ��ǣ�" + choseSeat.getVehicleNumber();
				rates[i] = choseSeat.getDayRate();
				fees[i] = pTotalFee;
				days[i] = day1;
				i++;
				break;

			default:
				break;
			}
		}while(i<models.length);
		for (int j= 0; j < vehicleCount; j++) {
			System.out.print("�������"+models[j]+"  ");
			System.out.print("�������:"+rates[j]+"  ");
			System.out.print("���������"+days[j]+"  ");
			System.out.println("���ã�"+fees[j]);
			totalFee=totalFee+fees[j];
		}
		System.out.println("�ܼƷ��ã�"+totalFee);
		input.close();
	}

	public void result() {

		System.out.println("ллʹ���⳵ϵͳ����ӭ�´ι���");
	}

	public static void main(String[] args) {
		RentSystem system = new RentSystem();
		system.rent();
		system.result();
		
	}
}
