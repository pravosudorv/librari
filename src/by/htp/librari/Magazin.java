package by.htp.librari;

public class Magazin extends PrintedEdit {

	private String redactor;

	public Magazin() {

	}

	public Magazin(String title, String redactor, int year) {
		super(year, title);
		this.redactor = redactor;
	}

	public String getRedactor() {
		return redactor;
	}

	public void setRedactor(String redactor) {
		this.redactor = redactor;
	}

	public void print() {
		System.out.println("ЖУРНАЛ Редактор: " + getRedactor() + " Название: " + getTitle() + " Год: " + getYear());
	}

}
