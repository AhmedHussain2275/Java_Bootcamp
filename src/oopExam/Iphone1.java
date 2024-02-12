package oopExam;

public class Iphone1 implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;

	public String modelIdentifier = "Iphone1";

	// Default constructor
	public Iphone1() {

	}

	// Parameterized constructor
	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void interfaceInfo() {
		System.out.println("Interface Info: Phone interface implementation in Iphone1.");

	}

	// Method comparing regular class features with Interface and Abstract class
	public void regularClassInfo() {
		System.out.println(
				"Regular classes can have constructors, both static and instance methods, and instance fields. "
						+ "They can be instantiated to create objects. Unlike interfaces, they do not support multiple inheritance directly, "
						+ "but they can implement multiple interfaces. Unlike abstract classes, all methods in a regular class are assumed to be implemented.");
	}

	// Method related to YouTube feature
	public void youtubeFeature() {
		System.out.println(
				"The YouTube feature allows users to watch, like, share, and comment on videos, and subscribe to channels.");
	}

	// Getter and setter methods to access the private variables
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void sendPage(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transmitSignal() {
		// TODO Auto-generated method stub

	}

}
