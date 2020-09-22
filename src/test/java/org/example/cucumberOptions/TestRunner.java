package org.example.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/example/features",
        glue = "org.example.stepDefinations",
        tags="@SmokeTest",
        plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"},
        monochrome = true,strict = true
        )
public class TestRunner  {

}
