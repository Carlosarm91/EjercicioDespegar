package com.carlos.app.Despegar.steps;

import com.carlos.app.Despegar.pageObjects.BuscarVuelo_pageObjects;

import net.thucydides.core.annotations.Step;

public class BuscarVuelo_steps {

	BuscarVuelo_pageObjects BuscarVuelo_pageObjects ;
	
	@Step
	public void ingreso_a_Navegador() throws Exception {
		 BuscarVuelo_pageObjects.open();
	}
	
	@Step
	public void ingresar_destino_fecha_y_cantidad_de_personas(String destino, String fecha, String adultos, String ninos) throws Exception {
		BuscarVuelo_pageObjects.inicio();
		BuscarVuelo_pageObjects.vuelos();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.ida();
		BuscarVuelo_pageObjects.destino(destino);
		BuscarVuelo_pageObjects.fecha(fecha);
		BuscarVuelo_pageObjects.menu();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.adultos(adultos);
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.ninos(ninos);
		BuscarVuelo_pageObjects.aplicar();
		Thread.sleep(800);
		BuscarVuelo_pageObjects.buscar();
		Thread.sleep(3000);
		BuscarVuelo_pageObjects.seguir();
		Thread.sleep(5000);
	}
	@Step
	public void validar_precio_mas_bajo(int precioEsperado) throws Exception {
		BuscarVuelo_pageObjects.validar();
		BuscarVuelo_pageObjects.compareMenor(precioEsperado);
	}
	@Step
	public void ingresar_destino_fecha_ida_fecha_vuelta_y_cantidad_de_personas(String destino, String fechaIda, String fechaVuelta, String adultos, String ninos) throws Exception {
		BuscarVuelo_pageObjects.inicio();
		BuscarVuelo_pageObjects.vuelos();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.idaVuelta();
		BuscarVuelo_pageObjects.destino(destino);
		BuscarVuelo_pageObjects.fecha(fechaIda);
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.fechaVuelta(fechaVuelta);
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.menu();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.adultos(adultos);
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.ninos(ninos);
		BuscarVuelo_pageObjects.aplicar();
		Thread.sleep(800);
		BuscarVuelo_pageObjects.buscar();
		Thread.sleep(3000);
		BuscarVuelo_pageObjects.seguir();
		Thread.sleep(5000);
	}
	@Step
	public void ingresar_destino_y_cantidad_de_personas(String destino, String adultos, String ninos) throws Exception {
		BuscarVuelo_pageObjects.inicio();
		BuscarVuelo_pageObjects.vuelos();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.ida();
		BuscarVuelo_pageObjects.destino(destino);
		BuscarVuelo_pageObjects.menu();
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.adultos(adultos);
		Thread.sleep(1000);
		BuscarVuelo_pageObjects.ninos(ninos);
		BuscarVuelo_pageObjects.aplicar();
		BuscarVuelo_pageObjects.noDecidi();
		BuscarVuelo_pageObjects.buscar();
		Thread.sleep(3000);
		BuscarVuelo_pageObjects.seguir();
		Thread.sleep(5000);
	}
	@Step
	public void validar_precio_mas_alto() throws Exception {
		 BuscarVuelo_pageObjects.validarAlto();
	}
	
}
