package br.com.infinet.worktdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConversaoDeTemperaturasTest {
	
	@InjectMocks
	private ConversaoDeTemperaturas conversao;
	
	private double tempCelsius;
	private double tempFahrenheit;
	private double tempKelvin;
	
	@Test
	@DisplayName("Formata um valor double para 2 casas decimais")
	void formatarDouble() {
		double valor = 2.5;
		double formatado = conversao.formatar(valor);
		assertEquals(2.50, formatado);
	}
	
    @Test
    @DisplayName("deve converter temperatura de Celsius para Fahrenheit")
    void testaCelsiusparaFahrenheit() {
        tempCelsius = 30.0;
        double celsiusToFahrenheit = conversao.celsiusToFahrenheit(tempCelsius);
        assertEquals(86.0, celsiusToFahrenheit);
    }

    @Test
    @DisplayName("deve converter temperatura de Celsius para Kelvin")
    void testaCelsiusParaKelvin() {
        tempCelsius = 0;
        double celsiusToKelvin = conversao.celsiusToKelvin(tempCelsius);
        assertEquals(273.15, celsiusToKelvin);
    }
    
    @Test
    @DisplayName("deve converter temperatura de Fahrenheit para Celsius")
    void testaFahreheitParaCelsius() {
        tempFahrenheit = 90;
        double fahrenheitToCelsius = conversao.fahrenheitToCelsius(tempFahrenheit);
        assertEquals(32.22, fahrenheitToCelsius);
    }

    @Test
    @DisplayName("deve converter temperatura de Fahrenheit para Kelvin")
    void testaFahrenheitParaKelvin() {
        tempFahrenheit = 32;
        double fahrenheitToKelvin = conversao.fahrenheitToKelvin(tempFahrenheit);
        assertEquals(273.15, fahrenheitToKelvin);
    }

    @Test
    @DisplayName("deve converter temperatura de Kelvin para Fahrenheit")
    void testaKelvinParaFahrenheit() {
        tempKelvin = 0;
        double kelvinToFahrenheit = conversao.kelvinToFahrenheit(tempKelvin);
        assertEquals(-459.67, kelvinToFahrenheit);
    }

    @Test
    @DisplayName("deve converter temperatura de Kelvin para Celsius")
    void testaKelvinParaCelsius() {
        tempKelvin = 0;
        double kelvinToCelsius = conversao.kelvinToCelsius(tempKelvin);
        assertEquals(-273.15, kelvinToCelsius);
    }

}
