package celsiusfarenheitoo;

public class Temperatura {
	double graus = 0, celsiusFarenheit = 0, farenheitCelsius = 0;
	
	public void celsiusFarenheit() {
		celsiusFarenheit = ((graus - 32) /1.8);
		System.out.print(graus +"° farenheit correspondem a: " + celsiusFarenheit + "° celsius!\n\n");
	}
	
	public void farenheitCelsius() {
		farenheitCelsius = (graus * 1.8) + 32;
		System.out.print(graus +"° celsius correspondem a: " + farenheitCelsius + "° farenheit!");
	}
	
}
