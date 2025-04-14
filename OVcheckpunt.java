package ovSysteem;

import java.util.ArrayList;
import java.util.Scanner;

public class OVcheckpunt extends OVsysteem {
	
	private OVchipkaart kaart;
	private double ReisKosten = 0;
	
	public OVcheckpunt(OVchipkaart kaart) {
        this.kaart = kaart;
    }
	
	public void inUitChecken() {
		boolean newIngecheckt;
		if (kaart.getIngecheckt() == false) {
			if (kaart.getSaldo() >= 20) {
				newIngecheckt = true;
				kaart.setIngecheckt(newIngecheckt);
				System.out.println("Checked in at " + kaart.getLocatie() + "\n");
			} else {
				System.out.println("Not enough saldo." + "\n");
			}
		} else if (kaart.getIngecheckt() == true){
			newIngecheckt = false;
			kaart.setIngecheckt(newIngecheckt);
			kaart.setSaldo(kaart.getSaldo() - ReisKosten);
			System.out.println("Checked out at " + kaart.getLocatie() + "\n");
		}
	}
	
	public String checkpunt(int locatie) {
		kaart.getLocatie();
		
		ArrayList<String> locaties = new ArrayList<String>();
		
		locaties.add(0, "Nijmegen Centraal");
		locaties.add(1, "Arnhem Centraal");
		locaties.add(2, "Amsterdam Centraal");
		locaties.add(3, "Utrecht Centraal");
		locaties.add(4, "Ede-Wageningen");
		
		String huidigCheckpunt = locaties.get(locatie);
		return huidigCheckpunt;
	}
	
}

