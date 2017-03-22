package by.htp.librari;

public abstract class PrintedEdit {

	private int year;
	private String title;

	public PrintedEdit() {
		// super(); // коестурктор обджукта;
	}

	public PrintedEdit(int year, String title) {
		this.year = year;
		this.title = title;

	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void print();

}
