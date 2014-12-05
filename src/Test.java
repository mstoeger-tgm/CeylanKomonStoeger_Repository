
/**
 * 
 * Test - Klasse, testet die Klassen Object2D, Object3D und Zahlen
 * @author Ceylan Muhammed
 * @version 05.12.2014 1.1
 * 
 */
public class Test {
	
	/**
	 * Main - Methode
	 * Verwendet die Methoden von den Klassen Object2D, Object3D
	 * 
	 */
	public static void main(String[] args){
		
		Object3D objp= new Object3D('p', 3.5, 2.7, 2);
		System.out.println("Der Rauminhalt von dieser Pyramide ist "+ objp.rauminhalt());
		//Pyramide wird erzeugt und der Rauminhalt berechnet
		
		Object3D objq= new Object3D('q', 3.5, 2.7, 2);
		System.out.println("Der Rauminhalt von diesem Quader ist "+ Math.round(objq.rauminhalt()));
		//Quader wird erzeugt und der Rauminhalt berechnet
		
		Object3D objk= new Object3D('k', 3.5, 2.7, 1);
		System.out.println("Der Rauminhalt von diesem Kegel ist "+ Math.round(objk.rauminhalt()));
		//Kegel wird erzeugt und der Rauminhalt berechnet
		
		Object2D objre = new Object2D(13, 7);
		System.out.println("Die Fläche dieses Rechtecks beträgt "+ objre.calcRect());
		//Rechteck wurde erstellt und die Fläche berechnet
		
		Object2D objdr = new Object2D(5.1, 4.5, 5.7);
		System.out.println("Die Fläche dieses Dreiecks beträgt "+ Math.round(objdr.calcTri()));
		//Dreieck wurde erstellt und die Fläche wurde berechnet
		
		Object2D objkre = new Object2D(7);
		System.out.println("Die Fläche dieses Kreises beträgt "+ Math.round(objkre.calcCircle()));
		//Kreis wurde erstellt und die Fläche wurde berechnet
		
		Zahlen zahlen1= new Zahlen();
		zahlen1.add(1.1);
		zahlen1.add(2.5);
		zahlen1.add(5.6);
		zahlen1.add(5.5);
		zahlen1.add(9.8);
		
		System.out.println("Summe aller Werte "+ zahlen1.summe());
		//Summe aller werte soll berechnet werden
		
		System.out.println("Maximum aller Werte "+ zahlen1.maximum());
		//Das Maximum alle Werte soll berechnet werden
		
		System.out.println("Minimum aller Werte "+ zahlen1.minimum());
		//Das MInimum aller Werte soll berechnet werden
		

	}

}
