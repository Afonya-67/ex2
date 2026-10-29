

class Reader {

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public int getNumberT() {
		return numberT;
	}

	public void setNumberT(int numberT) {
		this.numberT = numberT;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	private String f;
	private int numberT;
	private String faculty;
	private String hp;
	private String t;

	public Reader(String f, int numberT, String faculty, String hp, String t) {
		this.f = f;
		this.numberT = numberT;
		this.faculty = faculty;
		this.hp = hp;
		this.t = t;
	}

	private String wordEnd(int clv) {
		int mod10 = clv % 10, mod100 = clv % 100;
		if (mod10 == 1 && mod100 != 11)
			return " книгу";
		if (mod10 >= 2 && mod10 <= 4 && (mod100 < 12 || mod100 > 14))
			return " книги";
		return " книг";
	}

	public void takeBook(int clv) {
		System.out.println(f + " взял " + clv + wordEnd(clv));
	}

	public void takeBook(String... name) {
		System.out.println(f + " взял " + (name.length == 1 ? "книгу" : "книги") + ": " + String.join(", ", name));
	}

	public void returnBook(int clv) {
		System.out.println(f + " вернул " + clv + wordEnd(clv));
	}

	public void returnBook(String... name) {
		System.out.println(f + " вернул книги: " + String.join(", ", name));
	}
}

public class ex2 {


	public static void main(String[] args) {
		Reader[] reader = new Reader[5];
		reader[0] = new Reader("Авдеев А. Д.", 2001, "факультет", "11.01.2001", "+7-777-77-77-77");
		reader[1] = new Reader("Иванов Б. Т.", 2001, "факультет", "11.01.2001", "+7-777-77-77-77");
		reader[2] = new Reader("Петров В. В.", 2001, "факультет", "11.01.2001", "+7-777-77-77-77");
		reader[3] = new Reader("Савельев Г. Г.", 2001, "факультет", "11.01.2001", "+7-777-77-77-77");
		reader[4] = new Reader("Смолин Д. Р.", 2001, "факультет", "11.01.2001", "+7-777-77-77-77");

		reader[0].takeBook(3);
		reader[0].takeBook("Приключения", "Словарь", "Энциклопедия");

		reader[1].takeBook(1);
		reader[1].takeBook("Война и мир");

		reader[2].takeBook(2);
		reader[2].takeBook("Java. Полное руководство", "Алгоритмы");

		reader[3].takeBook(1);
		reader[3].takeBook("Java. Паспорт на холодильник");

		reader[4].takeBook(1);
		reader[4].takeBook("Java. сборник мемов");

		reader[0].returnBook(3);
		reader[0].returnBook("Приключения", "Словарь", "Энциклопедия");

		reader[1].returnBook(1);
		reader[1].returnBook("Война и мир");

		reader[2].returnBook(2);
		reader[2].returnBook("Java. Полное руководство", "Алгоритмы");
		reader[3].returnBook(1);
		reader[3].returnBook("Java. Паспорт на холодильник");

		reader[4].returnBook(1);
		reader[4].returnBook("Java. сборник мемов");

	}

}
