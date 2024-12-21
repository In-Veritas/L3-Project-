package locations;

import java.time.LocalDate;

public class Appartement extends Bien{
	boolean meuble;
	int nb_chambres;
	int etage;
	double surface_totale;
	boolean balcon;
	
	Appartement(boolean meuble, int nb_chambres, int etage, double surface_totale, boolean balcon, int ref, String adresse, double tarif, double surface, boolean en_location, LocalDate date_location){
		super(ref, adresse, tarif, surface, en_location, date_location);
		this.meuble = meuble;
		this.nb_chambres = nb_chambres;
		this.etage = etage;
		this.surface_totale = surface_totale;
		this.balcon = balcon;
	}
}

