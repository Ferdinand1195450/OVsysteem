package ovSysteem;

public class OVchipkaart extends OVsysteem {
	
	private String Locatie = "Station Nijmegen";
	private int Kaartnummer = 01;
	private double Saldo = 0;
	private Boolean Ingecheckt = false;
	
	public String getLocatie() {
		return Locatie;
	}
	
	public int getKaartnummer() {
		return Kaartnummer;
	}
	
	public Double getSaldo() {
		return Saldo;
	}
	
	public Boolean getIngecheckt() {
		return Ingecheckt;
	}
	
	public void setLocatie(String newLocatie) {
		this.Locatie = newLocatie;
	}
	
	public void setKaartnummer(int newKaartnummer) {
		this.Kaartnummer =	newKaartnummer;
	}
	
	public void setSaldo(Double newSaldo) {
		this.Saldo = newSaldo;
	}
	
	public void setIngecheckt(boolean newIngecheckt) {
		this.Ingecheckt = newIngecheckt;
	}
}
