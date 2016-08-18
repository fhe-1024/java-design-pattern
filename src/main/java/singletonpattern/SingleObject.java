package singletonpattern;

public class SingleObject {
	private static SingleObject instance = null;

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}

	public void sendMessage() {
		System.out.println("say something");
	}
}
