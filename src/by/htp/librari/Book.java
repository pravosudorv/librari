package by.htp.librari;

public class Book extends PrintedEdit {
	private String autor;

	public Book() {

	}

	public Book(String title, String autor, int year) {
		super(year, title);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void print() {
		System.out.println("КНИГА Автор: " + getAutor() + " Название: " + getTitle() + " Год: " + getYear());
	}

}
