package Step_Definition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Taiwo on 15/07/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty","html:target/cucumber","json:target/cucumber-report.json"}
                  ,features = "src/test/java/Feature"
                  ,glue = {"Step_Definition"}
                  ,tags = {"@wip"})


public class RunnerClass {


}
