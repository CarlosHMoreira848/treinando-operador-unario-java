import java.util.Scanner;
public class TreinandoUnario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa: Testando operador unário!... \n Para começar digite um número: ");
		int numero = entrada.nextInt();
		System.out.println("Veja o resultado do operador unário pós-fixado + um: " + numero++);
		numero = numero -1;
		System.out.println("Veja o resultado do operador unário pre-fixado + um: " + ++numero);
		System.out.println("Utilize o operador pos-fixado quando não precisar do resultado incrementado imediatadamente; \n utilize o operador pré-fixado quando precisar utilizar o resultado incrementado imediatamente! ;D ");
	}
}
