package by.htp.consoleLibrari;

import java.util.Scanner;
import by.htp.librari.*;

public class Console {
	private static Scanner sc;
	String text;
	String textComand;
	String[] spisokComand = new String[] { "addBook", "addMagazin", "del", "search", "vuvodSort", "vuvod", "exit" };
	Librari lib = new Librari();

	public String getText() {
		return text;
	}

	public String getTextComand() {
		return textComand;
	}

	public void rabotaConsole() {
		
		System.out.println("cписок команд: addBook,  addMagazin, del, vuvod, vuvodSort, search  ");
		System.out.println("Введите команду: ");

		while (proverComand()) {
			System.out.println("Неверная команда");
		}
		vuborComand();
	}

	public void scannComand() {
		sc = new Scanner(System.in);
		textComand = sc.next();
	}

	public String scann() {
		sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}

	private int scannInt() {
		sc = new Scanner(System.in);
		int n;
		while (true) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				return n;
			} else {
				sc.next();
				System.out.println("год введен неправильно ");
			}
		}
	}

	public boolean proverComand() {
		scannComand();
		for (String text : spisokComand) {
			if (text.equals(textComand)) {
				return false;
			}
		}
		return true;
	}

	public void vuborComand() {
		switch (textComand) {
		case "addBook":
			addBook();
			break;
		case "addMagazin":
			addMagazin();
			break;
		case "del":
			System.out.println("Ведите название для удаления: ")
			lib.del(scann());
			break;
		case "search":
			text = scann();
			searchProverka();
			lib.addSearchPoisk();
			break;
		case "vuvodSort":
			lib.sort();
			lib.printAll();
			break;
		case "vuvod":
			lib.printAll();
			break;

		}
	}

	public void addBook() {
		Book book = new Book();
		System.out.println("Ведите название книги: ");
		book.setTitle(scann());
		System.out.println("Ведите название aвтора: ");
		book.setAutor(scann());
		System.out.println("Ведите год издания: ");
		book.setYear(scannInt());
		lib.add(book);
	}

	public void addMagazin() {
		Magazin magazin = new Magazin();
		System.out.println("Ведите название книги: ");
		magazin.setTitle(scann());
		System.out.println("Ведите название aвтора: ");
		magazin.setRedactor(scann());
		System.out.println("Ведите год издания: ");
		magazin.setYear(scannInt());
		lib.add(magazin);
	}

	public void searchProverka() {
		String[] name = text.split("/");
		for (String s : name) {
			lib.addSearch(s);
		}
	}

}
