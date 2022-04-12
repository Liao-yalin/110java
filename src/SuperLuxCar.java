class SuperLuxCar extends LuxCar {
	
	private Sound sound;
	
	public SuperLuxCar(int cc, String type) {
		super(cc, type);
		sound = new Sound();
	}
	public double getCost() {
		return eng.getCost() + aircond.getCost() + sound.getCost() + 10000;
	}
	public double getPrice() {
		 return (int)(1.2*(eng.getCost() + aircond.getCost() + sound.getCost() + 10000));
		 
	}
	public boolean isExpensive(LuxCar lc) {
		if(lc.getPrice()>=getPrice() ) {
			return false;
		}
		return true;
		}
	
}
