
public class Main {

	public static void main(String[] args) {
		
		Rennschnecke s1 = new Rennschnecke("Hasi", "Glitscho", 3);
		Rennschnecke s2 = new Rennschnecke("Baerchen", "Rasanto", 5);
		Rennschnecke s3 = new Rennschnecke("Hund", "Haarig", 4);
		Rennschnecke s4 = new Rennschnecke("Vogel", "Speed", 10);
		Rennschnecke s5 = new Rennschnecke("Jet", "fastest", 100);
	 
	 s1.krieche();
	 System.out.println(s1);
	 s2.krieche();
	 System.out.println(s2);
	 s3.krieche();
	 System.out.println(s3);
	 s4.krieche();
	 System.out.println(s4);
	 s5.krieche();
	 System.out.println(s5);
	}

}
