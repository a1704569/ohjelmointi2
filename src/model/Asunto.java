package model;

public class Asunto {
private int id,hinta, hlkm;
private double pintaala;
private String nimi, kuvaus;

public Asunto() {
	super();
	this.id = 000000;
	this.hinta = 0;
	this.hlkm= 0;
	this.pintaala= 0;
	this.nimi=null;
	this.kuvaus=null;
}

public Asunto(int id, int hinta, int hlkm, double pintaala, String nimi, String kuvaus) {
	super();
	this.id = id;
	this.hinta = hinta;
	this.hlkm = hlkm;
	this.pintaala = pintaala;
	this.nimi = nimi;
	this.kuvaus = kuvaus;
}

public int getId() {
	return id;
}

public int getHinta() {
	return hinta;
}

public int getHlkm() {
	return hlkm;
}

public double getPintaala() {
	return pintaala;
}

public String getNimi() {
	return nimi;
}

public String getKuvaus() {
	return kuvaus;
}

public void setId(int id) {
	this.id = id;
}

public void setHinta(int hinta) {
	this.hinta = hinta;
}

public void setHlkm(int hlkm) {
	this.hlkm = hlkm;
}

public void setPintaala(double pintaala) {
	this.pintaala = pintaala;
}

public void setNimi(String nimi) {
	this.nimi = nimi;
}

public void setKuvaus(String kuvaus) {
	this.kuvaus = kuvaus;
}

@Override
public String toString() {
	return "Myytäbä Asunto [id=" + id + ", hinta=" + hinta + ", hlkm=" + hlkm + ", pintaala=" + pintaala + ", nimi=" + nimi
			+ ", kuvaus=" + kuvaus + "]";
}

}
