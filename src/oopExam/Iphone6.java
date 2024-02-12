package oopExam;

public class Iphone6 extends Iphone5 {

	/*
	 * Method Overloading and Overriding: - Method overloading is when multiple
	 * methods have the same name but different parameters within the same class. -
	 * Method overriding is when a subclass has a method with the same name and
	 * parameters as a method in its superclass, providing a specific
	 * implementation.
	 * 
	 * In Iphone6, we can use method overloading by creating multiple 'materials'
	 * methods with different parameters. We can override methods from Iphone1 to
	 * Iphone5 to provide specific implementations for Iphone6.
	 */

	// Example of method overloading
	public int materials(int ramPrice, int cameraPrice) {
		return ramPrice + cameraPrice;
	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int processorPriceInt = Integer.parseInt(processorPrice.replaceAll("[^\\d]", ""));
		return ramPrice + cameraPrice + processorPriceInt;
	}

	// Example of overriding
	@Override
	public void cameraFeature() {
		System.out.println("Iphone6 camera feature includes improved pixel density and low-light performance.");
	}

	// Specific feature of Iphone6
	public void compassFeature() {
		System.out.println("Compass feature in Iphone6 helps with navigation and location-based services.");
	}

}
