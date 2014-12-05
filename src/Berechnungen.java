/**
 * Ceylan Muhammed, Komon Patrick, Stoeger Michael
 * 
 * 
 */
public class Berechnungen {
	private LinkedList<> summe;
	
	/**
	 * Methode f�r Berechnungen einer Summe von beliebigen Werten
	 * 
	 */
	public double summe(){
		double temp = 0;
		for(int i=0;i=<summe.length;i++){
			temp+=summe[i];
		}
		return temp;
		
	}
	
	/**
	 * Berechnet Maximum - Wert
	 * 
	 */
	public double maximum(){
		Collections.max(summe);
	}
	
	/**
	 * Berechnet Minimum - Wert
	 * 
	 */
	public double minimum(){
		Collections.min(summe);
	}
	

}
