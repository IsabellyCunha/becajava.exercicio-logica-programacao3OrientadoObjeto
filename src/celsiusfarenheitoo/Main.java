package celsiusfarenheitoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leitor de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		//Cria��o de objeto para manipula��o da classe Temperatura
		Temperatura temperatura = new Temperatura();
		
		//Inser��o do dado graus em farenheit na variavel importada da classe Temperatura
		System.out.print("Digite os graus em farenheit para converter para celsius: ");
		temperatura.graus = leitor.nextDouble();
		
		//Chamando o m�todo de convers�o de Celsius para Farenheit da classe Temperatura
		temperatura.celsiusFarenheit();
		
		//Inser��o do dado graus em Celsius na variavel importada da classe Temperatura
		System.out.print("Digite os graus em celsius para converter para farenheit: ");
		temperatura.graus = leitor.nextDouble();
		
		//Chamando o m�todo de convers�o de Farenheit para Celsius da classe Temperatura
		temperatura.farenheitCelsius();
	}

}
