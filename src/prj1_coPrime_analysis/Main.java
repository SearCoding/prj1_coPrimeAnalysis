/**
 * 
 */
package prj1_coPrime_analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * COSC220 INSTRUCTOR: MR. FALLON <PRJ1_COPRIME_ANALYSIS> <IN THIS PROJECT, WE
 * ARE ALLOWING THE USER TO FIRST TEST OUT THE PROGRAM BY ALLOWING THEM TO TYPE
 * IN A NUMBER SO THAT IT CAN CHECK TO SEE IF IT IS A PRIME NUMBER OR A
 * COMPOSITE NUMBER. THIS WILL BE RUNNING IN A LOOP UNTIL THE USER TYPES IN A
 * NUMBER THAT IS LESS THAN TWO.
 * 
 * WHILE IN THE LOOP, THE USER WILL SEE A LIST OF FACTORS THAT A COMPOSITE
 * NUMBER HAVE IF THEY TYPE IN A COMPOSITE NUMBER.
 * 
 * ONCE THE VALUE OF THE NUMBER IS LESS THAN TWO, THE PROGRAM WILL HAVE A MOMENT
 * TO REST AND WILL PRINT OUT THE INSTRUCTIONS OF THE NEXT PHASE.
 * 
 * WHEN FINISHING PRINTING OUT THE NEXT PHASE, ALLOWING THE USER TO READ IT, IT
 * WILL FIND THE NUMBER OF COMPOSITE COPRIME PAIRS THAT EXIST BETWEEN 1 TO 100,
 * DISPLAYING IT TO THE SCREEN FOR THE USER TO SEE THE AMOUNT.
 * 
 * AFTER PHASE 2 IS COMPLETED, THE PROGRAM WILL PRINT OUT THE NEW INSTRUCTIONS
 * FOR PHASE 3, ALLOWING THE USER TO READ IT.
 * 
 * PHASE 3 WILL GO AND GENERATE 100 PAIRS OF 2 INTEGERS, KEEPING COUNT OF THE
 * AMOUNT OF COMPOSITE COPRIME PAIRS THAT OCCURED IN THE GENERATION. IT WILL
 * PRINT OUT THE COUNT AND THEN SAVED AS A SAMPLE. THIS PHASE WILL RUN 100
 * TIMES, COLLECTING 100 SAMPLES THAT WILL BE USED TO CALCULATE THE AVERAGE
 * (MEAN) AND THE STANDARD DEVIATION WITH A HISTOGRAM DISPLAYED.
 * 
 * IT WILL ALSO TELL YOU WANT TYPE OF DISTRUBTION IT IS.>
 * 
 * <NASIR DESHIELDS JANUARY 30TH, 2024
 * 
 * POSTING MY NAME ABOVE INDICATES THAT I WROTE AND UNDERSTAND THE CODE
 * 
 */

public class Main {

	/**
	 * @param args
	 */

