package testingTime;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

        @RunWith(Cucumber.class)
        @CucumberOptions(
                features = "C:\\Java\\workspace\\SDET-New\\GoFundBDD\\features",
                glue = "stepDefinitions")


public class myTestRunner {
}
