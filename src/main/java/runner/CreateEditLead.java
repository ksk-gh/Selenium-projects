package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature/createeditlead.feature",glue={"pages","steps"},tags={"@Smoke","@Sanity"})
public class CreateEditLead {

}
