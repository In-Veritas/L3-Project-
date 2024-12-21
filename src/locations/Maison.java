package locations;

import java.time.LocalDate;
import java.util.ArrayList;

public class Maison extends Bien{
	int nb_etages;
	boolean jardin;
	ArrayList<Double> surface_par_etage;
	
	Maison(int nb_etages, boolean jardin, ArrayList<Double> surface_par_etage, int ref, String adresse, double tarif, double surface, boolean en_location, LocalDate date_location){
		super(ref, adresse, tarif, surface, en_location, date_location);
		this.nb_etages = nb_etages;
		this.jardin = jardin;
		this.surface_par_etage = surface_par_etage;		
	}
}

