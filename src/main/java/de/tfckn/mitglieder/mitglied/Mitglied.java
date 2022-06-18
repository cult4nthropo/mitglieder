package de.tfckn.mitglieder.mitglied;

import java.time.LocalDate;

public class Mitglied {
	private int mitgliedsnummer;
	private String vorname;
	private String nachname;
	private LocalDate geburtstag;
	private String mitgliedsart_FK;

	public int getMitgliedsnummer() {
		return mitgliedsnummer;
	}

	public void setMitgliedsnummer(int mitgliedsnummer) {
		this.mitgliedsnummer = mitgliedsnummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public LocalDate getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(LocalDate geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String getMitgliedsart_FK() {
		return mitgliedsart_FK;
	}

	public void setMitgliedsart(String mitgliedsart_FK) {
		this.mitgliedsart_FK = mitgliedsart_FK;
	}

	public Mitglied() {
		super();
	}

	public Mitglied(int mitgliedsnummer, String vorname, String nachname, LocalDate geburtstag,
			String mitgliedsart_FK) {
		super();
		this.mitgliedsnummer = mitgliedsnummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
		this.mitgliedsart_FK = mitgliedsart_FK;
	}

	public Mitglied(String vorname, String nachname, LocalDate geburtstag, String mitgliedsart_FK) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
		this.mitgliedsart_FK = mitgliedsart_FK;
	}

	@Override
	public String toString() {
		return "Mitglied [mitgliedsnummer=" + mitgliedsnummer + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", geburtstag=" + geburtstag + ", mitgliedsart_FK=" + mitgliedsart_FK + "]";
	}
	
	

}
