package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src\\main\\java\\features\\"},
        dryRun = !true,//it will execute login features code
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,//remove junk characters
        glue = {"steps","hooks"}, //where the step definitions are
        plugin = {"pretty", "html:reports/reports.html", "json:reports/result.json", "junit:reports/result.xml"}
        //tags = "not @smoke"
)
public class Runner extends AbstractTestNGCucumberTests {

}
