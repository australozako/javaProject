package fr.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		FruitClass fr = new FruitClass();
		fr.setEspece("Mange");
		fr.setVariete("Lipense");
		fr.setOrigin("Afrique Burkina faso");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mangoes");
		list.add("Papaya");
		list.add("Banana");
		list.add("Fraises");
		list.add("Pommes");
		list.add("Oranges");
		list.add("Grenadine");
		list.add("Passion");
		list.add("Goyave");
		System.out.println("---La lites des fruits--- du soleil ");
		for (String item : list) {
			System.out.println("Fruit: " + item);
		}

		System.out.println(fr.getEspece() + "--->" + fr.getVariete() + "---->"
				+ fr.getOrigin());
	}

}
