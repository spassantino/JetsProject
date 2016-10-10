package week2;
import java.util.ArrayList;
import java.lang.System;
import java.util.*;

public class JetsMenu {
	static ArrayList<Jet> fleet = new ArrayList<Jet>();

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Jet jet1 = new Jet("a", 900, 3000000, 7000);
		fleet.add(0,jet1);
		Jet jet2 = new Jet("b", 800, 2000000, 7600);
		fleet.add(1,jet2);
		Jet jet3 = new Jet("c", 1000, 3240000, 7000);
		fleet.add(2,jet3);
		Jet jet4 = new Jet("d", 990, 3200000, 6900);
		fleet.add(3,jet4);
		Jet jet5 = new Jet("e", 1100, 40000000, 8000);
		fleet.add(4,jet5);
		displayMenu();
	}
	public static void displayMenu() {

		System.out.println("Please choose a number from the following options 1-5:");
		System.out.println("1) List Jets");
		System.out.println("2) Find Fastest Jet");
		System.out.println("3) Find longest range Jet");
		System.out.println("4) Add Jet");
		System.out.println("5) Quit the program");
		int option = scanner.nextInt();
		if (option == 1) {
			listJets();
		} else if (option == 2) {
			findFastestJet();
		} else if (option == 3) {
			findLongestRangeJet();
		} else if (option == 4) {
			addJet();
		} else if (option == 5){
			quitMenu();
		}
		else if ((option > 6) || (option < 1)) {
			System.out.println("Your input was invalid. Please only select from 1-5");
			return;
		}
	}

	public static void listJets() {
//		ArrayList<Jet> fleet = new ArrayList<Jet>();
//		Jet jet1 = new Jet("model a", 900, 3000000, 7000);
//		fleet.add(jet1);
//		Jet jet2 = new Jet("model b", 800, 2000000, 7600);
//		fleet.add(jet2);
//		Jet jet3 = new Jet("model c", 1000, 3240000, 7000);
//		fleet.add(jet3);
//		Jet jet4 = new Jet("model d", 990, 3200000, 6900);
//		fleet.add(jet4);
//		Jet jet5 = new Jet("model e", 1100, 40000000, 8000);
//		fleet.add(jet5);
	    for(int index=0; index < fleet.size(); index++){
	        System.out.println(fleet.get(index));
		 }
		   displayMenu();
		}

	public static void findFastestJet() {
		System.out.println("The fastest Jet is: ");
		displayMenu();
	}

	public static void findLongestRangeJet() {
		System.out.println("The longest range Jet is: ");
		displayMenu();
	}

	public static void addJet() {
		Jet newJet = new Jet();
		System.out.println("Please enter the model of jet to add: ");
		String model = scanner.next();
		newJet.setModel(model);
		System.out.println("Please enter the speed (in MPH) of jet to add: ");
		float mph = scanner.nextFloat();
		newJet.setMph(mph);
		System.out.println("Please enter the price of jet to add: ");
		long price = scanner.nextLong();
		newJet.setPrice(price);
		System.out.println("Please enter the range of jet to add: ");
		int range = scanner.nextInt();
		newJet.setRange(range);
		fleet.add(newJet);
		System.out.println(newJet);
		displayMenu();
		}
	

	public static void quitMenu() {
		System.out.println("You have successfully terminated the program");
	}
}
