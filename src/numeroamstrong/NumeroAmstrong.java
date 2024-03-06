package numeroamstrong;

import java.util.Scanner;

public class NumeroAmstrong {

	public static void main(String[] args) {

		Scanner numero1 = new Scanner(System.in);

		System.out.println("Introducir numero a evaluar");
		int numero = numero1.nextInt();

		int suma = 0;
		int numeroOriginal = numero;
		int potencia;

		potencia = (int) Math.log10(numero) + 1;

		do {
			int ultimoNumero = numero % 10;

			suma = suma + (int) Math.pow(ultimoNumero, potencia);

			numero = (int) Math.floor(numero / 10);

		} while (numero > 0);

		if (numeroOriginal == suma) {
			System.out.println(numeroOriginal + " es un numero de Armstrong");
		} else {
			System.out.println(numeroOriginal + " no es un numero de Armstrong");
		}

	}

}
