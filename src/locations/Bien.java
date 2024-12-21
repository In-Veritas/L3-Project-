package locations;
import java.time.*;

public abstract class Bien {
	
	int ref;
	String adresse;
	double tarif;
	double surface;
	boolean en_location;
	LocalDate date_location;
	
	Bien(int ref, String adresse, double tarif, double surface, boolean en_location, LocalDate date_location){
		this.ref = ref;
		this.adresse = adresse;
		this.tarif = tarif;
		this.surface = surface;
		this.en_location = en_location;
		this.date_location = date_location;
	}
}

