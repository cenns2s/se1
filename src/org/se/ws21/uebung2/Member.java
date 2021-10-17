package org.se.ws21.uebung2;

/**
 * @author cenns2s Christine Enns
 */

interface Member {
	// ID ist über einen Konstruktor einer abgeleiteten Klasse
	// explizit außerhalb der Container-Klasse zu belegen
	// --> Primärschlüssel zur Unterscheidung aller Member-Objekte
	Integer getID();

	public String toString();
}
