package builderpattern;

import builderpattern.iFood.Item;
import builderpattern.iFood.Packing;

public abstract class Burger implements Item {

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	public abstract float price();

}
