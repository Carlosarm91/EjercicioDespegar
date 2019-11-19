package com.carlos.app.Despegar.pageObjects;

import org.openqa.selenium.By;
import com.carlos.app.Despegar.Utilidades.edades;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co")
public class BuscarVuelo_pageObjects extends PageObject {
	String mes = "";
	String dia = "";
	String mes2 = "";
	String dia2= "";
	String value = "";
	int menor = 0, valor = 0, mayor = 0, click=0;
	String txt_inicio = "//*[@id=\"incentive-login\"]/i[2]";
	String txt_vuelos = "//div[@class='header-navigation -first']//li[2]";
	String txt_ida = "//span[2]//label[1]//i[1]";
	String txt_destino = "/html[1]/body[1]/div[12]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	String txt_selectDestino = "/html/body/div[18]/div/div[1]/ul/li[1]";
	String txt_calendario = "//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']";
	String txt_calendario2 = "//input[@placeholder='Vuelta']";
	String txt_11 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[1]";
	String txt_12 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[2]";
	String txt_01 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[3]";
	String txt_02 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[4]";
	String txt_03 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[5]";
	String txt_04 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[6]";
	String txt_05 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[7]";
	String txt_06 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[8]";
	String txt_07 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[9]";
	String txt_08 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[10]";
	String txt_09 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[11]";
	String txt_10 = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[12]";
	String txt_dia = "/html[1]/body[1]/div[4]/div[1]/div[5]/div[";
	String txt_dia2 = "/html[1]/body[1]/div[4]/div[1]/div[5]/div[";
	String txt_menu = "/html[1]/body[1]/div[12]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[2]/input[1]";
	String txt_adultos = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]";
	String txt_ninos = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[2]";
	String txt_edad1 = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[";
	String txt_edad2 = "]/div[2]/div[1]/div[1]/select[1]";
	String txt_aplicar = "/html[1]/body[1]/div[3]/div[1]/div[2]/a[1]";
	String txt_buscar = "//div[@class='sbox-button -ml3-l -mt5-l']//div[@class='sbox-button-container'] ";
	String txt_seguir = "//*[@id='dreck-wrongcountry-modal']/div[2]/div/a[2]/em";
	String txt_precio1 = "//airlines-matrix-airline[1]//ul[1]//li[2]";
	String txt_precio2 = "//airlines-matrix-airline[2]//ul[1]//li[2]";
	String txt_precio3 = "//airlines-matrix-airline[3]//ul[1]//li[2]";
	String txt_precio4 = "//ul[contains(@class,'matrix-airline matrix-airline-4 column-visible-last')]//li[2]";
	String txt_click = "//i[contains(@class,'nav-slider-icon eva-3-icon-arrow-right')]";
	String txt_NoDecidir = "//i[@class='checkbox-check sbox-3-icon-checkmark -mr1 sbox-ui-icon']";
	String txt_IdaVuelta = "//span[@class='sbox-3-radio -md sbox-radio-button']//i[@class='radio-circle sbox-radio-circle']";
	String txt_flecha = "//div[@class='_dpmg2--controls-next']//i[@class='_dpmg2--icon-ico-arrow']";
	String txt_flechaPrev = "//div[@class='_dpmg2--controls-prev']";

	public void inicio() {
		find(By.xpath(txt_inicio)).click();
	}

	public void vuelos() {
		find(By.xpath(txt_vuelos)).click();
	}

	public void ida() {
		find(By.xpath(txt_ida)).click();
	}

	public void destino(String destino) throws Exception {
		find(By.xpath(txt_destino)).clear();
		find(By.xpath(txt_destino)).sendKeys(destino);
		find(By.xpath(txt_selectDestino)).click();
	}

	public void fecha(String fecha) throws Exception {
		mes = fecha.substring(5, 7);
		dia = fecha.substring(8, 10);
		find(By.xpath(txt_calendario)).click();
		Thread.sleep(3000);
		switch (mes) {
		case "11":
			txt_dia += "1" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "12":
			txt_dia += "2" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "01":
			click=1;
			find(By.xpath(txt_flecha)).click();
			txt_dia += "3" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "02":
			click=2;
			for (int i=0;i<2;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "4" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "03":
			click=3;
			for (int i=0;i<3;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "5" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "04":
			click=4;
			for (int i=0;i<4;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "6" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "05":
			click=5;
			for (int i=0;i<5;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "7" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "06":
			click=6;
			for (int i=0;i<6;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "8" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "07":
			click=7;
			for (int i=0;i<7;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "9" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "08":
			click=8;
			for (int i=0;i<8;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "10" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		case "09":
			click=9;
			for (int i=0;i<9;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia += "11" + "]/div[4]/span[" + dia + "]";
			find(By.xpath(txt_dia)).click();
			break;
		}
	}

	public void menu() {
		find(By.xpath(txt_menu)).click();
	}

	public void adultos(String adultos) {
		int adulto = Integer.parseInt(adultos);
		for (int i = 1; i < adulto; i++) {
			find(By.xpath(txt_adultos)).click();
		}
	}

	public void ninos(String ninos) {
		int nino = Integer.parseInt(ninos);
		for (int i = 0; i < nino; i++) {
			find(By.xpath(txt_ninos)).click();
		}
		for (int i = 1; i <= nino; i++) {
			edades edad = new edades();
			String loquesea = edad.edad();
			String age = "";
			age += txt_edad1 + i + txt_edad2;
			find(By.xpath(age)).selectByVisibleText(loquesea);
		}
	}

	public void aplicar() {
		find(By.xpath(txt_aplicar)).click();
	}

	public void buscar() {
		find(By.xpath(txt_buscar)).click();
	}

	public void seguir() {
		find(By.xpath(txt_seguir)).click();
	}

	public void validar() {
		value = find(By.xpath(txt_precio1)).getText();
		if(value.isEmpty()){			
				valor=0;
				menor=0;
			}else {				
			value = value.substring(1, value.length());
			value = value.replace(".", "");
			valor = Integer.parseInt(value);
			menor = valor;
			System.out.println(valor);
			}
		while (find(By.xpath(txt_click)).isVisible()) {
			value = find(By.xpath(txt_precio1)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
				find(By.xpath(txt_click)).click();
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor < menor)
					menor = valor;
				find(By.xpath(txt_click)).click();
			}

		}
		if (find(By.xpath(txt_precio2)).isVisible()) {
			value = find(By.xpath(txt_precio2)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor < menor)
					menor = valor;
			}
		}
		if (find(By.xpath(txt_precio3)).isVisible()) {
			value = find(By.xpath(txt_precio3)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor < menor)
					menor = valor;
			}
		}
		if (find(By.xpath(txt_precio4)).isVisible()) {
			value = find(By.xpath(txt_precio4)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor < menor)
					menor = valor;
			}
		}
		System.out.println("El precio menor entre las distintas opciones es: $" + menor);
	}

	public void noDecidi() {
		find(By.xpath(txt_NoDecidir)).click();
	}

	public void validarAlto() {
		value = find(By.xpath(txt_precio1)).getText();
		if(value.isEmpty()){			
				valor=0;
				mayor=0;
			}else {				
			value = value.substring(1, value.length());
			value = value.replace(".", "");
			valor = Integer.parseInt(value);
			mayor = valor;
			System.out.println(valor);
			}
		while (find(By.xpath(txt_click)).isVisible()) {
			value = find(By.xpath(txt_precio1)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
				find(By.xpath(txt_click)).click();
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor > mayor)
					mayor = valor;
				find(By.xpath(txt_click)).click();
			}

		}
		if (find(By.xpath(txt_precio2)).isVisible()) {
			value = find(By.xpath(txt_precio2)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor > mayor)
					mayor = valor;
			}
		}
		if (find(By.xpath(txt_precio3)).isVisible()) {
			value = find(By.xpath(txt_precio3)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor > mayor)
					mayor = valor;
			}
		}
		if (find(By.xpath(txt_precio4)).isVisible()) {
			value = find(By.xpath(txt_precio4)).getText();
			if (value.isEmpty()) {
				valor = 0;
				System.out.println(valor);
			} else {
				value = value.replace(".", "");
				value = value.substring(1, value.length());
				valor = Integer.parseInt(value);
				System.out.println(valor);
				if (valor > mayor)
					mayor = valor;
			}
		}
		System.out.println("El precio mayor entre las distintas opciones es: $" + mayor);
	}
	
	public void idaVuelta() {
		find(By.xpath(txt_IdaVuelta)).click();
	}

	public void fechaVuelta(String fechaVuelta) throws InterruptedException {
		for (int i=0;i<click;i++) {
			System.out.println("Entre aL FOR "+i);
			find(By.xpath(txt_flechaPrev)).click();
		}
		mes2 = fechaVuelta.substring(5, 7);
		dia2 = fechaVuelta.substring(8, 10);
		Thread.sleep(3000);
		switch (mes2) {
		case "11":
			txt_dia2 += "1" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "12":
			txt_dia2 += "2" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "01":
			find(By.xpath(txt_flecha)).click();
			txt_dia2 += "3" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "02":
			for (int i=0;i<2;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "4" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "03":
			for (int i=0;i<3;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "5" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "04":
			for (int i=0;i<4;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "6" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "05":
			for (int i=0;i<5;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "7" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "06":
			for (int i=0;i<6;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "8" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "07":
			for (int i=0;i<7;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "9" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "08":
			for (int i=0;i<8;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "10" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		case "09":
			for (int i=0;i<9;i++) {
				find(By.xpath(txt_flecha)).click();
			}
			txt_dia2 += "11" + "]/div[4]/span[" + dia2 + "]";
			find(By.xpath(txt_dia2)).click();
			break;
		}
	}
	public void compareMenor (int precioEsperado) {
		Assert.assertEquals(precioEsperado, menor);
	}
}
