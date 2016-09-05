package iteratorpattern;

public class NameRepository implements Container {

	public String names[] = { "Robert", "John", "Julie", "Lora" };

	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < names.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}

}
