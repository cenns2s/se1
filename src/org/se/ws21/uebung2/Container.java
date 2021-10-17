package org.se.ws21.uebung2;

/**
 * @author cenns2s Christine Enns
 */

import java.util.ArrayList;

public class Container { 

	private ArrayList<Member> memberListe = new ArrayList<Member>();

	// Leerer Konstruktor
	public Container() {

	}

	// FA1: Es soll möglich sein, Objekte vom Typ Member in einem instanziierten
	// Objekt der Klasse Container zur Laufzeit abzuspeichern.
	public void addMember(Member member) throws ContainerException {
		if (contains(member) == true) {
			ContainerException exception = new ContainerException();
			exception.addID(member.getID());
			throw exception;
		}
		memberListe.add(member);
	}

	// HilfsMethode zur Überprüfung, ob das Member-Objekt enthalten ist
	private boolean contains(Member member) {
		Integer ID = member.getID();
		for (Member delete : memberListe) {
			if (delete.getID().intValue() == ID.intValue()) {
				return true;
			}
		}
		return false;
	}

	// FA2: Es soll mit der Methode deleteMember möglich sein, Objekte vom Typ
	// Member in einem instanziierten Objekt der Klasse Container zur Laufzeit
	// zu löschen.
	public String deleteMember(Integer id) {
		Member delete = getMember(id);
		// if (delete == null && id == this.id) {
		if (delete == null) {
			return "Fehler: Das zulöschende Member-Objekt ist nicht enthalten!";
		} else {
			memberListe.remove(delete);
			return "Das Member-Objekt mit der id " + id + "konnte gelöscht werden";
		}

	}

	// HilfsMethode zur Ermittlung eines Member-Objekts
	private Member getMember(Integer id) {
		for (Member rec : memberListe) {
			if (id == rec.getID().intValue()) {
				return rec;
			}
		}
		return null;
	}

	// FA3: Es soll mit einer Methode dump möglich sein, die IDs der aktuell
	// abgespeicherten Objekte vom Typ Member auszugeben.
	public void dump() {
		for (Member x : memberListe) {
			System.out.println("Member (ID = " + x.toString() + ")");
		}
	}

	// FA4: Es soll möglich sein, die Anzahl der aktuell abgespeicherten Objekte
	// vom Typ Member in einem Container-Objekt mittels der Methode size zu
	// ermitteln und an ein aufrufendes Objekt als Rückgabeparameter zu übergeben
	public int size() {
		return memberListe.size();
	}
}
