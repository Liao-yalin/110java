public class Warehouse {
	
	  private static Car[] car;
	  private static int c = 0;
	
	public Warehouse(int c) {
		car = new Car[c];
	}

	 public static void addCar(Car newCar) {
		 car[c++] = newCar;
	 }

	public int getCapacity() {
		return car.length-c ;
	
	}
	public int getTotalCost() {
		int tc = 0;
		for(int i=0 ; i<c ; i++) {
			tc += car[i].getCost();
		}
		return tc;
	}
	public int getTotalPrice() {
		int tp = 0;
		for(int i=0 ; i<c ; i++) {
			tp += car[i].getPrice();
		}
		return tp;
	}
	

}