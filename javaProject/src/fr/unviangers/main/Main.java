package fr.unviangers.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
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

		for (String item : list) {
			System.out.println("Fruit: " + item);
		}

	}

}
