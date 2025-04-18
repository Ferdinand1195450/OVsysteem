package ovSysteem;

import java.util.ArrayList;

public class OVreisplanner extends OVsysteem {

	private OVchipkaart kaart;
	
	public OVreisplanner(OVchipkaart kaart) {
        this.kaart = kaart;
    }
	
	public boolean travel(int choice) {
		boolean correct2;
		ArrayList<String> locaties = new ArrayList<String>();
		
		locaties.add(0, "1. Nijmegen Centraal" + "\n");
		locaties.add(1, "2. Arnhem Centraal" + "\n");
		locaties.add(2, "3. Amsterdam Centraal" + "\n");
		locaties.add(3, "4. Utrecht Centraal" + "\n");
		locaties.add(4, "5. Ede-Wageningen" + "\n");
		
		if (kaart.getLocatie() == locaties.get(choice - 1)) {
			correct2 = false;
			return correct2;
		} else {
			String newLocatie = locaties.get(choice - 1);
			kaart.setLocatie(newLocatie);
			kaart.setKosten(kaart.getKosten() + 1.50);
			correct2 = true;
			return correct2;
		}
	}
}
