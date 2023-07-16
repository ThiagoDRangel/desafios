package com.thiagoDRangel.desafios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesafiosApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o tamanho do array e o valor alvo (n k): ");
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Digite os elementos do array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int count = countPairsWithDiffK(arr, k);
		System.out.println("Números pares que satisfazem o critério: " + count);
	}

	private static int countPairsWithDiffK(int[] arr, int k) {
		Set<Integer> numbers = new HashSet<>();
		int count = 0;

		for (int num : arr) {
			if (numbers.contains(num - k)) {
				count++;
			}
			if (numbers.contains(num + k)) {
				count++;
			}
			numbers.add(num);
		}

		return count;
	}
}
