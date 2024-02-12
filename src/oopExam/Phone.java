package oopExam;

public interface Phone extends Pager, Wakitoki {
	/*
	 * Features of Interface: - Interfaces can only have abstract methods (Java 7
	 * and before) and default, static methods (Java 8 onwards). - They cannot have
	 * instance fields (only static and final constants). - Interfaces support
	 * multiple inheritance, allowing a class to implement multiple interfaces. -
	 * Interfaces define a contract that implementing classes must adhere to.
	 * 
	 * Variables and Constructors in Interface: - Interfaces cannot have
	 * constructors as they cannot be instantiated. - All variables in an interface
	 * are public, static, and final by default.
	 */

	void interfaceInfo();

	void call();

	void message();

	void camera();

	// Default methods in interface (Java 8+)
	default void battery() {
		System.out.println(
				"Battery is a default method from Java 8, showcasing interface evolution without breaking implementing classes.");
	}

	default void wireless() {
		System.out.println("Wireless method provides specifications for wireless communication in devices.");
	}
}
