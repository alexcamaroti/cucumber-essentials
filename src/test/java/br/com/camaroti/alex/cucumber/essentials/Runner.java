package br.com.camaroti.alex.cucumber.essentials;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "junit",
		stepNotifications = true,
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)
public class Runner {

}
