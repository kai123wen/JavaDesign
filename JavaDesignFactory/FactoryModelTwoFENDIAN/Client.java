package FactoryModelTwoFENDIAN;

public class Client {
	public static void main(String[] args) {
		FendianRoujimoBEIJING beijing = new FendianRoujimoBEIJING();
		FendiaoRoujiamoXIAN xian = new FendiaoRoujiamoXIAN();
		beijing.sellRoujiamo("BEIJINGla");
		xian.sellRoujiamo("XIANsuan");
	}   
}
