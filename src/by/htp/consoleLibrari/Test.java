package by.htp.consoleLibrari;

import by.htp.librari.*;

public class Test {
	public static void main(String[] args) {
		Console consol = new Console();

		Book book1 = new Book("C����� �������", "������ ������", 1900);
		Book book2 = new Book("50 ����������", "��� ��������", 1950);
		Book book3 = new Book("����", "������ �. C.", 1842);
		Book book4 = new Book("�������� ������", "���� �������", 1988);
		Book book5 = new Book("C����� �������", "������ ������", 1900);
		Magazin magazin1 = new Magazin("������ ��� �12", "������� �. �.", 2012);
		Magazin magazin2 = new Magazin("������ ��� �13", "������� �. �.", 2012);
		Magazin magazin3 = new Magazin("������ ��� �14", "������� �. �.", 2012);
		Magazin magazin4 = new Magazin("����� � 5", "������� �. �.", 2012);
		Magazin magazin5 = new Magazin("��������������� �1", "������� �. �.", 2013);
		
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
