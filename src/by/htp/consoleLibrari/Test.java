package by.htp.consoleLibrari;

import by.htp.librari.*;

public class Test {
	public static void main(String[] args) {
		Console consol = new Console();

		Book book1 = new Book("Cказка колобок", "Каренй Агеичь", 1900);
		Book book2 = new Book("50 спартанцев", "Пол Андерсон", 1950);
		Book book3 = new Book("Дюна", "Пушкин А. C.", 1842);
		Book book4 = new Book("Королева солнца", "Гари Гарисон", 1988);
		Book book5 = new Book("Cказка колобок", "Каренй Агеичь", 1900);
		Magazin magazin1 = new Magazin("Сделай сам №12", "Борисов Ф. И.", 2012);
		Magazin magazin2 = new Magazin("Сделай сам №13", "Борисов Ф. И.", 2012);
		Magazin magazin3 = new Magazin("Сделай сам №14", "Борисов Ф. И.", 2012);
		Magazin magazin4 = new Magazin("Охота № 5", "Борисов Ф. И.", 2012);
		Magazin magazin5 = new Magazin("Железнодорожник №1", "Шкрабов С. В.", 2013);
		
		consol.lib.add(book1);
		consol.lib.add(book2);
		consol.lib.add(book3);
		consol.lib.add(book4);
		consol.lib.add(book5);
		consol.lib.add(magazin1);
		consol.lib.add(magazin2);
		consol.lib.add(magazin3);
		consol.lib.add(magazin4);
		consol.lib.add(magazin5);
		
		while(true) {
		consol.rabotaConsole();
		if(consol.textComand.equals("exit")){
			return;
		}
		}
	}
}
