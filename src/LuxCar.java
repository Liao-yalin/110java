public class LuxCar extends Car{
	protected Engine eng;
	protected Aircond aircond;
	public LuxCar(int cc, String type) {
		eng = new Engine(cc);
		aircond = new Aircond(type);
	}
	
	public double getCost() {
		return eng.getCost() + aircond.getCost() + 10000;
	}
	public double getPrice() {
		 return (int)(1.2*(eng.getCost() + aircond.getCost() + 10000));
		 
	}
}
