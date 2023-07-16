package com.thiagoDRangel.desafios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesafiosApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.print("Digite o valor do saque: ");
		double valor = scanner.nextDouble();

		int valorInteiro = (int) valor;
		int centavos = (int) Math.round((valor - valorInteiro) * 100);

		int[] notas = {100, 50, 20, 10, 5, 2};
		int[] moedas = {100, 50, 25, 10, 5, 1};

		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat decimalFormat = new DecimalFormat("#0.00", decimalFormatSymbols);

		System.out.println("NOTAS:");
		for (int nota : notas) {
			int quantidade = valorInteiro / nota;
			System.out.println(quantidade + " nota(s) de R$ " + decimalFormat.format(nota));
			valorInteiro %= nota;
		}

		System.out.println("MOEDAS:");
		for (int moeda : moedas) {
			int quantidade = centavos / moeda;
			System.out.println(quantidade + " moeda(s) de R$ " + decimalFormat.format(moeda / 100.0));
			centavos %= moeda;
		}
	}
}