package model;

public class Pankkitili {
	private String tilinumero;
	private double saldo;
	private String tyyppi;
	private String omistaja;


public Pankkitili(){
	super();
	this.tilinumero="FI000000";
	this.saldo= 00.00;
	this.tyyppi = null;
	this.omistaja= null;
}
public Pankkitili(String tilinumero, double saldo, String tyyppi, String omistaja) {
	super();
	this.tilinumero = tilinumero;
	this.saldo = saldo;
	this.tyyppi = tyyppi;
	this.omistaja = omistaja;
}
public String getTilinumero() {
	return tilinumero;
}
public double getSaldo() {
	return saldo;
}
public String getTyyppi() {
	return tyyppi;
}
public String getOmistaja() {
	return omistaja;
}
public void setTilinumero(String tilinumero) {
	this.tilinumero = tilinumero;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public void setTyyppi(String tyyppi) {
	this.tyyppi = tyyppi;
}
public void setOmistaja(String omistaja) {
	this.omistaja = omistaja;
}
@Override
public String toString() {
	return "Pankkitili [tilinumero=" + tilinumero + ", saldo=" + saldo + ", tyyppi=" + tyyppi + ", omistaja=" + omistaja
			+ "]";
}
}