	public static Scanner scan = new Scanner(System.in);
	public static List<Integer> CompositeNumbers = new ArrayList<Integer>();
	public static List<Integer> FactorsSetA = new ArrayList<Integer>();
	public static List<Integer> FactorsSetB = new ArrayList<Integer>();
	public static String header = """
			COSC220 INSTRUCTOR: MR. FALLON

			                            <PRJ1_COPRIME_ANALYSIS>

			  <IN THIS PROJECT, WE ARE ALLOWING THE USER TO FIRST TEST OUT THE PROGRAM BY
			  ALLOWING THEM TO TYPE IN A NUMBER SO THAT IT CAN CHECK TO SEE IF IT IS A PRIME
			  NUMBER OR A COMPOSITE NUMBER. THIS WILL BE RUNNING IN A LOOP UNTIL THE USER TYPES
			  IN A NUMBER THAT IS LESS THAN TWO.

			  WHILE IN THE LOOP, THE USER WILL SEE A LIST OF FACTORS THAT A COMPOSITE NUMBER
			  HAVE IF THEY TYPE IN A COMPOSITE NUMBER.

			  ONCE THE VALUE OF THE NUMBER IS LESS THAN TWO, THE PROGRAM WILL HAVE A MOMENT TO REST
			  AND WILL PRINT OUT THE INSTRUCTIONS OF THE NEXT PHASE.

			  WHEN FINISHING PRINTING OUT THE NEXT PHASE, ALLOWING THE USER TO READ IT, IT WILL FIND
			  THE NUMBER OF COMPOSITE COPRIME PAIRS THAT EXIST BETWEEN 1 TO 100, DISPLAYING IT TO THE
			  SCREEN FOR THE USER TO SEE THE AMOUNT.

			  AFTER PHASE 2 IS COMPLETED, THE PROGRAM WILL PRINT OUT THE NEW INSTRUCTIONS FOR PHASE 3,
			  ALLOWING THE USER TO READ IT.

			  PHASE 3 WILL GO AND GENERATE 100 PAIRS OF 2 INTEGERS, KEEPING COUNT OF THE AMOUNT OF
			  COMPOSITE COPRIME PAIRS THAT OCCURED IN THE GENERATION. IT WILL PRINT OUT THE COUNT AND
			  THEN SAVED AS A SAMPLE. THIS PHASE WILL RUN 100 TIMES, COLLECTING 100 SAMPLES THAT WILL
			  BE USED TO CALCULATE THE AVERAGE (MEAN) AND THE STANDARD DEVIATION.

			  IT WILL ALSO TELL YOU WANT TYPE OF DISTRUBTION IT IS.>

			  <NASIR DESHIELDS JANUARY 30TH, 2024>

			  POSTING MY NAME ABOVE INDICATES THAT I WROTE AND UNDERSTAND THE CODE.
			""";

	public static String Phase1Instruction = """
			IN THIS PHASE, YOU WILL BE ABLE TO PROVIDE THE CONSOLE WITH ANY NUMBERS OF YOUR CHOOSING BUT THIS PHASE WILL
			NOT FINISH UNTIL YOU INPUT A VALUE THAT IS LESS THAN TWO. WHEN YOU TYPE IN A NUMBER, THE PROGRAM WILL TELL YOU
			IF IT IS A PRIME NUMBER OR A COMPOSITE NUMBER.
			""";

	public static String Phase2Instruction = """
			  IN THIS PHASE, YOU WILL SEE THE PROGRAM GENERATING THE FACTORS OF EACH COMPOSITE NUMBER. TAKE THE TIME TO
			  ALLOW THE PROGRAM TO GENERATE EVERYTHING. YOU WILL BE ABLE TO PROCEED TO THE NEXT PHASE AS SOON AS YOU
			  HAVE A CLEAR UNDERSTANDING OF THE FACTORS OF COMPOSITE NUMBERS.
			""";

	public static String Phase3Instruction = """
			  IN THIS PHASE, YOU WILL SEE A RANDOMLY GENERATED PAIR OF NUMBERS AND THEIR FACTORS. IF BOTH NUMBERS GREATER
			  COMMON FACTOR IS 1, IT WILL BE CONSIDERED AS A COPRIME NUMBER AND WILL BE COUNTED. THIS WILL RUN 100 TIMES
			  TO COLLECT SOME SAMPLES AND WE WILL USE THE SAMPLES TO COMPUTE AN AVERAGE (MEAN) AND THE STANDARD DEVIATION.
			""";

	
	/** 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		printHeader(header);
		separator();
		phase1(Phase1Instruction);
		separator();
		phase2(Phase2Instruction);
		separator();
		phase3(Phase3Instruction);
	}

	
	/** 
	 * @param h
	 * @throws InterruptedException
	 */
	public static void printHeader(String h) throws InterruptedException {
		for (int i = 0; i < h.length(); i++) {
			System.out.print(h.charAt(i));
			Thread.sleep(35);
		}
	}

