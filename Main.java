
public class Main {

	public static void main(String[] args) {
		
		Rechnung rechnung = new Rechnung();
		rechnung.add(new Artikel("Teddy", 50.00));
		rechnung.drucken(new TextFormat());
		
	}
}
