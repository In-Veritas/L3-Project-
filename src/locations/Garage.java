package locations;

import java.time.LocalDate;

public class
Garage extends Bien{
	int num_emplacement;
	
	Garage(int num_emplacement, int ref, String adresse, double tarif, double surface, boolean en_location, LocalDate date_location){
		super(ref, adresse, tarif, surface, en_location, date_location);
		this.num_emplacement = num_emplacement;
	}
}

