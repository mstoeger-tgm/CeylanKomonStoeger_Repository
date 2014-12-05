
/**
 * Klasse fuer 3D Objekte
 * Pyramide(p), Quader(q), Kegel(k)
 * @author Michael Stoeger
 * @verison 4.12.2014 1.1
 */
public class Object3D {
	private char type; //p Pyramide, q Quader, k Kegel
	private double h, a, b;
	/**
	 * Erzeugt ein Objekt mit den Maßen 0,0,0
	 * @param type
	 */
	public Object3D(char type){
		this(type, 0, 0, 0);
	}
	/**
	 * Konstruktor mit allen Laengen
	 * Fuer Kegel bitte (double, double) Konstruktor benutzen
	 * @param type
	 * @param h
	 * @param a
	 * @param b
	 */
	public Object3D(char type, double h, double a, double b){
		this.type=type;
		this.h=h;
		this.a=a;
		this.b=b;
	}
	/**
	 * Konstruktor fuer Kegel
	 * @param h
	 * @param r
	 */
	public Object3D(double h, double r){
		this('k', h, r, 0);
	}
	/**
	 * Konstruktor ohne Type exisitiert nicht
	 */
	private Object3D(){}
	/**
	 * Berechnet den Rauminhalt des Objekts
	 * @return rauminhalt
	 */
	public double rauminhalt(){
		double rauminhalt = 0;
		if(type=='q'){
			rauminhalt=a*b*h;
		}else if(type=='p'){
			rauminhalt=(1.0/3.0)*a*b*h;
		}else{
			rauminhalt=(1.0/3.0)*Math.PI*a*a*h;
		}
		return rauminhalt;
	}
	/**
	 * Gibt den Type zurueck
	 * @return type
	 */
	public char getType() {
		return type;
	}
	/**
	 * Setzt den Type
	 * @param type
	 */
	public void setType(char type) {
		this.type = type;
	}
	/**
	 * Gibt hoehe zurueck
	 * @return hoehe
	 */
	public double getH() {
		return h;
	}
	/**
	 * Setzt die hoehe
	 * @param h
	 */
	public void setH(double h) {
		this.h = h;
	}
	/**
	 * Gibt a zurueck
	 * @return a
	 */
	public double getA() {
		return a;
	}
	/**
	 * Setzt a
	 * @param a
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * Gibt b zurueck
	 * @return b
	 */
	public double getB() {
		return b;
	}
	/**
	 * Setzt b
	 * @param b
	 */
	public void setB(double b) {
		this.b = b;
	}
}
