package model;

public class Omakotitalo extends Asunto{
private String tontinKoko;
private String lammitysmuoto;

public Omakotitalo () {
	super();
	this.tontinKoko=null;
	this.lammitysmuoto=null;
}

public Omakotitalo(int id, int hinta, int hlkm, double pintaala, String nimi, String kuvaus, String tontinKoko, String lammitysmuoto) {
	super(id, hinta, hlkm, pintaala, nimi, kuvaus);
	this.tontinKoko= tontinKoko;
	this.lammitysmuoto=lammitysmuoto;
}

public void setTontinKoko(String tontinKoko) {
	this.tontinKoko = tontinKoko;
}

public void setLammitysmuoto(String lammitysmuoto) {
	this.lammitysmuoto = lammitysmuoto;
}

public String getTontinKoko() {
	return tontinKoko;
}

public String getLammitysmuoto() {
	return lammitysmuoto;
}

@Override
public String toString() {
	return super.toString()+ ", tontin koko:" + tontinKoko + ", Lämmitysmuoto:" + lammitysmuoto;
}

}
