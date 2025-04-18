package ovSysteem;

import java.util.Scanner;

public class OVsysteem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		OVchipkaart mijnKaart = new OVchipkaart();

		OVoplaadpunt laad = new OVoplaadpunt(mijnKaart);
		OVcheckpunt check = new OVcheckpunt(mijnKaart);
		OVreisplanner reis = new OVreisplanner(mijnKaart);

		int choice = 0;
		double give;
		Boolean correct = false;
		Boolean correct2 = false;
		Boolean traveling = true;

		while (traveling == true) {
			correct = false;
			choice = 10;
			while (correct == false) {
				System.out.println("What would you like to do?");
				System.out.println("You are currently at " + check.trimLocatie() + "\n");

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
					choice = 10;
					correct2 = false;
					correct = false;
					while (correct2 == false) {
						while (correct == false) {
							System.out.println("Where would you like to go?");
							System.out.println("You are currently at " + check.trimLocatie());
							System.out.println("You can go to:" + "\n" + check.Opties() + "\n");

							System.out.println();
							try {
								choice = scn.nextInt();
								scn.nextLine();
								correct = true;
							} catch (Exception e) {
								scn.nextLine();
							}
							if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {

							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
						}

						switch (choice) {
						case 1:
							if (reis.travel(choice) == true) {
								correct2 = true;
							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
							break;
						case 2:
							if (reis.travel(choice) == true) {
								correct2 = true;
							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
							break;
						case 3:
							if (reis.travel(choice) == true) {
								correct2 = true;
							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
							break;
						case 4:
							if (reis.travel(choice) == true) {
								correct2 = true;
							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
							break;
						case 5:
							if (reis.travel(choice) == true) {
								correct2 = true;
							} else {
								System.out.println("Invalid user input, please try again" + "\n");
								correct = false;
							}
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println(laad.ShowSaldo());

				if (mijnKaart.getIngecheckt() == true) {
					System.out.println("If you want to deposit then please check out first." + "\n");
				} else {
					choice = 10;
					correct = false;
					while (correct == false) {

						System.out.println("Would you like to deposit?" + "\n");
						System.out.println("1. yes");
						System.out.println("2. no" + "\n");

						try {
							choice = scn.nextInt();
							scn.nextLine();
							correct = true;
						} catch (Exception e) {
							scn.nextLine();
						}
						if (choice == 1) {
							give = 0;
							correct = false;
							while (correct == false) {
								System.out.println("\n" + "How much would you like to deposit?" + "\n");
								try {
									give = scn.nextDouble();
									scn.nextLine();
									correct = true;
								} catch (Exception e) {
									scn.nextLine();
									System.out.println("\n" + "Invalid user input, please try again");
								}
							}
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
