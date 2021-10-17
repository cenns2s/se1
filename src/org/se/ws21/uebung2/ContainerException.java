package org.se.ws21.uebung2;

/**
 * @author cenns2s Christine Enns
 */

public class ContainerException extends Exception {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@Override
	public void printStackTrace() {

		System.out.println("Das Member-Objekt mit der ID " + this.id + " ist bereits vorhanden!");
	}

	public void addID(Integer id) {
		this.id = id;
	}
}