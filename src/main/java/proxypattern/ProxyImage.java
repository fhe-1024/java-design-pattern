package proxypattern;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
