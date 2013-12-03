import java.util.ArrayList;


public class TextFormat implements Druckformat{

	
	public void drucken(ArrayList<Artikel> artikelListe){
		for(Artikel artikel : artikelListe){
			System.out.println(artikel.getBezeichnung() + ": " + artikel.getPreis());
		}
	}
}
