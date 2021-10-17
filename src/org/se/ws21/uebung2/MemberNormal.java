package org.se.ws21.uebung2;

/**
 * @author cenns2s Chrstine Enns
 */

public class MemberNormal implements Member {

	private Integer id = null;

	// Konstruktor
	public MemberNormal(Integer id) {
		this.id = id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	public Integer getID() {
		return this.id;
	}

	@Override
	public String toString() {
		return "" + id;
	}
}
