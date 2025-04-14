package ovSysteem;

import java.util.Scanner;

public class OVsysteem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		OVchipkaart mijnKaart = new OVchipkaart();

		OVoplaadpunt laad = new OVoplaadpunt(mijnKaart);
		OVcheckpunt check = new OVcheckpunt(mijnKaart);


		int choice = 0;
		double give;
		Boolean correct = false;
		Boolean traveling = true;
		String newLocatie;

		while (traveling == true) {
			correct = false;
			while (correct == false) {
				System.out.println("What would you like to do?");
				System.out.println("You are currently at " + mijnKaart.getLocatie() + "\n");

				System.out.println("1. check in/out.");
				System.out.println("2. travel.");
				System.out.println("3. check your saldo." + "\n");
				try {
					choice = scn.nextInt();
					scn.nextLine();
					correct = true;
				} catch (Exception e) {
					scn.nextLine();
				}
				if (choice == 1 || choice == 2 || choice == 3) {
					correct = true;
				} else {
					System.out.println("Invalid user input, please try again" + "\n");
				}
			}

			System.out.println("\n");

			switch (choice) {
			case 1:
				check.inUitChecken();
				break;
			case 2:
				if (mijnKaart.getIngecheckt() == true) {
					correct = false;
					while (correct == false)
						System.out.println("Where would you like to go?");
						System.out.println("You are currently at " + mijnKaart.getLocatie() + "\n");
						System.out.println("You can go to:" + "\n");
						
						System.out.println();

						choice = scn.nextInt();
						scn.nextLine();
						if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
							correct = true;
						} else {
							System.out.println("Invalid user input, please try again" + "\n");
						}

						switch (choice) {
							case 1:
								newLocatie = "";
								mijnKaart.setLocatie(newLocatie);
								break;
							case 2:
								newLocatie = "";
								mijnKaart.setLocatie(newLocatie);
								break;
						}
				break;
				}
			case 3:
				System.out.println(laad.ShowSaldo());
				
				if (mijnKaart.getIngecheckt() == true) {
					System.out.println("If you want to deposit then please check out first." + "\n");
				} else {
					correct = false;
					while (correct == false) {
						
					System.out.println("Would you like to deposit?" + "\n");
					System.out.println("1. yes");
					System.out.println("2. no" + "\n");
					
					choice = scn.nextInt();
					scn.nextLine();
					if (choice == 1) {
						correct = true;
						System.out.println("\n" + "How much would you like to deposit?" + "\n");
						
						give = scn.nextDouble();
						scn.nextLine();
						
						System.out.println(laad.Deposit(give));
					} else if (choice == 2) {
						System.out.println("");
						correct = true;
					} else {
						System.out.println("Invalid user input, please try again" + "\n");
						}
					}
				}
				break;
			}
		}
	}
}
