package builderpattern;

import builderpattern.iFood.Item;
import builderpattern.iFood.Packing;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();

}
