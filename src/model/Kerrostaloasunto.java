package model;

public class Kerrostaloasunto extends Asunto {
	private int kerros;
	private boolean onkohissi;
	
	public Kerrostaloasunto() {
		super();
		this.kerros= 0;
		this.onkohissi= false;
	}

	public Kerrostaloasunto(int id, int hinta, int hlkm, double pintaala, String nimi, String kuvaus, int kerros, boolean onkohissi) {
		super(id, hinta, hlkm, pintaala, nimi, kuvaus);
		this.kerros= kerros;
		this.onkohissi=onkohissi;
	}

	public int getKerros() {
		return kerros;
	}

	public boolean isOnkohissi() {
		return onkohissi;
	}

	public void setKerros(int kerros) {
		this.kerros = kerros;
	}

	public void setOnkohissi(boolean onkohissi) {
		this.onkohissi = onkohissi;
	}

	@Override
	public String toString() {
		return super.toString()+ "[kerros=" + kerros + ", onkohissi=" + onkohissi + "]";
	}
	

}

