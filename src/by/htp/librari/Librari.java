package by.htp.librari;

public class Librari {
	private PrintedEdit[] librari = new PrintedEdit[50];
	private int index = 0;
	private String[] masSearch = new String[10];
	private int indexSearch = 0;

	public void add(Book book) {
		init();
		librari[index] = book;
		index++;
	}

	public void add(Magazin magazin) {
		init();
		librari[index] = magazin;
		index++;
	}

	private void init() {

		if (index == librari.length - 1) {
			PrintedEdit[] librariNew = new PrintedEdit[librari.length + 20];
			clone(librariNew);
			librari = librariNew;
		}
	}

	public void del(String title) {
		int index = poiskTitle(title);
		sdvig(index);
	}

	public void addSearch(String text) {
		masSearch[indexSearch] = text;
		indexSearch++;
	}

	public void addSearchPoisk() {
		for (int i = 0; i < indexSearch; i++) {
			search(masSearch[i]);
		}
		indexSearch = 0;
	}

	public void search(String text) {
		int mas[] = poiskAutor(text);
		if (mas[0] == -1) {
			System.out.println(text + " Такого автора нет");
			return;
		}
		for (int i = 0; mas[i] != 0 || i == 0; i++) {
			librari[mas[i]].print();
		}
	}

	public void clone(PrintedEdit[] librariNew) {
		for (int i = 0; i < librari.length; i++) {
			librariNew[i] = librari[i];
		}
	}

	public int poiskTitle(String title) {
		int i;
		for (i = 0; i < index; i++) {
			if (librari[i].getTitle().equals(title)) {
				break;
			}
			if (i == index - 1) {
				i = -1;
			}
		}
		return i;
	}

	public int[] poiskAutor(String text) {
		int[] mas = new int[index + 1];
		int j = 0;

		for (int i = 0; i < index; i++) {

			if (librari[i] instanceof Book) {
				Book book = (Book) librari[i];
				if (perebor(book.getAutor(), text)) {
					mas[j] = i;
					j++;
				}
			} else {
				if (librari[i] instanceof Magazin) {
					Magazin magazin = (Magazin) librari[i];
					if (perebor(magazin.getRedactor(), text)) {
						mas[j] = i;
						j++;
					}
				}
			}
		}
		if (j == 0) {
			mas[0] = -1;
		}
		return mas;
	}

	public boolean perebor(String autor, String text) {
		String[] name = autor.split(" ");
		String chastName = "";
		for (int i = 0; i < text.length() & i < name[0].length(); i++) {
			chastName += name[0].charAt(i);
		}
		if (chastName.equals(text)) {
			return true;
		} else {
			return false;
		}
	}

	public void sdvig(int j) {
		for (int i = j; i < index - 1; i++) {
			librari[i] = librari[i + 1];
		}
		librari[index] = null;
		index--;
	}

	public void sort() {
		PrintedEdit temp;

		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index; j++) {
				if (librari[i].getYear() < librari[j].getYear()) {
					temp = librari[i];
					librari[i] = librari[j];
					librari[j] = temp;
				}
			}
		}
	}

	public void print(int index) {
		librari[index].print();
	}

	public void printAll() {
		for (int i = 0; i < index; i++) {
			librari[i].print();
		}
	}

}
