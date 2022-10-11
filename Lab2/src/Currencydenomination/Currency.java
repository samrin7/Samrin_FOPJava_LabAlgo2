package Currencydenomination;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Currency {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {

			System.out.println("Enter the size of currency denomination");
			int size = s.nextInt();
			Integer[] denominations = new Integer[size];

			System.out.println("Enter the currency denominations value");

			for (int i = 0; i < size; i++) {
				denominations[i] = s.nextInt();
			}

			Arrays.sort(denominations, Collections.reverseOrder());
			for (int i = 0; i < denominations.length - 1; i++) {

				for (int j = 0; j < denominations.length - 1; j++) {
					if (denominations[j] < denominations[j + 1]) {
						int temp = denominations[j];
						denominations[j] = denominations[j + 1];
						denominations[j + 1] = temp;
					}
				}
			}
			System.out.println("enter the amount you want to pay");
			int amount = s.nextInt();
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < size; i++) {

				System.out.println(denominations[i] + " :" + (amount / denominations[i]));
				amount = amount % denominations[i];

			}

		}

	}
}
