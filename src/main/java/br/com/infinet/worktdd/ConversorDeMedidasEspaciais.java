package br.com.infinet.worktdd;

import java.text.DecimalFormat;

public class ConversorDeMedidasEspaciais {
	
	public double formatar(double valor) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		String stringResultado = formatar.format(valor);
		String[] part = stringResultado.split("[,]");
	    String stringResultadoNovo = part[0]+"."+part[1];
		
		return Double.parseDouble(stringResultadoNovo);
	}
	
	public double metrosParaCentimetros(double valorMetros) {
        return formatar(valorMetros * 100);
    }
	
    public double metrosParaJardas(double valorMetros) {
        return formatar(valorMetros * 1.094);
    }
    
    public double metrosParaPolegadas(double valorMetros) {
        return formatar(valorMetros * 39.37);
    }

    public double jardasParaMetros(double valorJardas) {
        return formatar(valorJardas * 0.9144);
    }
    
    public double jardasParaCentimetros(double valorJardas) {
        return formatar(valorJardas * 91.44);
    }
    
    public double jardasParaPolegadas(double valorJardas) {
        return formatar(valorJardas * 36);
    }
    
    public double centimetrosParaMetros(double valorCentimetro) {
        return formatar(valorCentimetro / 100);
    }

    public double centimetrosParaPolegadas(double valorCentimetro) {
        return formatar(valorCentimetro / 2.54);
    }
    
    public double centimetrosParaJardas(double valorCentimetro) {
        return formatar(valorCentimetro / 91.44);
    }
    
    public double polegadasParaMetros(double valorCentimetro) {
        return formatar(valorCentimetro / 39.37);
    }

    public double polegadasParaCentimetros(double valorCentimetro) {
        return formatar(valorCentimetro * 2.54);
    }
    
    public double polegadasParaJardas(double valorCentimetro) {
        return formatar(valorCentimetro / 36);
    }
}
