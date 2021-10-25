package model;



public class Pizza {
	
	private double hinta;
	private int id;
	private String kuvaus;
	private String nimi;

public Pizza () {
	super();
	this.hinta= 00.00;
	this.id= 0;
	this.kuvaus= null;
	this.nimi= null;
}
public Pizza (double hinta, int id, String kuvaus, String nimi) {
super (); 
this.hinta= hinta;
this.id=id;
this.kuvaus=kuvaus;
this.nimi= nimi;
}


public void setHinta(double hinta) {
	this.hinta = hinta;
}

public void setId(int id) {
	this.id = id;
}

public void setKuvaus(String kuvaus) {
	this.kuvaus = kuvaus;
}

public void setNimi(String nimi) {
	this.nimi = nimi;
}

public double getHinta() {
	return hinta;
}

public int getId() {
	return id;
}

public String getKuvaus() {
	return kuvaus;
}

public String getNimi() {
	return nimi;
}

@Override
public String toString() {
	return "Pizza [hinta=" + hinta + ", id=" + id + ", kuvaus=" + kuvaus + ", nimi=" + nimi + "]";
}

}
