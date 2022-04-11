package br.uern.exemplo.fatorial;

public class Fatorial {
	public static void main(String args[]) {
		Fatorial pp = new Fatorial();
		int number;
		int fact = 1;
		int argsLength = args.length;
	if(argsLength==1) {
		number = Integer.parseInt(args[0]);
	for(int count=1;count<=number;count++) {
		fact = fact*count;
}
	System.out.println("Fatorial de "+number+" eh: "+fact);
}
	else if(argsLength>1) {
		System.out.println("Mais de um numero foi utilizado...");
}
	else {
		System.out.println("Nenhum argumento foi enviado...");
}
}

}
