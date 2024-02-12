package oopExam;

/* 
Abstract Class Explanation:
An abstract class in Java is a class that cannot be instantiated, which means you cannot create an object of 
an abstract class. However, it can be subclassed. In an abstract class, you can declare fields that are not static
 and final, and define public, protected, and private concrete methods. An abstract class can have both 
 abstract and non-abstract methods.
*/

public abstract class AppleWatch implements Watch, DigitalWatch {

	protected String model;

	public AppleWatch(String model) {
		this.model = model;
	}

	public void abstractClassInfo() {
		System.out.println("Abstract classes can have both abstract and non-abstract methods. "
				+ "They cannot be instantiated directly and must be extended. "
				+ "They can contain constructors and variables. "
				+ "Unlike interfaces, they can provide some implementation details.");
	}

	public abstract void appleWatchInfo();

}
