package com.carlos.app.Despegar.definitions;

import com.carlos.app.Despegar.steps.BuscarVuelo_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuscarVuelo_definitions {

	@Steps
	BuscarVuelo_steps BuscarVuelo_steps;
	
	@Given("^Ingreso a Navegador$")
	public void ingreso_a_Navegador() throws Exception {
	 BuscarVuelo_steps.ingreso_a_Navegador();
	}
	@When("^Ingresar destino fecha y cantidad de personas \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_destino_fecha_y_cantidad_de_personas(String destino, String fecha, String adultos, String ninos) throws Exception {
		BuscarVuelo_steps.ingresar_destino_fecha_y_cantidad_de_personas(destino, fecha, adultos, ninos);
	}
	@Then("^Validar precio mas bajo(\\d+)$")
	public void validar_precio_mas_bajo(int precioEsperado) throws Exception {
		BuscarVuelo_steps.validar_precio_mas_bajo(precioEsperado);
	}
	@When("^Ingresar destino fecha ida fecha vuelta y cantidad de personas \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_destino_fecha_ida_fecha_vuelta_y_cantidad_de_personas(String destino, String fechaIda, String fechaVuelta, String adultos, String ninos) throws Exception {
		BuscarVuelo_steps.ingresar_destino_fecha_ida_fecha_vuelta_y_cantidad_de_personas(destino, fechaIda, fechaVuelta, adultos, ninos);
	}
	@When("^Ingresar destino y cantidad de personas \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_destino_y_cantidad_de_personas(String destino, String adultos, String ninos) throws Exception {
		BuscarVuelo_steps.ingresar_destino_y_cantidad_de_personas(destino, adultos, ninos);
	}
	@Then("^Validar precio mas alto$")
	public void validar_precio_mas_alto() throws Exception {
		BuscarVuelo_steps.validar_precio_mas_alto();
	}
}
