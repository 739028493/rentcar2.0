package cn.qdu.edu.rentcar;

import java.util.Scanner;

public class RentSystem {
	public void rent() {
		Scanner input = new Scanner(System.in);

		System.out.println("*******欢迎进入租车系统*******");

		System.out.println("请选择租借车辆数目");
		
		double totalFee=0;//总费用
		int vehicleCount=0;//车辆数
		int key = 0;
		vehicleCount = input.nextInt();
		String[] models = new String[vehicleCount];//车型
		int[] rates = new int[vehicleCount];//数量
		double[] fees = new double[vehicleCount];//日租金
		int[] days = new int[vehicleCount];//天数
		int i=0;
		do{

			System.out.println("请选择车辆类型：1、轿车2、客车");
			key=input.nextInt();
			switch (key) {
			case 1:
				System.out.println("请选择轿车品牌：1、别克商务 2、宝马 550i 3、别克林荫大道");
				String carModels[]={"别克商务","宝马550i","别克林荫大道"};
				int sexl1=input.nextInt();
				System.out.println("请输入租借天数");
				int day = input.nextInt();
				int n = (int) ((Math.random() * 9 + 1) * 10000);
				Car choseModel = new Car("鲁A" + n);
				choseModel.setVehicleModel(carModels[sexl1-1]);
				double cTotalFee = choseModel.charge(day);

				System.out.println("您租借了：" + choseModel.getVehicleModel()+"  " + "车牌号是：" + choseModel.getVehicleNumber());
				System.out.println("日租金是：" + choseModel.getDayRate());
				System.out.println("租借天数：" + day);
				System.out.println("费用：" + cTotalFee);
				models[i] = choseModel.getVehicleModel() +"  "+ "车牌号是：" + choseModel.getVehicleNumber();
				rates[i] = choseModel.getDayRate();
				fees[i] = cTotalFee;
				days[i] = day;
				i++;
				break;
			case 2:
				System.out.println("请选择所租借的客车座位数1、<=16座 2、>16座");
				int seatNumber[]= {10,18};
				int sexl=input.nextInt();
				System.out.println("请输入租借天数");
				int day1 = input.nextInt();
				int m = (int) ((Math.random() * 9 + 1) * 10000);
				PassgerCar choseSeat = new PassgerCar("鲁B" + m);
				choseSeat.setSeatNumber(seatNumber[sexl-1]);
				double pTotalFee = choseSeat.charge(day1);

				System.out.println("您租借了客车  " + "车牌号是：" + choseSeat.getVehicleNumber());
				System.out.println("日租金是：" + choseSeat.getDayRate());
				System.out.println("租借天数：" + day1);
				System.out.println("费用：" + pTotalFee);
				models[i] = "客车  车牌号是：" + choseSeat.getVehicleNumber();
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
			System.out.print("您租借了"+models[j]+"  ");
			System.out.print("日租金是:"+rates[j]+"  ");
			System.out.print("租借天数："+days[j]+"  ");
			System.out.println("费用："+fees[j]);
			totalFee=totalFee+fees[j];
		}
		System.out.println("总计费用："+totalFee);
		input.close();
	}

	public void result() {

		System.out.println("谢谢使用租车系统！欢迎下次光临");
	}

	public static void main(String[] args) {
		RentSystem system = new RentSystem();
		system.rent();
		system.result();
		
	}
}
