package mediatorpattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("RObert");
		User john = new User("John");
		robert.sendMessage("Hi!John!");
		john.sendMessage("Hello!Robert!");
	}

}
