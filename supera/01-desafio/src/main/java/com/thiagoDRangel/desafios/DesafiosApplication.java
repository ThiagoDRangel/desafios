package com.thiagoDRangel.desafios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiosApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de números que deseja ordenar: ");
		int N = scanner.nextInt();

		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o valor da entrada " + (i + 1) + ": ");
			int valor = scanner.nextInt();
			if (valor % 2 == 0) { // Valor par
				pares.add(valor);
			} else { // Valor ímpar
				impares.add(valor);
			}
		}

		// Ordenar os valores pares em ordem crescente
		Collections.sort(pares);

		// Ordenar os valores ímpares em ordem decrescente
		Collections.sort(impares, Comparator.reverseOrder());

		// Imprimir os valores na ordem desejada
		System.out.println("Valores ordenados:");
		for (int valor : pares) {
			System.out.println(valor);
		}
		for (int valor : impares) {
			System.out.println(valor);
		}
	}
}