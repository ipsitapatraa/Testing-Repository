
package demoProgram;

public class A {

	public static void main(String[] args) {

		String name = "chrome";
		switch (name) {
		case "chrome":
			System.out.println("Launch chrome browser");
			break;

		case "firefox":
			System.out.println("Launch firefox browser");
			break;

		default:
			System.out.println("launch IE browser");
			break;
		}
	}

}//Launch chrome browser

