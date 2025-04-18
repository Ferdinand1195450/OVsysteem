package ovSysteem;

import java.util.ArrayList;
import java.util.Scanner;

public class OVcheckpunt extends OVsysteem {
	
	private OVchipkaart kaart;
	
	public OVcheckpunt(OVchipkaart kaart) {
        this.kaart = kaart;
    }
	
	public void inUitChecken() {
		boolean newIngecheckt;
		if (kaart.getIngecheckt() == false) {
			if (kaart.getSaldo() >= 20) {
				newIngecheckt = true;
				kaart.setIngecheckt(newIngecheckt);
				System.out.println("Checked in at " + trimLocatie() + "\n");
			} else {
				System.out.println("Not enough saldo." + "\n");
			}
		} else if (kaart.getIngecheckt() == true){
			newIngecheckt = false;
			kaart.setIngecheckt(newIngecheckt);
			kaart.setSaldo(kaart.getSaldo() - kaart.getKosten());
			System.out.println("Checked out at " + trimLocatie());
			System.out.println("You have paid €" + kaart.getKosten() + "\n");
			kaart.setKosten(0.0);
		}
	}
	
	public String trimLocatie() {
	    String locatie = kaart.getLocatie();
	        return locatie.substring(3);
	}
	
	public String Opties() {
		kaart.getLocatie();
		
		ArrayList<String> locaties = new ArrayList<String>();
		
		locaties.add(0, "1. Nijmegen Centraal" + "\n");
		locaties.add(1, "2. Arnhem Centraal" + "\n");
		locaties.add(2, "3. Amsterdam Centraal" + "\n");
		locaties.add(3, "4. Utrecht Centraal" + "\n");
		locaties.add(4, "5. Ede-Wageningen" + "\n");
		
		locaties.remove(kaart.getLocatie());
		
	    StringBuilder list = new StringBuilder();
	    for (String s : locaties) {
	        list.append(s);
	    }

	    return list.toString();
	}
	
}

