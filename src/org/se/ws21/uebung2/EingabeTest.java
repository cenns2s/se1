package org.se.ws21.uebung2;

/**
 * @author cenns2s Christine Enns
 */

import java.util.ArrayList;

public class EingabeTest {

	public static void main(String[] args) {

		EingabeTest t = new EingabeTest();
		try {
			t.test();
		} catch (ContainerException e) {
			e.printStackTrace();
		}
	}

	public void test() throws ContainerException {

		// Container erstellen
		Container c1 = new Container();

		// Member erstellen
		Member m1 = new MemberNormal(17);
		Member m2 = new MemberNormal(277);
		Member m3 = new MemberNormal(818);
		// Member m4 = new MemberNormal(17);

		// Testfall 1: Prüfen auf leeren Container
		vergleichTest("Testfall 1 - Prüfe auf leeren Container", 0, c1.size());

		c1.addMember(m1);
		c1.addMember(m2);
		c1.addMember(m3);

		// Testfall 2 - Pruefen, ob drei Objekte eingefuegt wurden
		vergleichTest("Testfall 2 - Prüfe, ob 3 Objekte eingefügt wurden", 3, c1.size());
		c1.dump();
		c1.addMember(m3);

		// Testfall 3 - Pruefen, ob viertes Objekt eingefuegt wurde
		vergleichTest("Testfall 3 - Prüfe, ob viertes Objekt eingefügt wurde", 3, c1.size());

		String result = c1.deleteMember(23);
		System.out.println(result);

		// Testfall 4 - Pruefen, ob Objekt geloescht wurde
		vergleichTest("Testfall 4 - Prüfe, ob Objekt gelöscht wurde", 2, c1.size());

		result = c1.deleteMember(277);
		System.out.println(result);

		// Testfall 5 - Pruefen, ob ein Objekt faelschlicherweise nicht geloescht wurde
		vergleichTest("Testfall 5 - Prüfe, ob ein Objekt gelöscht wurde", 2, c1.size());

		try {
			c1.addMember(m3);
		} catch (ContainerException e) {
			e.printStackTrace();
		}

	}

	// Testet ob ein Testfall erfolgreich war.
	// Es werden die IST-Werte und SOLL-Werte uebergeben
	private void vergleichTest(String testfall, int soll, int ist) {
		System.out.println(testfall + ": ");
		if (soll == ist) {
			System.out.print("Soll (" + soll + ") = IST (" + soll + ") --> Test ERFOLGREICH");
		} else {
			System.out.print("Soll (" + soll + ") != IST (" + soll + ") --> Test NICHT ERFOLGREICH");
		}
		System.out.println("\n");
	}

}
