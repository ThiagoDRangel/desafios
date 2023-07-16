package com.thiagoDRangel.desafios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesafiosApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de casos de teste: ");
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			System.out.print("Digite a frase " +  (i+1) + " para decifrar: ");
			String line = scanner.nextLine();
			String decipheredLine = decipherLine(line);
			System.out.println(decipheredLine);
		}

		scanner.close();
		System.exit(0);
	}
	private static String decipherLine(String line) {
		int length = line.length();
		int middle = length / 2;

		StringBuilder decipheredLine = new StringBuilder();

		for (int i = middle - 1; i >= 0; i--) {
			decipheredLine.append(line.charAt(i));
		}

		for (int i = length - 1; i >= middle; i--) {
			decipheredLine.append(line.charAt(i));
		}

		return decipheredLine.toString();
	}
}