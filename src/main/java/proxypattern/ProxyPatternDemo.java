package proxypattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("my.img");
		image.display();
		image.display();
	}

}
