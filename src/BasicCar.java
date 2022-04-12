public class BasicCar extends Car{
	private Engine eng;
	private Aircond aircond;
	
	public BasicCar(int cc, String type) {
		eng = new Engine(cc);
		aircond = new Aircond(type);
	}
	
	public double getCost() {
		return eng.getCost() + aircond.getCost() + 5000;
	}
	public double getPrice() {
		 return (int)(1.2*(eng.getCost() + aircond.getCost() + 5000));
		 
	}
	
}
