package sample;

public class SingletonInJava {

	private static SingletonInJava sobject = null;
	private String name = "Rahul";

	// For singleton need to use private constructor
	private SingletonInJava() {

	}

	// Get Instance method which will restrict making multiple instances
	public static SingletonInJava getInstance() {
		if (sobject == null) {
			sobject = new SingletonInJava();
		}
		return sobject;
	}

	//public method can be access from outside
	public String getName(SingletonInJava sobject) {
		this.sobject = sobject;
		return sobject.name;
	}

	public static void main(String[] args) {
		SingletonInJava myObject = SingletonInJava.getInstance();
		System.out.println(myObject.getName(myObject));
	}

}
