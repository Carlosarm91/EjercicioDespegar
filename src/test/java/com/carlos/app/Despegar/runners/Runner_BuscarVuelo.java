package com.carlos.app.Despegar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/features/buscarVuelo.feature", glue= {"com.carlos.app.Despegar"},tags= {"@tag2"})
public class Runner_BuscarVuelo {

}
