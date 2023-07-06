//assignment 8 

public class Yearlyservice {
	public static final double serviceCharges=100;
	public static double yearlyService() {
		return serviceCharges;
	}
	public static double yearlyService(double oilChangePrice) {
		return serviceCharges+oilChangePrice;
	}
	public static double yearlyService(double oilChangePrice,double tyreRotation) {
		return serviceCharges+oilChangePrice+tyreRotation;
	}
	public static double yearlyService(double oilChangePrice,double tyreRotation,double coupn) {
		return (serviceCharges+oilChangePrice+tyreRotation)-coupn;
	}
	public static void main(String[] args) {
		System.out.println(yearlyService());
		System.out.println(yearlyService(30));
		System.out.println(yearlyService(30,10));
		System.out.println(yearlyService(30,10,10));
	}
}