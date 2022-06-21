package jana60.biglietto;

public class Biglietto {

	//ATTRIBUTI
	private float km, eta;
	

	private float costoPerKm = 0.21f;		
	private float scontoMinorenni = 0.20f;	// Sconto del 20% >18
	private float scontoAnziani = 0.40f;	// Sconto del 40% <65
	
	//COSTRUTTORI
	public Biglietto(float km, int eta){
		
		this.km = km;
		this.eta = eta;
		
	}
	public Biglietto() {}	
	
	//SETTERS/GETTERS
	public void setKm(float Km) {
		
		this.km = Km;
	}
	public void setEta(float eta) {
		
		this.eta = eta;
		
	}
	
	//METODI
	public float calcPrezzoBiglietto(){
		
		
		float prezzoBiglietto = km * costoPerKm;
		
		if (eta < 18) {
			prezzoBiglietto -= (prezzoBiglietto * scontoMinorenni );
		} 
		
		if (eta >= 65) {
			prezzoBiglietto -= (prezzoBiglietto * scontoAnziani);
		} 
		return prezzoBiglietto;
		
	}


	}


