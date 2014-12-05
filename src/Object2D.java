
/**
 * Einfache Klasse für die Berechnung des Flächeninhaltes von verschiedener primitiver geometrischer Figuren (Kreis, Rechteck, Dreieck).
 * Für die Berechnungen werden nur jeweils die Seite (keine Winkel) verwendet.
 * Der Vorteil ist, dass mans sich bei der Erzeugung einer Instanz dieser Klasse nicht auf eine der Figuren festlegen muss,
 * man kann mit jedem Objekt jede Flächeninhaltsberechnung durchführen. Davor muss man jedoch die Attribute dieses Objektes richtig
 * setzten. (Wenn man nun ein Objekt erstellt und vergisst einen, für die Berechnung, nötigen Parameter vergisst (z.B die dritte Seite [c]
 * eines Dreiecks, so bekommt man meist 0 [oder evtl. NaN] als Ergebnis.)
 * 
 * @author Patrick Komon
 * @version 04-12-2014 1.1
 */
public class Object2D {

	private double a, b, c, r;

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, für die Berechnung des Flächeninhaltes eines Kreises, notwendigen Parametern.
	 * @param r Radius r des Kreises
	 */
	public Object2D(double r) {
		this.r = r;
	}

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, für die Berechnung des Flächeninhaltes eines Rechtecks, notwendigen Parametern.
	 * @param a Seite a (des Rechtecks/Dreiecks)
	 * @param b Seite b (des Rechtecks/Dreiecks)
	 */
	public Object2D(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, für die Berechnung des Flächeninhaltes eines Dreiecks, notwendigen Parametern.
	 * @param a Seite a (des Dreiecks/Rechtecks)
	 * @param b Seite b (des Dreiecks/Rechtecks)
	 * @param c Seite c (des Dreiecks)
	 */
	public Object2D(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Erzeugt ein Object2D-Objekt mit allen, für die Berechnung des Flächeninhaltes jeder der verfügbaren Figuren, notwendigen Parametern.
	 * @param a Seite a (des Dreiecks/Rechtecks)
	 * @param b Seite b (des Dreiecks/Rechtecks)
	 * @param c Seite c (des Dreiecks)
	 * @param r Radius r (des Kreises)
	 */
	public Object2D(double a, double b, double c, double r) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.r = r;
	}

	/**
	 * Berechnet die Fläche eines Rechteckes mit den Seitenlängen a und b mithilfe der Formel A=a*b.
	 * Wenn diese Variablen nicht gesetzt wird, wird 0 zurückgegeben.
	 * @return double Flächeninhalt eines Rechtecks mit den Seiten a und b 
	 */
	public double calcRect(){
		return a*b;
	}
	
	/**
	 * Berechnet die Fläche eines Dreiecks mit den Seitenlängen a, b und c (!) mithilfe der heron'schen Flächenformel. 
	 * [s = (a+b+c)/2 = umfang/2; A = sqrt(s*(s-a)*(s-b)*(s-c)]
	 * Wenn diese Variablen vorher nicht gesetzt wurden, wird 0 zur Berechnung eingesetzt bzw. wenn es eine imaginäre Zahl ist NaN zurückgegeben.
	 * @return double Flächeninhalt eines Dreiecks mit den Seiten a, b und c
	 */
	public double calcTri(){
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	/**
	 * Berechnet die Fläche eines Kreises mit dem Radius r nach der Formel A = r^2*pi.
	 * Wenn r nicht gesetzt wurde, wird 0 zurückgegeben.
	 * @return double Flächeninhalt eines Kreises mit dem Radius r
	 */
	public double calcCircle(){
		return Math.PI*r*r;
	}
	
	/**
	 * Gibt die Seite a zurück
	 * @return double Länge der Seite a
	 */
	public double getA() {
		return a;
	}

	/**
	 * Gibt die Seite b zurück
	 * @return double Länge der Seite b
	 */
	public double getB() {
		return b;
	}

	/**
	 * Gibt die Seite c zurück
	 * @return double Länge der Seite c
	 */
	public double getC() {
		return c;
	}

	/**
	 * Gibt den Radius r zurück
	 * @return double Länge des Radius r
	 */
	public double getR() {
		return r;
	}

	/**
	 * Setzt die Seite a
	 * @param a Länge der Seite a
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Setzt die Seite b
	 * @param b Länge der Seite a
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * Setzt die Seite c
	 * @param c Länge der Seite c
	 */
	public void setC(double c) {
		this.c = c;
	}

	/**
	 * Setzt den Radius r
	 * @param r Länge des Radius r
	 */
	public void setR(double r) {
		this.r = r;
	}

}