	public static void separator() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	
	/** 
	 * @param p1
	 * @throws InterruptedException
	 */
	public static void phase1(String p1) throws InterruptedException {

		for (int i = 0; i < p1.length(); i++) {
			System.out.print(p1.charAt(i));
			Thread.sleep(35);
		}

		System.out.println("\nUser, Please enter a value >= 2 (Type in a value less than 2 to move on): ");
		int num = scan.nextInt();

		while (num >= 2) {

			if (isPrime(num)) {
				System.out.println(num + " is a prime number!");
			} else {
				System.out.println(num + " is a composite number!");
			}

			System.out.println("User, Please enter a value >= 2 (Type in a value less than 2 to move on): ");
			num = scan.nextInt();
		}
	}

	public static void phase2(String p2) throws InterruptedException {

		for (int i = 0; i < p2.length(); i++) {
			System.out.print(p2.charAt(i));
			Thread.sleep(35);
		}

		for (int j = 0; j < 5; j++) {
			System.out.println();
		}

		for (int k = 2; k <= 100; k++) {
			if (isPrime(k) == false) {
				CompositeNumbers.add(k);
				System.out.println("This number is a composite number: " + k);

				System.out.print("Here are the factors of the number, " + k + ": ");

				for (int l = 1; l <= k; l++) {
					if (k % l == 0)
						System.out.print(l + " ");
				}

				Thread.sleep(3000);
				System.out.println();

			}

		}

		System.out.print("\n\nThe List of Composite Numbers once again: ");
		for (int m : CompositeNumbers)
			System.out.print(m + " ");
	}

	public static void phase3(String p3) throws InterruptedException {

		for (int i = 0; i < p3.length(); i++) {
			System.out.print(p3.charAt(i));
			Thread.sleep(35);
		}

		Random rand = new Random();
		int SampleSize = 100;
		int[] Samples = new int[SampleSize];
		int count = 0;
		int GCF = 0;
		int PairAmount = 0;
		int a = 0;
		double sum = 0;
		double mean = 0;
		double DoS = 0;
		double standardDevitation = 0;

		while (a < 100) {
			while (PairAmount < 100) {
				int num1 = rand.nextInt(100) + 1;
				int num2 = rand.nextInt(100) + 1;

				System.out.print("Here are the factors of the number, " + num1 + ": ");

				for (int l = 1; l <= num1; l++) {
					if (num1 % l == 0) {
						System.out.print(l + " ");
						FactorsSetA.add(l);
					}
				}

				System.out.print("Here are the factors of the number, " + num2 + ": ");

				for (int l = 1; l <= num2; l++) {
					if (num2 % l == 0) {
						System.out.print(l + " ");
						FactorsSetB.add(l);
					}
				}

				System.out.println("\n");

				for (int i = 0; (i < FactorsSetA.size() && i < FactorsSetB.size()); i++) {
					if (FactorsSetA.get(i) == FactorsSetB.get(i)) {
						GCF = FactorsSetA.get(i);
					}
				}

				if (GCF == 1) {
					count++;
				}

				PairAmount++;

			}

			Samples[a] = count;
			a++;
			PairAmount = 0;
			count = 0;
			Thread.sleep(30);
		}

		for (int i : Samples)
			System.out.print(i + " ");

		for (int b = 0; b < SampleSize; b++) {
			sum += Samples[b];
		}

		mean = sum / SampleSize;

		for (int c = 0; c < SampleSize; c++) {
			DoS += Math.pow((Samples[c] - mean), 2);
		}

		double variance = DoS / (SampleSize - 1);

		standardDevitation = Math.sqrt(variance);

		System.out.println("\nMean: " + mean + "    Standard Devitation: " + standardDevitation);
	}

	public static boolean isPrime(int n) {

		boolean isPrimeFlag = true;

		if (n <= 1)
			isPrimeFlag = false;

		if (n >= 2) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					isPrimeFlag = false;
				else
					isPrimeFlag = true;
			}
		}

		return isPrimeFlag;
	}

}