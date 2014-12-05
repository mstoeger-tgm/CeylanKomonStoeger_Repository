
/**
 * Einfache Klasse f�r die Berechnung des Fl�cheninhaltes von verschiedener primitiver geometrischer Figuren (Kreis, Rechteck, Dreieck).
 * F�r die Berechnungen werden nur jeweils die Seite (keine Winkel) verwendet.
 * Der Vorteil ist, dass mans sich bei der Erzeugung einer Instanz dieser Klasse nicht auf eine der Figuren festlegen muss,
 * man kann mit jedem Objekt jede Fl�cheninhaltsberechnung durchf�hren. Davor muss man jedoch die Attribute dieses Objektes richtig
 * setzten. (Wenn man nun ein Objekt erstellt und vergisst einen, f�r die Berechnung, n�tigen Parameter vergisst (z.B die dritte Seite [c]
 * eines Dreiecks, so bekommt man meist 0 [oder evtl. NaN] als Ergebnis.)
 * 
 * @author Patrick Komon
 * @version 04-12-2014 1.1
 */
public class Object2D {

	private double a, b, c, r;

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, f�r die Berechnung des Fl�cheninhaltes eines Kreises, notwendigen Parametern.
	 * @param r Radius r des Kreises
	 */
	public Object2D(double r) {
		this.r = r;
	}

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, f�r die Berechnung des Fl�cheninhaltes eines Rechtecks, notwendigen Parametern.
	 * @param a Seite a (des Rechtecks/Dreiecks)
	 * @param b Seite b (des Rechtecks/Dreiecks)
	 */
	public Object2D(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Erzeugt ein Object2D-Objekt mit allen, f�r die Berechnung des Fl�cheninhaltes eines Dreiecks, notwendigen Parametern.
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
	 * Erzeugt ein Object2D-Objekt mit allen, f�r die Berechnung des Fl�cheninhaltes jeder der verf�gbaren Figuren, notwendigen Parametern.
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
	 * Berechnet die Fl�che eines Rechteckes mit den Seitenl�ngen a und b mithilfe der Formel A=a*b.
	 * Wenn diese Variablen nicht gesetzt wird, wird 0 zur�ckgegeben.
	 * @return double Fl�cheninhalt eines Rechtecks mit den Seiten a und b 
	 */
	public double calcRect(){
		return a*b;
	}
	
	/**
	 * Berechnet die Fl�che eines Dreiecks mit den Seitenl�ngen a, b und c (!) mithilfe der heron'schen Fl�chenformel. 
	 * [s = (a+b+c)/2 = umfang/2; A = sqrt(s*(s-a)*(s-b)*(s-c)]
	 * Wenn diese Variablen vorher nicht gesetzt wurden, wird 0 zur Berechnung eingesetzt bzw. wenn es eine imagin�re Zahl ist NaN zur�ckgegeben.
	 * @return double Fl�cheninhalt eines Dreiecks mit den Seiten a, b und c
	 */
	public double calcTri(){
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	/**
	 * Berechnet die Fl�che eines Kreises mit dem Radius r nach der Formel A = r^2*pi.
	 * Wenn r nicht gesetzt wurde, wird 0 zur�ckgegeben.
	 * @return double Fl�cheninhalt eines Kreises mit dem Radius r
	 */
	public double calcCircle(){
		return Math.PI*r*r;
	}
	
	/**
	 * Gibt die Seite a zur�ck
	 * @return double L�nge der Seite a
	 */
	public double getA() {
		return a;
	}

	/**
	 * Gibt die Seite b zur�ck
	 * @return double L�nge der Seite b
	 */
	public double getB() {
		return b;
	}

	/**
	 * Gibt die Seite c zur�ck
	 * @return double L�nge der Seite c
	 */
	public double getC() {
		return c;
	}

	/**
	 * Gibt den Radius r zur�ck
	 * @return double L�nge des Radius r
	 */
	public double getR() {
		return r;
	}

	/**
	 * Setzt die Seite a
	 * @param a L�nge der Seite a
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Setzt die Seite b
	 * @param b L�nge der Seite a
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * Setzt die Seite c
	 * @param c L�nge der Seite c
	 */
	public void setC(double c) {
		this.c = c;
	}

	/**
	 * Setzt den Radius r
	 * @param r L�nge des Radius r
	 */
	public void setR(double r) {
		this.r = r;
	}

}
