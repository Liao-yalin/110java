class Engine {
	
	 
	 private int cc;
	 private int cost;
	 
	 public Engine(int cc) {
		this.cc = cc;
		
	 }
	 public int getCost() {
		 if(cc == 1600) {
			 cost = 20000;
		}
		 if(cc == 2000) {
			 cost = 25000;
		 }
		return cost;
		
		
	 }
} 