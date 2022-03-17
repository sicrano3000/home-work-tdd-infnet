package br.com.infinet.worktdd;

import java.text.DecimalFormat;

public class ConversaoDeTemperaturas {

	public double formatar(double valor) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		String stringResultado = formatar.format(valor);
		String[] part = stringResultado.split("[,]");
	    String stringResultadoNovo = part[0]+"."+part[1];
		
		return Double.parseDouble(stringResultadoNovo);
	}
	
    public double celsiusToFahrenheit(double tempCelsius) {
        return formatar((tempCelsius * 9 / 5) + 32);
    }
    
    public double celsiusToKelvin(double tempCelsius) {
    	return formatar(tempCelsius + 273.15);
    }

    public double fahrenheitToCelsius(double tempFahrenheit) {
        return formatar((tempFahrenheit - 32.0) * 5 / 9);
    }

    public double fahrenheitToKelvin(double tempFahrenheit) {
        return formatar((tempFahrenheit - 32) * 5/9 + 273.15);
    }

    public double kelvinToFahrenheit(double tempKelvin) {
        return formatar((tempKelvin - 273.15) * 9/5 + 32);
    }

    public double kelvinToCelsius(double tempKelvin) {
        return formatar(tempKelvin - 273.15);
    }
}
