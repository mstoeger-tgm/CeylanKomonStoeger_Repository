/**
 * 
 * Klasse für Berechnungen von Summe, Maximum, Minimum
 * @author Ceylan Muhammed, Komon Patrick, Stoeger Michael
 * @version 05.12.2014
 */
public class Berechnungen {
	private LinkedList<> summe;
	
	/**
	 * Methode für Berechnungen einer Summe von beliebigen Werten
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
