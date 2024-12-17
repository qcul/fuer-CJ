import java.util.Scanner;

public class Main {
	
	// Methode zum berechnen der Summe
	public static int berechneSumme(int[] zahlen) {
		int summe = 0;
		for (int zahl : zahlen) {
			summe += zahl;
		}
		return summe;
	}
	
	// Methode für die kleinste Zahl
	public static int findeMinimum(int[] zahlen) {
		int minimum = zahlen[0];
		for (int zahl : zahlen) {
			if (zahl < minimum) {
				minimum = zahl;
			}
		}
		return minimum;
	}
	
	// Methode für die größte Zahl
	public static int findeMaximum(int[] zahlen) {
		int maximum = zahlen[0];
		for (int zahl : zahlen) {
			if (zahl > maximum) {
				maximum = zahl;
			}
		}
		return maximum;
	}
	
	// Methode für den Durchschnitt
	public static double berechneMittelwert(int[] zahlen) {
		int sum = berechneSumme(zahlen);
		return (double) sum / zahlen.length; // Summe geteilt durch Anzahl
	}
	
	
	// Methode für die Anzahl positiver Zahlen
	public static int zaehlePositive(int[] zahlen) {
		int count = 0;
		for (int zahl : zahlen) {
			if (zahl > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner erstellen
		int[] zahlen = new int[10]; // Array für max 10 Zahlen
		
		// Zahlen eingeben lassen
		System.out.println("Bitte gib 10 Zahlen ein: ");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println("Zahl " + (i + 1) + ": ");
			zahlen[i] = scan.nextInt();
			
		}
		
		// Berechnung der Ergebnisse
		int sum = berechneSumme(zahlen); // Summe
		int minimum = findeMinimum(zahlen); // Kleinste Zahl
		int maximum = findeMaximum(zahlen); // Größte Zahl 
		double mittelwert = berechneMittelwert(zahlen); // Durchschnitt
		int positiveAnzahl = zaehlePositive(zahlen); // Anzahl positiver Zahlen
		
		
		// Ausgabe der Ergebnisse
		System.out.println("\n\nErgebnisse: ");
		System.out.println("Summe: " + sum);
		System.out.println("Kleinste Zahl: " + minimum + "\nGrößte Zahl: " + maximum);
		System.out.println("Durchschnitt: " + mittelwert);
		System.out.println("Positive Zahlen: " + positiveAnzahl);
		
	}

}
