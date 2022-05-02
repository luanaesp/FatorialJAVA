package br.com.espinola.luana.fatorial;

import java.math.BigInteger;

public class Fatorial {
	public static void main(String args[]) {
		//Fatorial pp = new Fatorial();
		BigInteger numero;
		BigInteger fact = BigInteger.ONE;
		int argsLength = args.length;
		if (argsLength == 1) {
			numero = new BigInteger(args[0]);
			for (BigInteger count = new BigInteger("1"); count.compareTo(numero) <= 0; count.add(BigInteger.ONE)) {
				fact = fact.multiply(count);
			}
			System.out.println("Fatorial de " + numero + " eh: " + fact);
		} else if (argsLength > 1) {
			System.out.println("Mais de um numero foi utilizado...");
		} else {
			System.out.println("Nenhum argumento foi enviado...");
		}
	}

}
