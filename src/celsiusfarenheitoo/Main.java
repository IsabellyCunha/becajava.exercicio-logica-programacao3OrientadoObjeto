package celsiusfarenheitoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leitor de variáveis
		Scanner leitor = new Scanner(System.in);
		
		//Criação de objeto para manipulação da classe Temperatura
		Temperatura temperatura = new Temperatura();
		
		//Inserção do dado graus em farenheit na variavel importada da classe Temperatura
		System.out.print("Digite os graus em farenheit para converter para celsius: ");
		temperatura.graus = leitor.nextDouble();
		
		//Chamando o método de conversão de Celsius para Farenheit da classe Temperatura
		temperatura.celsiusFarenheit();
		
		//Inserção do dado graus em Celsius na variavel importada da classe Temperatura
		System.out.print("Digite os graus em celsius para converter para farenheit: ");
		temperatura.graus = leitor.nextDouble();
		
		//Chamando o método de conversão de Farenheit para Celsius da classe Temperatura
		temperatura.farenheitCelsius();
	}

}
