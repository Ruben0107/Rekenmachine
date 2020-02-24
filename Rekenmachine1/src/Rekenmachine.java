
public class Rekenmachine {

	public static void main(String[] args) {
		
		Michiel a = new Michiel();
		Ruben b = new Ruben();
		
		
		
		b.optellen(5, 6);
		b.aftrekken(5, 7);
		System.out.println("delen van ruben =" + a.delen(6, 7));
		System.out.println("vermenigvuldigen =" + a.vermenigvuldigen(5, 6));
	}

}
