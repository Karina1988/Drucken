import java.util.ArrayList;


public class Rechnung {

	private Druckformat druckformat;
	private ArrayList<Artikel> artikelListe;
	
	public Rechnung(){
		artikelListe = new ArrayList<Artikel>();
	}
	
	public void add(Artikel artikel){
		artikelListe.add(artikel);
	}
	
	public void drucken(Druckformat druckformat) {
		druckformat.drucken(artikelListe);
	}
	
}
