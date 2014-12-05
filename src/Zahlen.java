
import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * Klasse für Berechnungen von Summe, Maximum, Minimum 
 * @author Ceylan Muhammed
 * @version 05.12.2014 1.2
 * 
 */
public class Zahlen {
	private LinkedList<Double> sum =  new LinkedList<>();
	
	/**
	 * Standard - Konstruktor
	 * @param sum 
	 * 
	 */
	
	public Zahlen() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Methode für Berechnungen einer Summe von beliebigen Werten
	 * 
	 */
	public double summe(){
		double temp = 0;
		for(double i:sum){
			temp+=i;
		}
		return temp;
		
	}
	
	/**
	 * Berechnet Maximum - Wert
	 * 
	 */
	public double maximum(){
		return Collections.max(sum);
	}
	
	/**
	 * Berechnet Minimum - Wert
	 * 
	 */
	public double minimum(){
		return Collections.min(sum);
	}
	/**
	 * 
	 * Beliebige Werte mittels add hinzugefügt
	 * 
	 */
	public void add(double x){
		sum.add(x);
		
	}
	

}
