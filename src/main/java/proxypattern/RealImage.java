package proxypattern;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display:" + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
