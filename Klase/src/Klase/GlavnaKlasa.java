package Klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Person p = new Person();
		Person p1 = new Person("Vladimir", "Jovanovic", 1990);
		
		String ime = "Zoran";
		String prezime = "Zoranic";
		
		p.pozdravSvete();
		p.pozdrav(p1.ime, p1.prezime);
		
		
		
	}

}
