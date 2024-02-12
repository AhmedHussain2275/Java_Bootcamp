package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		// Instantiate Iphone1 and set its properties
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("First generation iPhone");
		iphone1.setUser('M'); // Assuming 'M' for Male
		iphone1.setMadeInUSA(false);

		// Print out the details using getters
		System.out.println("I bought this phone in 2000, the price was " + iphone1.getPrice() + "$, user's sex: "
				+ iphone1.getUser() + " and boolean value for made in USA is: " + iphone1.isMadeInUSA() + ".");

		// Call methods from Iphone1
		iphone1.interfaceInfo();
		iphone1.regularClassInfo();
		iphone1.youtubeFeature();

		// Instantiate Iphone6 and demonstrate method calling
		Iphone6 iphone6 = new Iphone6();

		// Call methods specific to Iphone6
		iphone6.compassFeature(); // Call the compass feature specific to Iphone6
		System.out.println("Materials cost (RAM and Camera): " + iphone6.materials(200, 300));
		System.out.println("Materials cost (RAM, Camera, and Processor): " + iphone6.materials(200, 300, "500"));
		iphone6.cameraFeature(); // Overridden method in Iphone6

		// Hierarchical Inheritance: Iphone3 and Iphone4 both extend Iphone1 (either directly or through a chain of classes).
		// Multilevel Inheritance: Iphone6 extends Iphone5, which extends Iphone4, and so on, up to Iphone1.
		// Single Inheritance: Iphone2 directly extends Iphone1, and there are no intermediate classes.
	}

}
