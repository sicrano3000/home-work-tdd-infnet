package br.com.infinet.worktdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConversaoDeMedidasEspaciaisTest {
	
	@InjectMocks
	private ConversorDeMedidasEspaciais conversorDeMedidasEspaciais;
	
	private double valorMetros;
	private double valorCentimetros;
	private double valorJardas;
	private double valorPolegadas;
	
	@Test
	@DisplayName("Formata um valor double para 2 casas decimais")
	void formatarDouble() {
		double valor = 2.5;
		double formatado = conversorDeMedidasEspaciais.formatar(valor);
		assertEquals(2.50, formatado);
	}

    @Test
    @DisplayName("Deve converter metros para jardas")
    void converteMetrosParaJardas() {
        valorMetros = 2;
        double metrosParaJardas = conversorDeMedidasEspaciais.metrosParaJardas(valorMetros);
        assertEquals(2.19, metrosParaJardas);
    }

    @Test
    @DisplayName("Deve converter metros para centimetros")
    void converteMetrosParaCentimetros() {
    	valorMetros = 2;
        double metrosParaCentimetros = conversorDeMedidasEspaciais.metrosParaCentimetros(valorMetros);
        assertEquals(200.0, metrosParaCentimetros);
    }
    
    @Test
    @DisplayName("Deve converter metros para polegadas")
    void converteMetrosParaPolegadas() {
    	valorMetros = 2;
        double metrosParaPolegadas = conversorDeMedidasEspaciais.metrosParaPolegadas(valorMetros);
        assertEquals(78.74, metrosParaPolegadas);
    }
    
    @Test
    @DisplayName("Deve converter jardas para metros")
    void converteJardasParaMetros() {
        valorJardas = 2;
        double jardasParaMetros = conversorDeMedidasEspaciais.jardasParaMetros(valorJardas);
        assertEquals(1.83, jardasParaMetros);
    }
    
    @Test
    @DisplayName("Deve converter jardas para Centimetros")
    void converteJardasParaCentimetros() {
    	valorJardas = 2;
        double jardasParaCentimetros = conversorDeMedidasEspaciais.jardasParaCentimetros(valorJardas);
        assertEquals(182.88, jardasParaCentimetros);
    }
    
    @Test
    @DisplayName("Deve converter jardas para polgadas")
    void converteJardasParaPolegadas() {
    	valorJardas = 2;
        double jardasParaPolegadas = conversorDeMedidasEspaciais.jardasParaPolegadas(valorJardas);
        assertEquals(72.0, jardasParaPolegadas);
    }
    
    @Test
    @DisplayName("Deve converter centimetros para polegadas")
    void converteCentimetrosParaPolegadas() {
        valorCentimetros = 1;
        double centimetrosParaPolegadas = conversorDeMedidasEspaciais.centimetrosParaPolegadas(valorCentimetros);
        assertEquals(0.39, centimetrosParaPolegadas);
    }
    
    @Test
    @DisplayName("Deve converter centimetros para metros")
    void converteCentimetrosParaMetros() {
    	valorCentimetros = 1;
        double centimetrosParaMetros = conversorDeMedidasEspaciais.centimetrosParaMetros(valorCentimetros);
        assertEquals(0.01, centimetrosParaMetros);
    }
    
    @Test
    @DisplayName("Deve converter centimetros para jardas")
    void converteCentimetrosParaJardas() {
    	valorCentimetros = 1;
        double centimetrosParaJardas = conversorDeMedidasEspaciais.centimetrosParaJardas(valorCentimetros);
        assertEquals(0.01, centimetrosParaJardas);
    }
    
    @Test
    @DisplayName("Deve converter polegadas para metros")
    void polegadasParaMetros() {
    	valorPolegadas = 1;
        double polegadasParaMetros = conversorDeMedidasEspaciais.polegadasParaMetros(valorPolegadas);
        assertEquals(0.03, polegadasParaMetros);
    }

    @Test
    @DisplayName("Deve converter polegadas para centimetros")
    void polegadasParaCentimetros() {
    	valorPolegadas = 1;
        double polegadasParaCentimetros = conversorDeMedidasEspaciais.polegadasParaCentimetros(valorPolegadas);
        assertEquals(2.54, polegadasParaCentimetros);
    }
    
    @Test
    @DisplayName("Deve converter polegadas para jardas")
    void polegadasParaJardas() {
    	valorPolegadas = 1;
        double polegadasParaJardas = conversorDeMedidasEspaciais.polegadasParaJardas(valorPolegadas);
        assertEquals(0.03, polegadasParaJardas);
    }
}
