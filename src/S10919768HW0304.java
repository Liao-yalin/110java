import java.util.Scanner;
public class S10919768HW0304 {
	 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 Warehouse wh = new Warehouse(100);

	 while (sc != null && sc.hasNextLine()) {
	 String[] carInfo = sc.nextLine().split(" ");

	 if(carInfo.length == 0) continue;
	 char model = (carInfo[0].length( ) == 0) ? 'X' : carInfo[0].charAt(0);

	 if (model == 'X') break;
	 int cc = Integer.parseInt(carInfo[1]);
	 String aircond = carInfo[2];
	 switch (model) {
	 case 'B':
		 Warehouse.addCar(new BasicCar(cc,aircond));
		 break;
	 case 'L':
		 Warehouse.addCar(new LuxCar(cc,aircond));
		 break;
	 case 'S':
		 Warehouse.addCar(new SuperLuxCar(cc,aircond));
		 break;
	 	}
	 }
	 System.out.println("Total cost: " + wh.getTotalCost());
	 System.out.println("Total price: " + wh.getTotalPrice());
	 System.out.println("Available capacity: " + wh.getCapacity());
	 }
}
/*
B 1600 manual
L 2000 auto
S 2000 auto
X
*/