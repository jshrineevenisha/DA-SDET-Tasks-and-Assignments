package Stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Feature\\HexaOHRM.feature"
,glue = "Stepdef",plugin = "html:target/cucumber.html"
)
public class TestRunner {

}
