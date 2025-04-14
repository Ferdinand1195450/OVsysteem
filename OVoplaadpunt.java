package ovSysteem;

import java.text.DecimalFormat;

public class OVoplaadpunt {

	private OVchipkaart kaart;
	DecimalFormat df = new DecimalFormat("0.00");
	
	private String showSaldo;
	
	public OVoplaadpunt(OVchipkaart kaart) {
        this.kaart = kaart;
    }
	
	public String ShowSaldo() {
		String formatted = df.format(kaart.getSaldo());
		this.showSaldo = "Your current saldo is €" + formatted + "\n";
		return this.showSaldo;
	}
	
	public String Deposit(double give) {
		String depo = "";
		if (give <= 0) {
			depo = "\n" + "You cant deposit a negative amount.";
			return depo;
		} else {
			kaart.setSaldo(kaart.getSaldo() + give);
			this.showSaldo = df.format(kaart.getSaldo());
			String formatted = df.format(give);
			depo = "\n" + "You have deposited €" + formatted  + "\n" + "\n" + "You're new saldo = €"  + this.showSaldo + "\n";
			return depo;
		}
	}
}
