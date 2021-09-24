package builder;

public class Test {

	public static void main(String[] args) {
		Component Casado = new Component("1","Casado",2500);
		Component Fresco = new Component("1","Fanta",1000);
		Component Papas = new Component("1","Papas Fritas",2000);
		
		Combo comp = new Combo.ComboBuilder().setMaindish(Casado)
				.addDrink(Fresco)
				.addSideDish(Papas)
				.build();
		System.out.println(comp);
	}

}
