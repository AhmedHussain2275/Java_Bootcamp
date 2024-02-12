package oopExam;

public class Iphone2 extends Iphone1 {

	private char userOfIphone2;

	// default constructor

	public Iphone2() {
		super();
		this.userOfIphone2 = 'M';
	}

	// Parameterized constructor
	public Iphone2(int price, String info, char user, boolean madeInUSA, char userOfIphone2) {
		super(price, info, user, madeInUSA); // Using 'super' to call the parameterized constructor of Iphone1
		this.userOfIphone2 = userOfIphone2;
	}

	// Getter method for userOfIphone2
	public char getUserOfIphone2() {
		return userOfIphone2;
	}

	// Setter method for userOfIphone2
	public void setUserOfIphone2(char userOfIphone2) {
		this.userOfIphone2 = userOfIphone2;
	}

	// Void type method iPhone2Info
	public void iPhone2Info() {
		System.out.println("IPhone2 Information: Basic info method.");
	}

	// Parameterized method with the same name iPhone2Info
	public void iPhone2Info(String feature) {
		System.out.println("IPhone2 Feature Info: " + feature);
	}

	public void accessSuperVariable() {
		System.out.println("Accessing model identifier from Iphone1: " + super.modelIdentifier);
	}

	// Method related to Dropbox feature
	public void dropboxFeature() {
		System.out.println("Dropbox feature in IPhone2: Securely store and share files anywhere.");
	}

	public void cameraFeature() {
		// TODO Auto-generated method stub
		
	}

}
