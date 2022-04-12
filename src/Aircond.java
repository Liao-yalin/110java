 class Aircond {	
		private String type;
		private int cost;
		
		public Aircond(String type) {
			this.type = type;			
		}
		public int getCost() {
			if(type == "auto") {
				cost = 12000;
			}
			if(type == "manual") {
				cost = 10000;
			}
			return cost;
		}
		
}
