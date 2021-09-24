/**
 * 
 */
package builder;

import java.util.ArrayList;

import builder.Combo.ComboBuilder;


/**
 * @author Joshua
 *
 */
public class Combo {
	private Component Maindish;
	private ArrayList<Component> Drink;
	private ArrayList<Component> SideDish;
	
	
	private Combo(Component maindish, ArrayList<Component> drink, ArrayList<Component> sideDish) {
		super();
		Maindish = maindish;
		Drink = drink;
		SideDish = sideDish;
	}

	public Combo( ) {
		
	}

	public void addExtraSide(Component sideDish) {
		SideDish.add(sideDish);
	}
	
	public void addExtraDrink(Component drink) {
		Drink.add(drink);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Combo [Maindish=" + Maindish + ", Drink=" + Drink + ", SideDish=" + SideDish + "]";
	}




	public static class ComboBuilder implements Ibuilder<Combo>{
		
		
		private Component Maindish;
		private final ArrayList<Component> Drinks = new ArrayList<>();
		private final ArrayList<Component> SideDishes = new ArrayList<>();
		
		public ComboBuilder(){ }

		public ComboBuilder setMaindish(Component maindish) {
			Maindish = maindish;
			return this;
		}


		public ComboBuilder addDrink(Component drink) {
			Drinks.add(drink);
			return this;
		}


		public ComboBuilder addSideDish(Component sideDish) {
			SideDishes.add(sideDish);
			return this;
		}


		@Override
		public Combo build() {
			return new Combo(Maindish, Drinks, SideDishes);
			
		}

	}

}

