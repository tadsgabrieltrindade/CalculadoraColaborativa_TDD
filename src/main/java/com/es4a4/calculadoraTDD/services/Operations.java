package com.es4a4.calculadoraTDD.services;

public class Operations {

	public static void adicao(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}

	public static void subtracao(int n1, int n2) {
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	}

	public static void divisao(int n1, int n2) {
		if (n2 != 0)
			System.out.println(n1 + " / " + n2 + " = " + (float) (n1 / n2));

	}

	public static void multiplicacao(int n1, int n2) {
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
	}

}
